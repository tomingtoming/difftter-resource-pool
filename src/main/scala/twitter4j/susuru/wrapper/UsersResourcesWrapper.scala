package twitter4j.susuru.wrapper

import java.io.{File, InputStream}
import java.lang

import akka.actor.ActorRef
import twitter4j._
import twitter4j.api.UsersResources

import scala.reflect.ClassTag

class UsersResourcesWrapper(val id: Long, val actor: ActorRef)(implicit val m: ClassTag[UsersResources]) extends UsersResources with Wrapper[UsersResources] {
  override def removeProfileBanner(): Unit = throw new UnsupportedOperationException
  override def showUser(l: Long): User = throw new UnsupportedOperationException
  override def showUser(s: String): User = throw new UnsupportedOperationException
  override def lookupUsers(longs: Array[Long]): ResponseList[User] = throw new UnsupportedOperationException
  override def lookupUsers(strings: Array[String]): ResponseList[User] = throw new UnsupportedOperationException
  override def updateProfileBanner(file: File): Unit = throw new UnsupportedOperationException
  override def updateProfileBanner(inputStream: InputStream): Unit = throw new UnsupportedOperationException
  override def updateProfile(s: String, s1: String, s2: String, s3: String): User = throw new UnsupportedOperationException
  override def getBlocksIDs: IDs = throw new UnsupportedOperationException
  override def getBlocksIDs(l: Long): IDs = throw new UnsupportedOperationException
  override def searchUsers(s: String, i: Int): ResponseList[User] = throw new UnsupportedOperationException
  override def getContributors(l: Long): ResponseList[User] = throw new UnsupportedOperationException
  override def getContributors(s: String): ResponseList[User] = throw new UnsupportedOperationException
  override def getAccountSettings: AccountSettings = throw new UnsupportedOperationException
  override def getMutesIDs(l: Long): IDs = throw new UnsupportedOperationException
  override def destroyBlock(l: Long): User = throw new UnsupportedOperationException
  override def destroyBlock(s: String): User = throw new UnsupportedOperationException
  override def getContributees(l: Long): ResponseList[User] = throw new UnsupportedOperationException
  override def getContributees(s: String): ResponseList[User] = throw new UnsupportedOperationException
  override def getBlocksList: PagableResponseList[User] = throw new UnsupportedOperationException
  override def getBlocksList(l: Long): PagableResponseList[User] = throw new UnsupportedOperationException
  override def updateAccountSettings(integer: Integer, aBoolean: lang.Boolean, s: String, s1: String, s2: String, s3: String): AccountSettings = throw new UnsupportedOperationException
  override def updateProfileColors(s: String, s1: String, s2: String, s3: String, s4: String): User = throw new UnsupportedOperationException
  override def getMutesList(l: Long): PagableResponseList[User] = throw new UnsupportedOperationException
  override def destroyMute(l: Long): User = throw new UnsupportedOperationException
  override def destroyMute(s: String): User = throw new UnsupportedOperationException
  override def createBlock(l: Long): User = throw new UnsupportedOperationException
  override def createBlock(s: String): User = throw new UnsupportedOperationException
  override def createMute(l: Long): User = throw new UnsupportedOperationException
  override def createMute(s: String): User = throw new UnsupportedOperationException
  override def updateProfileBackgroundImage(file: File, b: Boolean): User = throw new UnsupportedOperationException
  override def updateProfileBackgroundImage(inputStream: InputStream, b: Boolean): User = throw new UnsupportedOperationException
  override def verifyCredentials(): User = throw new UnsupportedOperationException
  override def updateProfileImage(file: File): User = throw new UnsupportedOperationException
  override def updateProfileImage(inputStream: InputStream): User = throw new UnsupportedOperationException
}
