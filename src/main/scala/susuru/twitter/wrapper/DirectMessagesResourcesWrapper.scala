package susuru.twitter.wrapper

import java.io.InputStream

import twitter4j._
import twitter4j.api.DirectMessagesResources

class DirectMessagesResourcesWrapper(twitter: Twitter) extends DirectMessagesResources {
  override def showDirectMessage(l: Long): DirectMessage = throw new NotImplementedError("Sorry!")

  override def sendDirectMessage(l: Long, s: String): DirectMessage = throw new NotImplementedError("Sorry!")

  override def sendDirectMessage(s: String, s1: String): DirectMessage = throw new NotImplementedError("Sorry!")

  override def destroyDirectMessage(l: Long): DirectMessage = throw new NotImplementedError("Sorry!")

  override def getDirectMessages: ResponseList[DirectMessage] = throw new NotImplementedError("Sorry!")

  override def getDirectMessages(paging: Paging): ResponseList[DirectMessage] = throw new NotImplementedError("Sorry!")

  override def getDMImageAsStream(s: String): InputStream = throw new NotImplementedError("Sorry!")

  override def getSentDirectMessages: ResponseList[DirectMessage] = throw new NotImplementedError("Sorry!")

  override def getSentDirectMessages(paging: Paging): ResponseList[DirectMessage] = throw new NotImplementedError("Sorry!")
}
