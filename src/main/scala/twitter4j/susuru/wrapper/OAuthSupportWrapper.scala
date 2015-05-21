package twitter4j.susuru.wrapper

import twitter4j.auth.{AccessToken, OAuthSupport, RequestToken}

trait OAuthSupportWrapper[T <: OAuthSupport] extends OAuthSupport with Wrapper[T] {
  override def getOAuthRequestToken: RequestToken = throw new UnsupportedOperationException
  override def getOAuthRequestToken(s: String): RequestToken = throw new UnsupportedOperationException
  override def getOAuthRequestToken(s: String, s1: String): RequestToken = throw new UnsupportedOperationException
  override def getOAuthRequestToken(s: String, s1: String, s2: String): RequestToken = throw new UnsupportedOperationException
  override def setOAuthAccessToken(accessToken: AccessToken): Unit = throw new UnsupportedOperationException
  override def getOAuthAccessToken: AccessToken = throw new UnsupportedOperationException
  override def getOAuthAccessToken(s: String): AccessToken = throw new UnsupportedOperationException
  override def getOAuthAccessToken(requestToken: RequestToken): AccessToken = throw new UnsupportedOperationException
  override def getOAuthAccessToken(requestToken: RequestToken, s: String): AccessToken = throw new UnsupportedOperationException
  override def getOAuthAccessToken(s: String, s1: String): AccessToken = throw new UnsupportedOperationException
}
