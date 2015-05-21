package twitter4j.susuru.wrapper

import akka.actor.ActorRef
import twitter4j.User
import twitter4j.api.SpamReportingResource

import scala.reflect.ClassTag

class SpamReportingResourceWrapper(val id: Long, val actor: ActorRef)(implicit val m: ClassTag[SpamReportingResource]) extends SpamReportingResource with Wrapper[SpamReportingResource] {
  override def reportSpam(l: Long): User = throw new UnsupportedOperationException
  override def reportSpam(s: String): User = throw new UnsupportedOperationException
}
