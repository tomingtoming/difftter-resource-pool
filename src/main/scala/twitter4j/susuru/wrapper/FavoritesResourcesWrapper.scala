package twitter4j.susuru.wrapper

import akka.actor.ActorRef
import twitter4j.api.FavoritesResources
import twitter4j.{Paging, ResponseList, Status}

import scala.reflect.ClassTag

class FavoritesResourcesWrapper(val id: Long, val actor: ActorRef)(implicit val m: ClassTag[FavoritesResources]) extends FavoritesResources with Wrapper[FavoritesResources] {
  override def createFavorite(l: Long): Status = throw new UnsupportedOperationException
  override def destroyFavorite(l: Long): Status = throw new UnsupportedOperationException
  override def getFavorites: ResponseList[Status] = throw new UnsupportedOperationException
  override def getFavorites(l: Long): ResponseList[Status] = throw new UnsupportedOperationException
  override def getFavorites(s: String): ResponseList[Status] = throw new UnsupportedOperationException
  override def getFavorites(paging: Paging): ResponseList[Status] = throw new UnsupportedOperationException
  override def getFavorites(l: Long, paging: Paging): ResponseList[Status] = throw new UnsupportedOperationException
  override def getFavorites(s: String, paging: Paging): ResponseList[Status] = throw new UnsupportedOperationException
}
