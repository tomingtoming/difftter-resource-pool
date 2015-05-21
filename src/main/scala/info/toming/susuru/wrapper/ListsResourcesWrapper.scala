package info.toming.susuru.wrapper

import akka.actor.ActorRef
import twitter4j._
import twitter4j.api.ListsResources

import scala.reflect.ClassTag

class ListsResourcesWrapper(val id: Long, val actor: ActorRef)(implicit val m: ClassTag[ListsResources]) extends ListsResources with Wrapper[ListsResources] {
  override def destroyUserListSubscription(l: Long): UserList = throw new UnsupportedOperationException
  override def destroyUserListSubscription(l: Long, s: String): UserList = throw new UnsupportedOperationException
  override def destroyUserListSubscription(s: String, s1: String): UserList = throw new UnsupportedOperationException
  override def updateUserList(l: Long, s: String, b: Boolean, s1: String): UserList = throw new UnsupportedOperationException
  override def updateUserList(l: Long, s: String, s1: String, b: Boolean, s2: String): UserList = throw new UnsupportedOperationException
  override def updateUserList(s: String, s1: String, s2: String, b: Boolean, s3: String): UserList = throw new UnsupportedOperationException
  override def createUserListMembers(l: Long, longs: Array[Long]): UserList = throw new UnsupportedOperationException
  override def createUserListMembers(l: Long, s: String, longs: Array[Long]): UserList = throw new UnsupportedOperationException
  override def createUserListMembers(s: String, s1: String, longs: Array[Long]): UserList = throw new UnsupportedOperationException
  override def createUserListMembers(l: Long, strings: Array[String]): UserList = throw new UnsupportedOperationException
  override def createUserListMembers(l: Long, s: String, strings: Array[String]): UserList = throw new UnsupportedOperationException
  override def createUserListMembers(s: String, s1: String, strings: Array[String]): UserList = throw new UnsupportedOperationException
  override def getUserListSubscriptions(s: String, l: Long): PagableResponseList[UserList] = throw new UnsupportedOperationException
  override def getUserListStatuses(l: Long, paging: Paging): ResponseList[Status] = throw new UnsupportedOperationException
  override def getUserListStatuses(l: Long, s: String, paging: Paging): ResponseList[Status] = throw new UnsupportedOperationException
  override def getUserListStatuses(s: String, s1: String, paging: Paging): ResponseList[Status] = throw new UnsupportedOperationException
  override def getUserListsOwnerships(s: String, i: Int, l: Long): PagableResponseList[UserList] = throw new UnsupportedOperationException
  override def getUserListsOwnerships(l: Long, i: Int, l1: Long): PagableResponseList[UserList] = throw new UnsupportedOperationException
  override def getUserLists(s: String): ResponseList[UserList] = throw new UnsupportedOperationException
  override def getUserLists(l: Long): ResponseList[UserList] = throw new UnsupportedOperationException
  override def showUserListMembership(l: Long, l1: Long): User = throw new UnsupportedOperationException
  override def showUserListMembership(l: Long, s: String, l1: Long): User = throw new UnsupportedOperationException
  override def showUserListMembership(s: String, s1: String, l: Long): User = throw new UnsupportedOperationException
  override def createUserListMember(l: Long, l1: Long): UserList = throw new UnsupportedOperationException
  override def createUserListMember(l: Long, s: String, l1: Long): UserList = throw new UnsupportedOperationException
  override def createUserListMember(s: String, s1: String, l: Long): UserList = throw new UnsupportedOperationException
  override def getUserListMemberships(l: Long): PagableResponseList[UserList] = throw new UnsupportedOperationException
  override def getUserListMemberships(l: Long, l1: Long): PagableResponseList[UserList] = throw new UnsupportedOperationException
  override def getUserListMemberships(s: String, l: Long): PagableResponseList[UserList] = throw new UnsupportedOperationException
  override def getUserListMemberships(s: String, l: Long, b: Boolean): PagableResponseList[UserList] = throw new UnsupportedOperationException
  override def getUserListMemberships(l: Long, l1: Long, b: Boolean): PagableResponseList[UserList] = throw new UnsupportedOperationException
  override def showUserList(l: Long): UserList = throw new UnsupportedOperationException
  override def showUserList(l: Long, s: String): UserList = throw new UnsupportedOperationException
  override def showUserList(s: String, s1: String): UserList = throw new UnsupportedOperationException
  override def getUserListSubscribers(l: Long, l1: Long): PagableResponseList[User] = throw new UnsupportedOperationException
  override def getUserListSubscribers(l: Long, s: String, l1: Long): PagableResponseList[User] = throw new UnsupportedOperationException
  override def getUserListSubscribers(s: String, s1: String, l: Long): PagableResponseList[User] = throw new UnsupportedOperationException
  override def showUserListSubscription(l: Long, l1: Long): User = throw new UnsupportedOperationException
  override def showUserListSubscription(l: Long, s: String, l1: Long): User = throw new UnsupportedOperationException
  override def showUserListSubscription(s: String, s1: String, l: Long): User = throw new UnsupportedOperationException
  override def createUserListSubscription(l: Long): UserList = throw new UnsupportedOperationException
  override def createUserListSubscription(l: Long, s: String): UserList = throw new UnsupportedOperationException
  override def createUserListSubscription(s: String, s1: String): UserList = throw new UnsupportedOperationException
  override def destroyUserListMembers(l: Long, strings: Array[String]): UserList = throw new UnsupportedOperationException
  override def destroyUserListMembers(l: Long, longs: Array[Long]): UserList = throw new UnsupportedOperationException
  override def destroyUserListMembers(s: String, s1: String, strings: Array[String]): UserList = throw new UnsupportedOperationException
  override def destroyUserListMember(l: Long, l1: Long): UserList = throw new UnsupportedOperationException
  override def destroyUserListMember(l: Long, s: String): UserList = throw new UnsupportedOperationException
  override def destroyUserListMember(l: Long, s: String, l1: Long): UserList = throw new UnsupportedOperationException
  override def destroyUserListMember(s: String, s1: String, l: Long): UserList = throw new UnsupportedOperationException
  override def getUserListMembers(l: Long, l1: Long): PagableResponseList[User] = throw new UnsupportedOperationException
  override def getUserListMembers(l: Long, s: String, l1: Long): PagableResponseList[User] = throw new UnsupportedOperationException
  override def getUserListMembers(s: String, s1: String, l: Long): PagableResponseList[User] = throw new UnsupportedOperationException
  override def destroyUserList(s: String, s1: String): UserList = throw new UnsupportedOperationException
  override def destroyUserList(l: Long, s: String): UserList = throw new UnsupportedOperationException
  override def destroyUserList(l: Long): UserList = throw new UnsupportedOperationException
  override def createUserList(s: String, b: Boolean, s1: String): UserList = throw new UnsupportedOperationException
}
