package susuru.twitter.wrapper

import twitter4j._
import twitter4j.api.FavoritesResources

class FavoritesResourcesWrapper(twitter: Twitter) extends FavoritesResources {
  override def createFavorite(l: Long): Status = throw new NotImplementedError("Sorry!")

  override def destroyFavorite(l: Long): Status = throw new NotImplementedError("Sorry!")

  override def getFavorites: ResponseList[Status] = throw new NotImplementedError("Sorry!")

  override def getFavorites(l: Long): ResponseList[Status] = throw new NotImplementedError("Sorry!")

  override def getFavorites(s: String): ResponseList[Status] = throw new NotImplementedError("Sorry!")

  override def getFavorites(paging: Paging): ResponseList[Status] = throw new NotImplementedError("Sorry!")

  override def getFavorites(l: Long, paging: Paging): ResponseList[Status] = throw new NotImplementedError("Sorry!")

  override def getFavorites(s: String, paging: Paging): ResponseList[Status] = throw new NotImplementedError("Sorry!")
}
