package susuru.twitter

import java.util.concurrent.TimeUnit

import susuru.core._
import twitter4j.Twitter

class TwitterPool extends Pool[Twitter] {

  private var state: State[Twitter] = new StateCollection[Twitter]()

  override def lease(): Twitter = state.synchronized {
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

  override def lease(id: Long): Twitter = state.synchronized {
    state.query(LeaseSome(id, System.currentTimeMillis())) match {
      case (Lease(twitter), newState) =>
        state = newState
        twitter.body
      case (Wait(until), newState) =>
        state = newState
        TimeUnit.MILLISECONDS.sleep(until - System.currentTimeMillis())
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
