package susuru.twitter

import java.util.concurrent.TimeUnit

import susuru.core._
import susuru.twitter.wrapper.TwitterWrapper
import twitter4j.Twitter

object TwitterPool {
  private var pool: TwitterPool = null

  def singleton(refresh: Set[Long] => Map[Long, Twitter]): Unit = this.synchronized {
    if (pool == null) {
      pool = new TwitterPool(refresh)
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

class TwitterPool(refresh: Set[Long] => Map[Long, Twitter]) extends Pool[Twitter] {

  private var state: State[Twitter] = new StateCollection[Twitter]()

  override def lease(): Twitter = state.synchronized {
    val at: Long = System.currentTimeMillis()
    state.query(LeaseAny(at)) match {
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
    state.query(LeaseSome(id, at)) match {
      case (Lease(twitter), newState) =>
        state = newState
        twitter.body
      case (Wait(until), newState) =>
        state = newState
        TimeUnit.MILLISECONDS.sleep(until - at)
        lease()
      case (WaitNotify(twitter), newState) =>
        state = newState
        twitter.synchronized(twitter.wait())
        lease(id)
      case (response, newState) =>
        state = newState
        throw new IllegalStateException(state.toString)
    }
  }

  override def release(id: Long, count: Int, until: Long, resource: Twitter): Unit = state.synchronized {
    state.query(Release(Resource(id, count, until, resource))) match {
      case (_, newState) =>
        state = newState
    }
  }
}
