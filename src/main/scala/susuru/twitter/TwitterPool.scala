package susuru.twitter

import java.util.concurrent.TimeUnit

import org.slf4j.LoggerFactory
import susuru.core._
import susuru.twitter.wrapper.TwitterWrapper
import twitter4j.{Twitter, TwitterResponse}

object TwitterPool {
  private var pool: TwitterPool = null

  def singleton(refresh: Set[Long] => Map[Long, Twitter], invalidate: Twitter => Unit, interval: Long = 300000): Unit = this.synchronized {
    if (pool == null) {
      pool = new TwitterPool(refresh, invalidate, interval)
    }
  }

  def getInstance(): Twitter = this.synchronized {
    if (pool != null) {
      new TwitterWrapper(pool)
    } else {
      throw new InstantiationException("Instance of TwitterPool are not created yet.")
    }
  }

  def getInstance(id: Long): Twitter = this.synchronized {
    if (pool != null) {
      new TwitterWrapper(id, pool)
    } else {
      throw new InstantiationException("Instance of TwitterPool are not created yet.")
    }
  }
}

private class TwitterPool(refresh: Set[Long] => Map[Long, Twitter], _invalidate: Twitter => Unit, interval: Long) extends Pool[Twitter, TwitterResponse] {

  private var states: Map[String, State[Twitter]] = Map.empty
  private var lastRefreshedTimes: Map[String, Long] = Map.empty
  private val logger = LoggerFactory.getLogger(this.getClass)

  private def refreshOnDemand(family: String, at: Long = System.currentTimeMillis()): Unit = {
    if (lastRefreshedTimes.getOrElse(family, 0L) + interval < at) {
      logger.trace(s"Refresh state: Before($family): ${lastRefreshedTimes.get(family)}, After: $at")
      val newState = states.getOrElse(family, new StateCollection[Twitter]())
      states = states.updated(family, newState.add(refresh(newState.idSet)))
      lastRefreshedTimes = lastRefreshedTimes.updated(family, at)
    }
  }

  override def leaseAny(family: String): Twitter = states.synchronized {
    val at: Long = System.currentTimeMillis()
    refreshOnDemand(family, at)
    states.getOrElse(family, new StateCollection[Twitter]()).leaseAny(at) match {
      case (Lease(twitter), newState) =>
        logger.trace(s"Twitter available($family): $twitter")
        states = states.updated(family, newState)
        twitter.body
      case (Wait(until), newState) =>
        logger.trace(s"Twitter unavailable($family): wait until $until from now $at epoch time in milliseconds")
        states = states.updated(family, newState)
        TimeUnit.MILLISECONDS.sleep(until - at)
        leaseAny(family)
      case (response, newState) =>
        states = states.updated(family, newState)
        throw new IllegalStateException(states.toString())
    }
  }

  override def leaseSome(family: String, id: Long): Twitter = states.synchronized {
    val at: Long = System.currentTimeMillis()
    refreshOnDemand(family, at)
    states.getOrElse(family, new StateCollection[Twitter]()).leaseSome(id, at) match {
      case (Lease(twitter), newState) =>
        logger.trace(s"Twitter available($family): $twitter")
        states = states.updated(family, newState)
        twitter.body
      case (Wait(until), newState) =>
        logger.trace(s"Twitter unavailable($family): wait until $until from now $at epoch time in milliseconds")
        states = states.updated(family, newState)
        TimeUnit.MILLISECONDS.sleep(until - at)
        leaseSome(family, id)
      case (WaitNotify(twitter), newState) =>
        logger.trace(s"Twitter unavailable($family): wait notify for Twitter: ${twitter.hashCode()}")
        states = states.updated(family, newState)
        twitter.synchronized(twitter.wait())
        leaseSome(family, id)
      case (response, newState) =>
        states = states.updated(family, newState)
        throw new IllegalStateException(states.toString())
    }
  }

  override def release(family: String, id: Long, twitter: Twitter, response: TwitterResponse): Unit = states.synchronized {
    val resource = Option(response.getRateLimitStatus).map { limit =>
      logger.trace(s"Release twitter($family): TwitterResponse.getRateLimitStatus -> $limit")
      Resource(id, limit.getRemaining, limit.getResetTimeInSeconds.toLong * 1000 + 1000, twitter)
    }
    states.get(family) match {
      case Some(state) =>
        states = states.updated(family, state.release(id, resource))
      case None =>
        throw new IllegalStateException(states.toString())
    }
    twitter.synchronized(twitter.notify())
  }

  override def invalidate(resource: Twitter): Unit = {
    this._invalidate(resource)
  }
}
