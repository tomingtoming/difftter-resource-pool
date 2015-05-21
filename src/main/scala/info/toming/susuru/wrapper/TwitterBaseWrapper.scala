package info.toming.susuru.wrapper

import twitter4j.auth.Authorization
import twitter4j.conf.Configuration
import twitter4j.{RateLimitStatusListener, TwitterBase}

trait TwitterBaseWrapper[T <: TwitterBase] extends TwitterBase with Wrapper[T] {
  override def addRateLimitStatusListener(rateLimitStatusListener: RateLimitStatusListener): Unit = throw new UnsupportedOperationException
  override def getScreenName: String = throw new UnsupportedOperationException
  override def getId: Long = throw new UnsupportedOperationException
  override def getAuthorization: Authorization = throw new UnsupportedOperationException
  override def getConfiguration: Configuration = throw new UnsupportedOperationException
}
