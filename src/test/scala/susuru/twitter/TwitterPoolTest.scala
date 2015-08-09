package susuru.twitter

import org.specs2._
import org.specs2.mock.Mockito
import twitter4j._

class TwitterPoolTest extends Specification with Mockito {
  def is = s2"""
  Specification: ${this.getClass.getName}
    contain 11 characters                             $e1
  """
  def e1 = {
    val twitter = mock[Twitter]
    val pool = new TwitterPool(_ => twitter, () => List(twitter))
    pool.withResource(None) { twitter =>
      twitter.lookupUsers(1)
    }
    true
  }
}
