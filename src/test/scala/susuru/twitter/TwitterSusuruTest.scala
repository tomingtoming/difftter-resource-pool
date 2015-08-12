package susuru.twitter

import scala.collection.JavaConverters._

import org.specs2._
import org.specs2.mock.Mockito
import twitter4j._

import scala.concurrent.Await
import scala.concurrent.duration.Duration

class TwitterSusuruTest extends Specification with Mockito {
  def is = s2"""
  Specification: ${this.getClass.getName}
    contain 11 characters                             $e1
  """

  def e1 = {
    val twitter = mock[Twitter]
    val responce = mock[ResponseList[User]]
    responce.getRateLimitStatus returns new RateLimitStatus {
      override val getResetTimeInSeconds: Int = Int.MaxValue
      override val getLimit: Int = Int.MaxValue
      override val getRemaining: Int = Int.MaxValue
      override val getSecondsUntilReset: Int = Int.MaxValue
    }
    responce.iterator() returns List().iterator.asJava
    twitter.lookupUsers(1L, 2L, 3L) returns responce
    val susuru = new TwitterSusuru(() => Map(1L -> twitter))
    var a: List[Long] = Nil
    try {
      susuru.start()
      Await.result(susuru.loanDo(Some(1L)) { twitter =>
        val res: ResponseList[User] = twitter.lookupUsers(1L, 2L, 3L)
        a = res.asScala.map(_.getId).toList
        res
      }, Duration("10.0s"))
      a mustEqual List()
    } finally {
      susuru.kill()
    }
  }
}
