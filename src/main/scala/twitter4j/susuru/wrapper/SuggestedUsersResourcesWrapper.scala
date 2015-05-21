package twitter4j.susuru.wrapper

import akka.actor.ActorRef
import twitter4j.api.SuggestedUsersResources
import twitter4j.{Category, ResponseList, User}

import scala.reflect.ClassTag

class SuggestedUsersResourcesWrapper(val id: Long, val actor: ActorRef)(implicit val m: ClassTag[SuggestedUsersResources]) extends SuggestedUsersResources with Wrapper[SuggestedUsersResources] {
  override def getMemberSuggestions(s: String): ResponseList[User] = throw new UnsupportedOperationException
  override def getSuggestedUserCategories: ResponseList[Category] = throw new UnsupportedOperationException
  override def getUserSuggestions(s: String): ResponseList[User] = throw new UnsupportedOperationException
}
