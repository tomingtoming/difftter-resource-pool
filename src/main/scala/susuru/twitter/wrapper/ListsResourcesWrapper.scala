package susuru.twitter.wrapper

import twitter4j._
import twitter4j.api.ListsResources

class ListsResourcesWrapper(twitter: Twitter) extends ListsResources {
  override def destroyUserListSubscription(l: Long): UserList = throw new NotImplementedError("Sorry!")

  override def destroyUserListSubscription(l: Long, s: String): UserList = throw new NotImplementedError("Sorry!")

  override def destroyUserListSubscription(s: String, s1: String): UserList = throw new NotImplementedError("Sorry!")

  override def createUserList(s: String, b: Boolean, s1: String): UserList = throw new NotImplementedError("Sorry!")

  override def updateUserList(l: Long, s: String, b: Boolean, s1: String): UserList = throw new NotImplementedError("Sorry!")

  override def updateUserList(l: Long, s: String, s1: String, b: Boolean, s2: String): UserList = throw new NotImplementedError("Sorry!")

  override def updateUserList(s: String, s1: String, s2: String, b: Boolean, s3: String): UserList = throw new NotImplementedError("Sorry!")

  override def destroyUserList(l: Long): UserList = throw new NotImplementedError("Sorry!")

  override def destroyUserList(l: Long, s: String): UserList = throw new NotImplementedError("Sorry!")

  override def destroyUserList(s: String, s1: String): UserList = throw new NotImplementedError("Sorry!")

  override def createUserListMembers(l: Long, longs: Long*): UserList = throw new NotImplementedError("Sorry!")

  override def createUserListMembers(l: Long, s: String, longs: Long*): UserList = throw new NotImplementedError("Sorry!")

  override def createUserListMembers(s: String, s1: String, longs: Long*): UserList = throw new NotImplementedError("Sorry!")

  override def createUserListMembers(l: Long, strings: String*): UserList = throw new NotImplementedError("Sorry!")

  override def createUserListMembers(l: Long, s: String, strings: String*): UserList = throw new NotImplementedError("Sorry!")

  override def createUserListMembers(s: String, s1: String, strings: String*): UserList = throw new NotImplementedError("Sorry!")

  override def getUserListSubscriptions(s: String, l: Long): PagableResponseList[UserList] = throw new NotImplementedError("Sorry!")

  override def getUserListSubscriptions(s: String, i: Int, l: Long): PagableResponseList[UserList] = throw new NotImplementedError("Sorry!")

  override def getUserListSubscriptions(l: Long, l1: Long): PagableResponseList[UserList] = throw new NotImplementedError("Sorry!")

  override def getUserListSubscriptions(l: Long, i: Int, l1: Long): PagableResponseList[UserList] = throw new NotImplementedError("Sorry!")

  override def getUserListStatuses(l: Long, paging: Paging): ResponseList[Status] = throw new NotImplementedError("Sorry!")

  override def getUserListStatuses(l: Long, s: String, paging: Paging): ResponseList[Status] = throw new NotImplementedError("Sorry!")

  override def getUserListStatuses(s: String, s1: String, paging: Paging): ResponseList[Status] = throw new NotImplementedError("Sorry!")

  override def getUserListsOwnerships(s: String, l: Long): PagableResponseList[UserList] = throw new NotImplementedError("Sorry!")

  override def getUserListsOwnerships(s: String, i: Int, l: Long): PagableResponseList[UserList] = throw new NotImplementedError("Sorry!")

  override def getUserListsOwnerships(l: Long, l1: Long): PagableResponseList[UserList] = throw new NotImplementedError("Sorry!")

  override def getUserListsOwnerships(l: Long, i: Int, l1: Long): PagableResponseList[UserList] = throw new NotImplementedError("Sorry!")

  override def getUserLists(s: String): ResponseList[UserList] = throw new NotImplementedError("Sorry!")

  override def getUserLists(s: String, b: Boolean): ResponseList[UserList] = throw new NotImplementedError("Sorry!")

  override def getUserLists(l: Long): ResponseList[UserList] = throw new NotImplementedError("Sorry!")

  override def getUserLists(l: Long, b: Boolean): ResponseList[UserList] = throw new NotImplementedError("Sorry!")

  override def showUserListMembership(l: Long, l1: Long): User = throw new NotImplementedError("Sorry!")

  override def showUserListMembership(l: Long, s: String, l1: Long): User = throw new NotImplementedError("Sorry!")

  override def showUserListMembership(s: String, s1: String, l: Long): User = throw new NotImplementedError("Sorry!")

  override def createUserListMember(l: Long, l1: Long): UserList = throw new NotImplementedError("Sorry!")

  override def createUserListMember(l: Long, s: String, l1: Long): UserList = throw new NotImplementedError("Sorry!")

  override def createUserListMember(s: String, s1: String, l: Long): UserList = throw new NotImplementedError("Sorry!")

  override def getUserListMemberships(l: Long): PagableResponseList[UserList] = throw new NotImplementedError("Sorry!")

  override def getUserListMemberships(i: Int, l: Long): PagableResponseList[UserList] = throw new NotImplementedError("Sorry!")

  override def getUserListMemberships(l: Long, l1: Long): PagableResponseList[UserList] = throw new NotImplementedError("Sorry!")

  override def getUserListMemberships(l: Long, i: Int, l1: Long): PagableResponseList[UserList] = throw new NotImplementedError("Sorry!")

  override def getUserListMemberships(s: String, l: Long): PagableResponseList[UserList] = throw new NotImplementedError("Sorry!")

  override def getUserListMemberships(s: String, i: Int, l: Long): PagableResponseList[UserList] = throw new NotImplementedError("Sorry!")

  override def getUserListMemberships(s: String, l: Long, b: Boolean): PagableResponseList[UserList] = throw new NotImplementedError("Sorry!")

  override def getUserListMemberships(s: String, i: Int, l: Long, b: Boolean): PagableResponseList[UserList] = throw new NotImplementedError("Sorry!")

  override def getUserListMemberships(l: Long, l1: Long, b: Boolean): PagableResponseList[UserList] = throw new NotImplementedError("Sorry!")

  override def getUserListMemberships(l: Long, i: Int, l1: Long, b: Boolean): PagableResponseList[UserList] = throw new NotImplementedError("Sorry!")

  override def showUserList(l: Long): UserList = throw new NotImplementedError("Sorry!")

  override def showUserList(l: Long, s: String): UserList = throw new NotImplementedError("Sorry!")

  override def showUserList(s: String, s1: String): UserList = throw new NotImplementedError("Sorry!")

  override def getUserListSubscribers(l: Long, l1: Long): PagableResponseList[User] = throw new NotImplementedError("Sorry!")

  override def getUserListSubscribers(l: Long, i: Int, l1: Long): PagableResponseList[User] = throw new NotImplementedError("Sorry!")

  override def getUserListSubscribers(l: Long, i: Int, l1: Long, b: Boolean): PagableResponseList[User] = throw new NotImplementedError("Sorry!")

  override def getUserListSubscribers(l: Long, s: String, l1: Long): PagableResponseList[User] = throw new NotImplementedError("Sorry!")

  override def getUserListSubscribers(l: Long, s: String, i: Int, l1: Long): PagableResponseList[User] = throw new NotImplementedError("Sorry!")

  override def getUserListSubscribers(l: Long, s: String, i: Int, l1: Long, b: Boolean): PagableResponseList[User] = throw new NotImplementedError("Sorry!")

  override def getUserListSubscribers(s: String, s1: String, l: Long): PagableResponseList[User] = throw new NotImplementedError("Sorry!")

  override def getUserListSubscribers(s: String, s1: String, i: Int, l: Long): PagableResponseList[User] = throw new NotImplementedError("Sorry!")

  override def getUserListSubscribers(s: String, s1: String, i: Int, l: Long, b: Boolean): PagableResponseList[User] = throw new NotImplementedError("Sorry!")

  override def showUserListSubscription(l: Long, l1: Long): User = throw new NotImplementedError("Sorry!")

  override def showUserListSubscription(l: Long, s: String, l1: Long): User = throw new NotImplementedError("Sorry!")

  override def showUserListSubscription(s: String, s1: String, l: Long): User = throw new NotImplementedError("Sorry!")

  override def createUserListSubscription(l: Long): UserList = throw new NotImplementedError("Sorry!")

  override def createUserListSubscription(l: Long, s: String): UserList = throw new NotImplementedError("Sorry!")

  override def createUserListSubscription(s: String, s1: String): UserList = throw new NotImplementedError("Sorry!")

  override def destroyUserListMembers(l: Long, strings: Array[String]): UserList = throw new NotImplementedError("Sorry!")

  override def destroyUserListMembers(l: Long, longs: Array[Long]): UserList = throw new NotImplementedError("Sorry!")

  override def destroyUserListMembers(s: String, s1: String, strings: Array[String]): UserList = throw new NotImplementedError("Sorry!")

  override def destroyUserListMember(l: Long, l1: Long): UserList = throw new NotImplementedError("Sorry!")

  override def destroyUserListMember(l: Long, s: String): UserList = throw new NotImplementedError("Sorry!")

  override def destroyUserListMember(l: Long, s: String, l1: Long): UserList = throw new NotImplementedError("Sorry!")

  override def destroyUserListMember(s: String, s1: String, l: Long): UserList = throw new NotImplementedError("Sorry!")

  override def getUserListMembers(l: Long, l1: Long): PagableResponseList[User] = throw new NotImplementedError("Sorry!")

  override def getUserListMembers(l: Long, i: Int, l1: Long): PagableResponseList[User] = throw new NotImplementedError("Sorry!")

  override def getUserListMembers(l: Long, i: Int, l1: Long, b: Boolean): PagableResponseList[User] = throw new NotImplementedError("Sorry!")

  override def getUserListMembers(l: Long, s: String, l1: Long): PagableResponseList[User] = throw new NotImplementedError("Sorry!")

  override def getUserListMembers(l: Long, s: String, i: Int, l1: Long): PagableResponseList[User] = throw new NotImplementedError("Sorry!")

  override def getUserListMembers(l: Long, s: String, i: Int, l1: Long, b: Boolean): PagableResponseList[User] = throw new NotImplementedError("Sorry!")

  override def getUserListMembers(s: String, s1: String, l: Long): PagableResponseList[User] = throw new NotImplementedError("Sorry!")

  override def getUserListMembers(s: String, s1: String, i: Int, l: Long): PagableResponseList[User] = throw new NotImplementedError("Sorry!")

  override def getUserListMembers(s: String, s1: String, i: Int, l: Long, b: Boolean): PagableResponseList[User] = throw new NotImplementedError("Sorry!")
}
