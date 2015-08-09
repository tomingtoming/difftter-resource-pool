package susuru.twitter.wrapper

import twitter4j._
import twitter4j.api.PlacesGeoResources

class PlacesGeoResourcesWrapper(twitter: Twitter) extends PlacesGeoResources {
  override def reverseGeoCode(geoQuery: GeoQuery): ResponseList[Place] = throw new NotImplementedError("Sorry!")

  override def searchPlaces(geoQuery: GeoQuery): ResponseList[Place] = throw new NotImplementedError("Sorry!")

  override def getGeoDetails(s: String): Place = throw new NotImplementedError("Sorry!")

  override def getSimilarPlaces(geoLocation: GeoLocation, s: String, s1: String, s2: String): ResponseList[Place] = throw new NotImplementedError("Sorry!")
}
