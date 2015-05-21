package twitter4j.susuru.wrapper

import akka.actor.ActorRef
import twitter4j.api.PlacesGeoResources
import twitter4j.{GeoLocation, GeoQuery, Place, ResponseList}

import scala.reflect.ClassTag

class PlacesGeoResourcesWrapper(val id: Long, val actor: ActorRef)(implicit val m: ClassTag[PlacesGeoResources]) extends PlacesGeoResources with Wrapper[PlacesGeoResources] {
  override def reverseGeoCode(geoQuery: GeoQuery): ResponseList[Place] = throw new UnsupportedOperationException
  override def searchPlaces(geoQuery: GeoQuery): ResponseList[Place] = throw new UnsupportedOperationException
  override def getGeoDetails(s: String): Place = throw new UnsupportedOperationException
  override def getSimilarPlaces(geoLocation: GeoLocation, s: String, s1: String, s2: String): ResponseList[Place] = throw new UnsupportedOperationException
}
