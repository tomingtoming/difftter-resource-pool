package susuru.twitter.wrapper

import twitter4j.{Twitter, ResponseList, SavedSearch}
import twitter4j.api.SavedSearchesResources

class SavedSearchesResourcesWrapper(twitter: Twitter) extends SavedSearchesResources {
  override def destroySavedSearch(l: Long): SavedSearch = throw new NotImplementedError("Sorry!")

  override def getSavedSearches: ResponseList[SavedSearch] = throw new NotImplementedError("Sorry!")

  override def createSavedSearch(s: String): SavedSearch = throw new NotImplementedError("Sorry!")

  override def showSavedSearch(l: Long): SavedSearch = throw new NotImplementedError("Sorry!")
}
