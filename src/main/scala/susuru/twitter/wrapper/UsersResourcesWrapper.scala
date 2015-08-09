package susuru.twitter.wrapper

import java.io.{InputStream, File}
import java.lang

import twitter4j._
import twitter4j.api.UsersResources

class UsersResourcesWrapper(twitter: Twitter) extends UsersResources{
  override def removeProfileBanner(): Unit = throw new NotImplementedError("Sorry!")

  override def showUser(l: Long): User = throw new NotImplementedError("Sorry!")

  override def showUser(s: String): User = throw new NotImplementedError("Sorry!")

  override def lookupUsers(longs: Long*): ResponseList[User] = throw new NotImplementedError("Sorry!")

  override def lookupUsers(strings: String*): ResponseList[User] = throw new NotImplementedError("Sorry!")

  override def updateProfileBanner(file: File): Unit = throw new NotImplementedError("Sorry!")

  override def updateProfileBanner(inputStream: InputStream): Unit = throw new NotImplementedError("Sorry!")

  override def updateProfile(s: String, s1: String, s2: String, s3: String): User = throw new NotImplementedError("Sorry!")

  override def getBlocksIDs: IDs = throw new NotImplementedError("Sorry!")

  override def getBlocksIDs(l: Long): IDs = throw new NotImplementedError("Sorry!")

  override def getContributors(l: Long): ResponseList[User] = throw new NotImplementedError("Sorry!")

  override def getContributors(s: String): ResponseList[User] = throw new NotImplementedError("Sorry!")

  override def searchUsers(s: String, i: Int): ResponseList[User] = throw new NotImplementedError("Sorry!")

  override def getAccountSettings: AccountSettings = throw new NotImplementedError("Sorry!")

  override def destroyBlock(l: Long): User = throw new NotImplementedError("Sorry!")

  override def destroyBlock(s: String): User = throw new NotImplementedError("Sorry!")

  override def getMutesIDs(l: Long): IDs = throw new NotImplementedError("Sorry!")

  override def getContributees(l: Long): ResponseList[User] = throw new NotImplementedError("Sorry!")

  override def getContributees(s: String): ResponseList[User] = throw new NotImplementedError("Sorry!")

  override def getBlocksList: PagableResponseList[User] = throw new NotImplementedError("Sorry!")

  override def getBlocksList(l: Long): PagableResponseList[User] = throw new NotImplementedError("Sorry!")

  override def updateAccountSettings(integer: Integer, aBoolean: lang.Boolean, s: String, s1: String, s2: String, s3: String): AccountSettings = throw new NotImplementedError("Sorry!")

  override def updateProfileColors(s: String, s1: String, s2: String, s3: String, s4: String): User = throw new NotImplementedError("Sorry!")

  override def destroyMute(l: Long): User = throw new NotImplementedError("Sorry!")

  override def destroyMute(s: String): User = throw new NotImplementedError("Sorry!")

  override def getMutesList(l: Long): PagableResponseList[User] = throw new NotImplementedError("Sorry!")

  override def createBlock(l: Long): User = throw new NotImplementedError("Sorry!")

  override def createBlock(s: String): User = throw new NotImplementedError("Sorry!")

  override def createMute(l: Long): User = throw new NotImplementedError("Sorry!")

  override def createMute(s: String): User = throw new NotImplementedError("Sorry!")

  override def updateProfileBackgroundImage(file: File, b: Boolean): User = throw new NotImplementedError("Sorry!")

  override def updateProfileBackgroundImage(inputStream: InputStream, b: Boolean): User = throw new NotImplementedError("Sorry!")

  override def verifyCredentials(): User = throw new NotImplementedError("Sorry!")

  override def updateProfileImage(file: File): User = throw new NotImplementedError("Sorry!")

  override def updateProfileImage(inputStream: InputStream): User = throw new NotImplementedError("Sorry!")
}
