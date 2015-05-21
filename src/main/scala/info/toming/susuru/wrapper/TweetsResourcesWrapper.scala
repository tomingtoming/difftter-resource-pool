package info.toming.susuru.wrapper

import java.io.{File, InputStream}

import akka.actor.ActorRef
import twitter4j._
import twitter4j.api.TweetsResources

import scala.reflect.ClassTag

class TweetsResourcesWrapper(val id: Long, val actor: ActorRef)(implicit val m: ClassTag[TweetsResources]) extends TweetsResources with Wrapper[TweetsResources] {
  override def getOEmbed(oEmbedRequest: OEmbedRequest): OEmbed = throw new UnsupportedOperationException
  override def destroyStatus(l: Long): Status = throw new UnsupportedOperationException
  override def lookup(longs: Array[Long]): ResponseList[Status] = throw new UnsupportedOperationException
  override def uploadMedia(file: File): UploadedMedia = throw new UnsupportedOperationException
  override def uploadMedia(s: String, inputStream: InputStream): UploadedMedia = throw new UnsupportedOperationException
  override def updateStatus(s: String): Status = throw new UnsupportedOperationException
  override def updateStatus(statusUpdate: StatusUpdate): Status = throw new UnsupportedOperationException
  override def retweetStatus(l: Long): Status = throw new UnsupportedOperationException
  override def getRetweets(l: Long): ResponseList[Status] = throw new UnsupportedOperationException
  override def getRetweeterIds(l: Long, l1: Long): IDs = throw new UnsupportedOperationException
  override def getRetweeterIds(l: Long, i: Int, l1: Long): IDs = throw new UnsupportedOperationException
  override def showStatus(l: Long): Status = throw new UnsupportedOperationException
}
