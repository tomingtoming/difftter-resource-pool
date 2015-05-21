package info.toming.susuru.wrapper

import java.util.{Map => JavaMap}

import akka.actor.ActorRef
import twitter4j.api.HelpResources
import twitter4j.api.HelpResources.Language
import twitter4j.{RateLimitStatus, ResponseList, TwitterAPIConfiguration}

import scala.reflect.ClassTag

class HelpResourcesWrapper(val id: Long, val actor: ActorRef)(implicit val m: ClassTag[HelpResources]) extends HelpResources with Wrapper[HelpResources] {
  override def getAPIConfiguration: TwitterAPIConfiguration = throw new UnsupportedOperationException
  override def getTermsOfService: String = throw new UnsupportedOperationException
  override def getPrivacyPolicy: String = throw new UnsupportedOperationException
  override def getRateLimitStatus: JavaMap[String, RateLimitStatus] = throw new UnsupportedOperationException
  override def getRateLimitStatus(strings: String*): JavaMap[String, RateLimitStatus] = throw new UnsupportedOperationException
  override def getLanguages: ResponseList[Language] = throw new UnsupportedOperationException
}
