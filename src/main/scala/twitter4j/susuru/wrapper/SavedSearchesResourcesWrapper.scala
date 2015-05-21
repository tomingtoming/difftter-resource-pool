package twitter4j.susuru.wrapper

import akka.actor.ActorRef
import twitter4j.api.SavedSearchesResources
import twitter4j.{ResponseList, SavedSearch}

import scala.reflect.ClassTag

class SavedSearchesResourcesWrapper(val id: Long, val actor: ActorRef)(implicit val m: ClassTag[SavedSearchesResources]) extends SavedSearchesResources with Wrapper[SavedSearchesResources] {
  override def destroySavedSearch(i: Int): SavedSearch = throw new UnsupportedOperationException
  override def getSavedSearches: ResponseList[SavedSearch] = throw new UnsupportedOperationException
  override def createSavedSearch(s: String): SavedSearch = throw new UnsupportedOperationException
  override def showSavedSearch(i: Int): SavedSearch = throw new UnsupportedOperationException
}
