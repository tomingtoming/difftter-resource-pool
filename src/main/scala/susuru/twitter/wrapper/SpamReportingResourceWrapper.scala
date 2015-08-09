package susuru.twitter.wrapper

import twitter4j._
import twitter4j.api.SpamReportingResource

class SpamReportingResourceWrapper(twitter: Twitter) extends SpamReportingResource {
  override def reportSpam(l: Long): User = throw new NotImplementedError("Sorry!")

  override def reportSpam(s: String): User = throw new NotImplementedError("Sorry!")
}
