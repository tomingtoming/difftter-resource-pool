package susuru.twitter

import java.util.concurrent.TimeUnit

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

  def getInstance(): Twitter = {
    if (pool != null) {
      new TwitterWrapper(pool)
    } else {
      throw new InstantiationException("Instance of TwitterPool are not created yet.")
    }
  }

  def getInstance(id: Long): Twitter = {
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

  private def refreshOnDemand(at: Long = System.currentTimeMillis()): Unit = {
    if (lastRefreshedTime + interval < at) {
      state = state.add(refresh(state.idSet))
      lastRefreshedTime = at
    }
  }

  override def lease(): Twitter = state.synchronized {
    val at: Long = System.currentTimeMillis()
    refreshOnDemand(at)
    state.leaseAny(at) match {
      case (Lease(twitter), newState) =>
        state = newState
        twitter.body
      case (Wait(until), newState) =>
        state = newState
        TimeUnit.MILLISECONDS.sleep(until - at)
        lease()
      case (response, newState) =>
        state = newState
        throw new IllegalStateException(state.toString)
    }
  }

  override def lease(id: Long): Twitter = state.synchronized {
    val at: Long = System.currentTimeMillis()
    refreshOnDemand(at)
    state.leaseSome(id, at) match {
      case (Lease(twitter), newState) =>
        state = newState
        twitter.body
      case (Wait(until), newState) =>
        state = newState
        TimeUnit.MILLISECONDS.sleep(until - at)
        lease(id)
      case (WaitNotify(twitter), newState) =>
        state = newState
        twitter.synchronized(twitter.wait())
        lease(id)
      case (response, newState) =>
        state = newState
        throw new IllegalStateException(state.toString)
    }
  }

  override def release(id: Long, resource: Twitter, response: TwitterResponse): Unit = state.synchronized {
    val limit = response.getRateLimitStatus
    state = state.release(Resource(id, limit.getRemaining, limit.getResetTimeInSeconds.toLong * 1000, resource))
    resource.synchronized(resource.notify())
  }
}
