package twitter4j.susuru.wrapper

import akka.actor.ActorRef
import twitter4j.api.SearchResource
import twitter4j.{Query, QueryResult}

import scala.reflect.ClassTag

class SearchResourceWrapper(val id: Long, val actor: ActorRef)(implicit val m: ClassTag[SearchResource]) extends SearchResource with Wrapper[SearchResource] {
  override def search(query: Query): QueryResult = throw new UnsupportedOperationException
}
