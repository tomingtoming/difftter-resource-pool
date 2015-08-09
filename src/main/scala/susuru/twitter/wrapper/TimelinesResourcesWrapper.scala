package susuru.twitter.wrapper

import twitter4j._
import twitter4j.api.TimelinesResources

class TimelinesResourcesWrapper(twitter: Twitter) extends TimelinesResources {
  override def getHomeTimeline: ResponseList[Status] = throw new NotImplementedError("Sorry!")

  override def getHomeTimeline(paging: Paging): ResponseList[Status] = throw new NotImplementedError("Sorry!")

  override def getUserTimeline(s: String, paging: Paging): ResponseList[Status] = throw new NotImplementedError("Sorry!")

  override def getUserTimeline(l: Long, paging: Paging): ResponseList[Status] = throw new NotImplementedError("Sorry!")

  override def getUserTimeline(s: String): ResponseList[Status] = throw new NotImplementedError("Sorry!")

  override def getUserTimeline(l: Long): ResponseList[Status] = throw new NotImplementedError("Sorry!")

  override def getUserTimeline: ResponseList[Status] = throw new NotImplementedError("Sorry!")

  override def getUserTimeline(paging: Paging): ResponseList[Status] = throw new NotImplementedError("Sorry!")

  override def getRetweetsOfMe: ResponseList[Status] = throw new NotImplementedError("Sorry!")

  override def getRetweetsOfMe(paging: Paging): ResponseList[Status] = throw new NotImplementedError("Sorry!")

  override def getMentionsTimeline: ResponseList[Status] = throw new NotImplementedError("Sorry!")

  override def getMentionsTimeline(paging: Paging): ResponseList[Status] = throw new NotImplementedError("Sorry!")
}
