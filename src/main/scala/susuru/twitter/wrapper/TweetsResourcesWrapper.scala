package susuru.twitter.wrapper

import java.io.{File, InputStream}

import twitter4j._
import twitter4j.api.TweetsResources

class TweetsResourcesWrapper(twitter: Twitter) extends TweetsResources {
  override def getOEmbed(oEmbedRequest: OEmbedRequest): OEmbed = throw new NotImplementedError("Sorry!")

  override def destroyStatus(l: Long): Status = throw new NotImplementedError("Sorry!")

  override def lookup(longs: Long*): ResponseList[Status] = throw new NotImplementedError("Sorry!")

  override def uploadMedia(file: File): UploadedMedia = throw new NotImplementedError("Sorry!")

  override def uploadMedia(s: String, inputStream: InputStream): UploadedMedia = throw new NotImplementedError("Sorry!")

  override def updateStatus(s: String): Status = throw new NotImplementedError("Sorry!")

  override def updateStatus(statusUpdate: StatusUpdate): Status = throw new NotImplementedError("Sorry!")

  override def retweetStatus(l: Long): Status = throw new NotImplementedError("Sorry!")

  override def getRetweets(l: Long): ResponseList[Status] = throw new NotImplementedError("Sorry!")

  override def getRetweeterIds(l: Long, l1: Long): IDs = throw new NotImplementedError("Sorry!")

  override def getRetweeterIds(l: Long, i: Int, l1: Long): IDs = throw new NotImplementedError("Sorry!")

  override def showStatus(l: Long): Status = throw new NotImplementedError("Sorry!")
}
