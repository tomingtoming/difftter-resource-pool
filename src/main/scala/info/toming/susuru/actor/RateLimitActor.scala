package info.toming.susuru.actor

import akka.actor.{Actor, ActorRef}
import com.twitter.logging.Logger
import twitter4j.Twitter

import scala.collection.mutable

class RateLimitActor extends Actor {
  private val log = Logger.get(this.getClass.getName)
  private val queues: mutable.Map[String, mutable.Queue[Twitter]] = mutable.Map.empty
  private val requestQueue = mutable.Queue.empty[(ActorRef, RateLimitActorRequest)]
  private val resources: mutable.Map[Long, Twitter] = mutable.Map.empty
  override def preStart(): Unit = {
  }
  override def receive: Receive = {
    /* Requests */
    case req: RateLimitActorRequest =>
      requestQueue.enqueue((sender(), req))
      processRequest()
    /* Notifications */
    case req@ResourceHasBeenReset(t) =>
      log.trace("RateLimitActor received request " + req)
      processRequest()
    case request =>
      log.error("RateLimitActor received unknown request " + request)
  }
  private def processRequest(): Unit = {
    requestQueue.dequeueAll {
      case (sender: ActorRef, LeaseResourcePublic(title)) =>
        true
      case (sender: ActorRef, LeaseResourcePersonal(id, title)) =>
        true
      case (sender: ActorRef, LeaseThinWrapper(id)) =>

        true
    }
  }
}
