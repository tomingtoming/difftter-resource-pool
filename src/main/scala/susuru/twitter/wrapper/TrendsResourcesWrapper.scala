package susuru.twitter.wrapper

import twitter4j._
import twitter4j.api.TrendsResources

class TrendsResourcesWrapper(twitter: Twitter) extends TrendsResources {
  override def getClosestTrends(geoLocation: GeoLocation): ResponseList[Location] = throw new NotImplementedError("Sorry!")

  override def getAvailableTrends: ResponseList[Location] = throw new NotImplementedError("Sorry!")

  override def getPlaceTrends(i: Int): Trends = throw new NotImplementedError("Sorry!")
}
