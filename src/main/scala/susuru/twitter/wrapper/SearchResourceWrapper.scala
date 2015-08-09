package susuru.twitter.wrapper

import twitter4j._
import twitter4j.api.SearchResource

class SearchResourceWrapper(twitter: Twitter) extends SearchResource {
  override def search(query: Query): QueryResult = throw new NotImplementedError("Sorry!")
}
