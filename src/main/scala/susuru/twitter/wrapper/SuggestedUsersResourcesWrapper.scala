package susuru.twitter.wrapper

import twitter4j._
import twitter4j.api.SuggestedUsersResources

class SuggestedUsersResourcesWrapper(twitter: Twitter) extends SuggestedUsersResources {
  override def getMemberSuggestions(s: String): ResponseList[User] = throw new NotImplementedError("Sorry!")

  override def getSuggestedUserCategories: ResponseList[Category] = throw new NotImplementedError("Sorry!")

  override def getUserSuggestions(s: String): ResponseList[User] = throw new NotImplementedError("Sorry!")
}
