package info.toming.susuru.wrapper

import twitter4j.auth.{OAuth2Support, OAuth2Token}

trait OAuth2SupportWrapper[T <: OAuth2Support] extends OAuth2Support with Wrapper[T] {
  override def setOAuthConsumer(s: String, s1: String): Unit = throw new UnsupportedOperationException
  override def getOAuth2Token: OAuth2Token = throw new UnsupportedOperationException
  override def invalidateOAuth2Token(): Unit = throw new UnsupportedOperationException
  override def setOAuth2Token(oAuth2Token: OAuth2Token): Unit = throw new UnsupportedOperationException
}
