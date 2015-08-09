package susuru.twitter.wrapper

import java.util

import twitter4j._
import twitter4j.api.HelpResources
import twitter4j.api.HelpResources.Language

class HelpResourcesWrapper(twitter: Twitter) extends HelpResources {
  override def getAPIConfiguration: TwitterAPIConfiguration = throw new NotImplementedError("Sorry!")

  override def getTermsOfService: String = throw new NotImplementedError("Sorry!")

  override def getPrivacyPolicy: String = throw new NotImplementedError("Sorry!")

  override def getRateLimitStatus: util.Map[String, RateLimitStatus] = throw new NotImplementedError("Sorry!")

  override def getRateLimitStatus(strings: String*): util.Map[String, RateLimitStatus] = throw new NotImplementedError("Sorry!")

  override def getLanguages: ResponseList[Language] = throw new NotImplementedError("Sorry!")
}
