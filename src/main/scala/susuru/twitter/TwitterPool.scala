package susuru.twitter

import java.util.concurrent.TimeUnit

import org.slf4j.LoggerFactory
import susuru.core._
import susuru.twitter.wrapper.TwitterWrapper
import twitter4j.{Twitter, TwitterResponse}

object TwitterPool {
  private var pool: TwitterPool = null

  def singleton(refresh: Set[Long] => Map[Long, Twitter], interval: Long = 300000): Unit = this.synchronized {
    if (pool == null) {
      pool = new TwitterPool(refresh, interval)
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

private class TwitterPool(refresh: Set[Long] => Map[Long, Twitter], interval: Long) extends Pool[Twitter, TwitterResponse] {

  private var state: State[Twitter] = new StateCollection[Twitter]()
  private var lastRefreshedTime: Long = 0L
  private val logger = LoggerFactory.getLogger(this.getClass)

  private def refreshOnDemand(at: Long = System.currentTimeMillis()): Unit = {
    if (lastRefreshedTime + interval < at) {
      logger.trace("Refresh state: Before: {}, After: {}", lastRefreshedTime, at)
      state = state.add(refresh(state.idSet))
      lastRefreshedTime = at
    }
  }

  override def leaseAny(): Twitter = state.synchronized {
    val at: Long = System.currentTimeMillis()
    refreshOnDemand(at)
    state.leaseAny(at) match {
      case (Lease(twitter), newState) =>
        logger.trace("Twitter available: {}", twitter)
        state = newState
        twitter.body
      case (Wait(until), newState) =>
        logger.trace("Twitter unavailable: wait until {} from now {} epoch time in milliseconds", until, at)
        state = newState
        TimeUnit.MILLISECONDS.sleep(until - at)
        leaseAny()
      case (response, newState) =>
        state = newState
        throw new IllegalStateException(state.toString)
    }
  }

  override def leaseSome(id: Long): Twitter = state.synchronized {
    val at: Long = System.currentTimeMillis()
    refreshOnDemand(at)
    state.leaseSome(id, at) match {
      case (Lease(twitter), newState) =>
        logger.trace("Twitter available: {}", twitter)
        state = newState
        twitter.body
      case (Wait(until), newState) =>
        logger.trace("Twitter unavailable: wait until {} from now {} epoch time in milliseconds", until, at)
        state = newState
        TimeUnit.MILLISECONDS.sleep(until - at)
        leaseSome(id)
      case (WaitNotify(twitter), newState) =>
        logger.trace("Twitter unavailable: wait notify for Twitter:{}", twitter.hashCode())
        state = newState
        twitter.synchronized(twitter.wait())
        leaseSome(id)
      case (response, newState) =>
        state = newState
        throw new IllegalStateException(state.toString)
    }
  }

  override def release(id: Long, twitter: Twitter, response: TwitterResponse): Unit = state.synchronized {
    val resource = Option(response.getRateLimitStatus).map { limit =>
      logger.trace("Release twitter : TwitterResponse.getRateLimitStatus -> {}", limit)
      Resource(id, limit.getRemaining, limit.getResetTimeInSeconds.toLong * 1000 + 1000, twitter)
    }
    state = state.release(id, resource)
    twitter.synchronized(twitter.notify())
  }
}
