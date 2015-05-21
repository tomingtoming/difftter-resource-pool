package twitter4j.susuru.wrapper

import java.io.InputStream

import akka.actor.ActorRef
import twitter4j.api.DirectMessagesResources
import twitter4j.{DirectMessage, Paging, ResponseList}

import scala.reflect.ClassTag

class DirectMessagesResourcesWrapper(val id: Long, val actor: ActorRef)(implicit val m: ClassTag[DirectMessagesResources]) extends DirectMessagesResources with Wrapper[DirectMessagesResources] {
  override def showDirectMessage(l: Long): DirectMessage = throw new UnsupportedOperationException
  override def sendDirectMessage(l: Long, s: String): DirectMessage = throw new UnsupportedOperationException
  override def sendDirectMessage(s: String, s1: String): DirectMessage = throw new UnsupportedOperationException
  override def destroyDirectMessage(l: Long): DirectMessage = throw new UnsupportedOperationException
  override def getDirectMessages: ResponseList[DirectMessage] = throw new UnsupportedOperationException
  override def getDirectMessages(paging: Paging): ResponseList[DirectMessage] = throw new UnsupportedOperationException
  override def getDMImageAsStream(s: String): InputStream = throw new UnsupportedOperationException
  override def getSentDirectMessages: ResponseList[DirectMessage] = throw new UnsupportedOperationException
  override def getSentDirectMessages(paging: Paging): ResponseList[DirectMessage] = throw new UnsupportedOperationException
}
