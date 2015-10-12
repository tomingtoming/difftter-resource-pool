package susuru.twitter

import java.util.concurrent.TimeUnit

import susuru.core._
import susuru.twitter.wrapper.TwitterWrapper
import twitter4j.Twitter

object TwitterPool {
  private var pool: TwitterPool = null
  def singleton(): Unit = this.synchronized {
    if(pool == null) {
      pool = new TwitterPool
    }
  }

  def getInstance(): Twitter = {
    new TwitterWrapper(pool)
  }

  def getInstance(id: Long): Twitter = {
    new TwitterWrapper(id, pool)
  }
}

class TwitterPool extends Pool[Twitter] {

  private var state: State[Twitter] = new StateCollection[Twitter]()

  override def lease(at: Long = System.currentTimeMillis()): Twitter = state.synchronized {
    state.query(LeaseAny(System.currentTimeMillis())) match {
      case (Lease(twitter), newState) =>
        state = newState
        twitter.body
      case (Wait(until), newState) =>
        state = newState
        lease()
      case (response, newState) =>
        state = newState
        throw new IllegalStateException(state.toString)
    }
  }

  override def lease(id: Long, at: Long = System.currentTimeMillis()): Twitter = state.synchronized {
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
