package info.toming.susuru.wrapper

import akka.actor.ActorRef
import twitter4j.api.TrendsResources
import twitter4j.{GeoLocation, Location, ResponseList, Trends}

import scala.reflect.ClassTag

class TrendsResourcesWrapper(val id: Long, val actor: ActorRef)(implicit val m: ClassTag[TrendsResources]) extends TrendsResources with Wrapper[TrendsResources] {
  override def getClosestTrends(geoLocation: GeoLocation): ResponseList[Location] = throw new UnsupportedOperationException
  override def getAvailableTrends: ResponseList[Location] = throw new UnsupportedOperationException
  override def getPlaceTrends(i: Int): Trends = throw new UnsupportedOperationException
}
