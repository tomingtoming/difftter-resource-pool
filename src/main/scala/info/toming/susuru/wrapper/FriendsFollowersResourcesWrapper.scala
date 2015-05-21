package info.toming.susuru.wrapper

import akka.actor.ActorRef
import twitter4j._
import twitter4j.api.FriendsFollowersResources

import scala.reflect.ClassTag

class FriendsFollowersResourcesWrapper(val id: Long, val actor: ActorRef)(implicit val m: ClassTag[FriendsFollowersResources]) extends FriendsFollowersResources with Wrapper[FriendsFollowersResources] {
  override def getOutgoingFriendships(l: Long): IDs = throw new UnsupportedOperationException
  override def lookupFriendships(longs: Array[Long]): ResponseList[Friendship] = throw new UnsupportedOperationException
  override def lookupFriendships(strings: Array[String]): ResponseList[Friendship] = throw new UnsupportedOperationException
  override def updateFriendship(l: Long, b: Boolean, b1: Boolean): Relationship = throw new UnsupportedOperationException
  override def updateFriendship(s: String, b: Boolean, b1: Boolean): Relationship = throw new UnsupportedOperationException
  override def getIncomingFriendships(l: Long): IDs = throw new UnsupportedOperationException
  override def getFriendsIDs(l: Long): IDs = throw new UnsupportedOperationException
  override def getFriendsIDs(l: Long, l1: Long): IDs = throw new UnsupportedOperationException
  override def getFriendsIDs(l: Long, l1: Long, i: Int): IDs = throw new UnsupportedOperationException
  override def getFriendsIDs(s: String, l: Long): IDs = throw new UnsupportedOperationException
  override def getFriendsIDs(s: String, l: Long, i: Int): IDs = throw new UnsupportedOperationException
  override def destroyFriendship(l: Long): User = throw new UnsupportedOperationException
  override def destroyFriendship(s: String): User = throw new UnsupportedOperationException
  override def getNoRetweetsFriendships: IDs = throw new UnsupportedOperationException
  override def showFriendship(l: Long, l1: Long): Relationship = throw new UnsupportedOperationException
  override def showFriendship(s: String, s1: String): Relationship = throw new UnsupportedOperationException
  override def createFriendship(l: Long): User = throw new UnsupportedOperationException
  override def createFriendship(s: String): User = throw new UnsupportedOperationException
  override def createFriendship(l: Long, b: Boolean): User = throw new UnsupportedOperationException
  override def createFriendship(s: String, b: Boolean): User = throw new UnsupportedOperationException
  override def getFollowersList(l: Long, l1: Long): PagableResponseList[User] = throw new UnsupportedOperationException
  override def getFollowersList(s: String, l: Long): PagableResponseList[User] = throw new UnsupportedOperationException
  override def getFollowersList(l: Long, l1: Long, i: Int): PagableResponseList[User] = throw new UnsupportedOperationException
  override def getFollowersList(s: String, l: Long, i: Int): PagableResponseList[User] = throw new UnsupportedOperationException
  override def getFollowersList(l: Long, l1: Long, i: Int, b: Boolean, b1: Boolean): PagableResponseList[User] = throw new UnsupportedOperationException
  override def getFollowersList(s: String, l: Long, i: Int, b: Boolean, b1: Boolean): PagableResponseList[User] = throw new UnsupportedOperationException
  override def getFollowersIDs(l: Long): IDs = throw new UnsupportedOperationException
  override def getFollowersIDs(l: Long, l1: Long): IDs = throw new UnsupportedOperationException
  override def getFollowersIDs(l: Long, l1: Long, i: Int): IDs = throw new UnsupportedOperationException
  override def getFollowersIDs(s: String, l: Long): IDs = throw new UnsupportedOperationException
  override def getFollowersIDs(s: String, l: Long, i: Int): IDs = throw new UnsupportedOperationException
  override def getFriendsList(l: Long, l1: Long): PagableResponseList[User] = throw new UnsupportedOperationException
  override def getFriendsList(l: Long, l1: Long, i: Int): PagableResponseList[User] = throw new UnsupportedOperationException
  override def getFriendsList(s: String, l: Long): PagableResponseList[User] = throw new UnsupportedOperationException
  override def getFriendsList(s: String, l: Long, i: Int): PagableResponseList[User] = throw new UnsupportedOperationException
  override def getFriendsList(l: Long, l1: Long, i: Int, b: Boolean, b1: Boolean): PagableResponseList[User] = throw new UnsupportedOperationException
  override def getFriendsList(s: String, l: Long, i: Int, b: Boolean, b1: Boolean): PagableResponseList[User] = throw new UnsupportedOperationException
}
