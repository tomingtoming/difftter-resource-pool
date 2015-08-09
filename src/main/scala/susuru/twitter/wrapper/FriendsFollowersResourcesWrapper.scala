package susuru.twitter.wrapper

import twitter4j._
import twitter4j.api.FriendsFollowersResources

class FriendsFollowersResourcesWrapper(twitter: Twitter) extends FriendsFollowersResources {
  override def getOutgoingFriendships(l: Long): IDs = throw new NotImplementedError("Sorry!")

  override def lookupFriendships(longs: Long*): ResponseList[Friendship] = throw new NotImplementedError("Sorry!")

  override def lookupFriendships(strings: String*): ResponseList[Friendship] = throw new NotImplementedError("Sorry!")

  override def updateFriendship(l: Long, b: Boolean, b1: Boolean): Relationship = throw new NotImplementedError("Sorry!")

  override def updateFriendship(s: String, b: Boolean, b1: Boolean): Relationship = throw new NotImplementedError("Sorry!")

  override def getIncomingFriendships(l: Long): IDs = throw new NotImplementedError("Sorry!")

  override def getFriendsIDs(l: Long): IDs = throw new NotImplementedError("Sorry!")

  override def getFriendsIDs(l: Long, l1: Long): IDs = throw new NotImplementedError("Sorry!")

  override def getFriendsIDs(l: Long, l1: Long, i: Int): IDs = throw new NotImplementedError("Sorry!")

  override def getFriendsIDs(s: String, l: Long): IDs = throw new NotImplementedError("Sorry!")

  override def getFriendsIDs(s: String, l: Long, i: Int): IDs = throw new NotImplementedError("Sorry!")

  override def destroyFriendship(l: Long): User = throw new NotImplementedError("Sorry!")

  override def destroyFriendship(s: String): User = throw new NotImplementedError("Sorry!")

  override def getNoRetweetsFriendships: IDs = throw new NotImplementedError("Sorry!")

  override def showFriendship(l: Long, l1: Long): Relationship = throw new NotImplementedError("Sorry!")

  override def showFriendship(s: String, s1: String): Relationship = throw new NotImplementedError("Sorry!")

  override def getFollowersList(l: Long, l1: Long): PagableResponseList[User] = throw new NotImplementedError("Sorry!")

  override def getFollowersList(s: String, l: Long): PagableResponseList[User] = throw new NotImplementedError("Sorry!")

  override def getFollowersList(l: Long, l1: Long, i: Int): PagableResponseList[User] = throw new NotImplementedError("Sorry!")

  override def getFollowersList(s: String, l: Long, i: Int): PagableResponseList[User] = throw new NotImplementedError("Sorry!")

  override def getFollowersList(l: Long, l1: Long, i: Int, b: Boolean, b1: Boolean): PagableResponseList[User] = throw new NotImplementedError("Sorry!")

  override def getFollowersList(s: String, l: Long, i: Int, b: Boolean, b1: Boolean): PagableResponseList[User] = throw new NotImplementedError("Sorry!")

  override def createFriendship(l: Long): User = throw new NotImplementedError("Sorry!")

  override def createFriendship(s: String): User = throw new NotImplementedError("Sorry!")

  override def createFriendship(l: Long, b: Boolean): User = throw new NotImplementedError("Sorry!")

  override def createFriendship(s: String, b: Boolean): User = throw new NotImplementedError("Sorry!")

  override def getFollowersIDs(l: Long): IDs = throw new NotImplementedError("Sorry!")

  override def getFollowersIDs(l: Long, l1: Long): IDs = throw new NotImplementedError("Sorry!")

  override def getFollowersIDs(l: Long, l1: Long, i: Int): IDs = throw new NotImplementedError("Sorry!")

  override def getFollowersIDs(s: String, l: Long): IDs = throw new NotImplementedError("Sorry!")

  override def getFollowersIDs(s: String, l: Long, i: Int): IDs = throw new NotImplementedError("Sorry!")

  override def getFriendsList(l: Long, l1: Long): PagableResponseList[User] = throw new NotImplementedError("Sorry!")

  override def getFriendsList(l: Long, l1: Long, i: Int): PagableResponseList[User] = throw new NotImplementedError("Sorry!")

  override def getFriendsList(s: String, l: Long): PagableResponseList[User] = throw new NotImplementedError("Sorry!")

  override def getFriendsList(s: String, l: Long, i: Int): PagableResponseList[User] = throw new NotImplementedError("Sorry!")

  override def getFriendsList(l: Long, l1: Long, i: Int, b: Boolean, b1: Boolean): PagableResponseList[User] = throw new NotImplementedError("Sorry!")

  override def getFriendsList(s: String, l: Long, i: Int, b: Boolean, b1: Boolean): PagableResponseList[User] = throw new NotImplementedError("Sorry!")
}
