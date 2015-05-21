package info.toming.susuru.wrapper

import akka.actor.ActorRef
import twitter4j.api.TimelinesResources
import twitter4j.{Paging, ResponseList, Status}

import scala.reflect.ClassTag

class TimelinesResourcesWrapper(val id: Long, val actor: ActorRef)(implicit val m: ClassTag[TimelinesResources]) extends TimelinesResources with Wrapper[TimelinesResources] {
  override def getHomeTimeline: ResponseList[Status] = throw new UnsupportedOperationException
  override def getHomeTimeline(paging: Paging): ResponseList[Status] = throw new UnsupportedOperationException
  override def getUserTimeline(s: String, paging: Paging): ResponseList[Status] = throw new UnsupportedOperationException
  override def getUserTimeline(l: Long, paging: Paging): ResponseList[Status] = throw new UnsupportedOperationException
  override def getUserTimeline(s: String): ResponseList[Status] = throw new UnsupportedOperationException
  override def getUserTimeline(l: Long): ResponseList[Status] = throw new UnsupportedOperationException
  override def getUserTimeline: ResponseList[Status] = throw new UnsupportedOperationException
  override def getUserTimeline(paging: Paging): ResponseList[Status] = throw new UnsupportedOperationException
  override def getRetweetsOfMe: ResponseList[Status] = throw new UnsupportedOperationException
  override def getRetweetsOfMe(paging: Paging): ResponseList[Status] = throw new UnsupportedOperationException
  override def getMentionsTimeline: ResponseList[Status] = throw new UnsupportedOperationException
  override def getMentionsTimeline(paging: Paging): ResponseList[Status] = throw new UnsupportedOperationException
}
