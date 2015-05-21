package info.toming.susuru.wrapper

import java.io.{File, InputStream}
import java.{lang, util}

import akka.actor.ActorRef
import twitter4j._
import twitter4j.api.HelpResources.Language
import twitter4j.api._

import scala.reflect.ClassTag

class TwitterWrapper(val id: Long, val actor: ActorRef)(implicit val m: ClassTag[Twitter]) extends Twitter with TwitterBaseWrapper[Twitter] with OAuthSupportWrapper[Twitter] with OAuth2SupportWrapper[Twitter] with Wrapper[Twitter] {
  override lazy val friendsFollowers: FriendsFollowersResources = new FriendsFollowersResourcesWrapper(id, actor)
  override lazy val users: UsersResources = new UsersResourcesWrapper(id, actor)
  override lazy val savedSearches: SavedSearchesResources = new SavedSearchesResourcesWrapper(id, actor)
  override lazy val suggestedUsers: SuggestedUsersResources = new SuggestedUsersResourcesWrapper(id, actor)
  override lazy val directMessages: DirectMessagesResources = new DirectMessagesResourcesWrapper(id, actor)
  override lazy val tweets: TweetsResources = new TweetsResourcesWrapper(id, actor)
  override lazy val placesGeo: PlacesGeoResources = new PlacesGeoResourcesWrapper(id, actor)
  override lazy val favorites: FavoritesResources = new FavoritesResourcesWrapper(id, actor)
  override lazy val spamReporting: SpamReportingResource = new SpamReportingResourceWrapper(id, actor)
  override lazy val trends: TrendsResources = new TrendsResourcesWrapper(id, actor)
  override lazy val list: ListsResources = new ListsResourcesWrapper(id, actor)
  override lazy val timelines: TimelinesResources = new TimelinesResourcesWrapper(id, actor)
  override lazy val help: HelpResources = new HelpResourcesWrapper(id, actor)
  override lazy val search: SearchResource = new SearchResourceWrapper(id, actor)

  /* FriendsFollowersResources */
  override def getOutgoingFriendships(l: Long): IDs = friendsFollowers.getOutgoingFriendships(l)
  override def lookupFriendships(longs: Array[Long]): ResponseList[Friendship] = friendsFollowers.lookupFriendships(longs)
  override def lookupFriendships(strings: Array[String]): ResponseList[Friendship] = friendsFollowers.lookupFriendships(strings)
  override def updateFriendship(l: Long, b: Boolean, b1: Boolean): Relationship = friendsFollowers.updateFriendship(l, b, b1)
  override def updateFriendship(s: String, b: Boolean, b1: Boolean): Relationship = friendsFollowers.updateFriendship(s, b, b1)
  override def getIncomingFriendships(l: Long): IDs = friendsFollowers.getIncomingFriendships(l)
  override def getFriendsIDs(l: Long): IDs = friendsFollowers.getFriendsIDs(l)
  override def getFriendsIDs(l: Long, l1: Long): IDs = friendsFollowers.getFriendsIDs(l, l1)
  override def getFriendsIDs(l: Long, l1: Long, i: Int): IDs = friendsFollowers.getFriendsIDs(l, l1, i)
  override def getFriendsIDs(s: String, l: Long): IDs = friendsFollowers.getFriendsIDs(s, l)
  override def getFriendsIDs(s: String, l: Long, i: Int): IDs = friendsFollowers.getFriendsIDs(s, l, i)
  override def destroyFriendship(l: Long): User = friendsFollowers.destroyFriendship(l)
  override def destroyFriendship(s: String): User = friendsFollowers.destroyFriendship(s)
  override def getNoRetweetsFriendships: IDs = friendsFollowers.getNoRetweetsFriendships
  override def showFriendship(l: Long, l1: Long): Relationship = friendsFollowers.showFriendship(l, l1)
  override def showFriendship(s: String, s1: String): Relationship = friendsFollowers.showFriendship(s, s1)
  override def createFriendship(l: Long): User = friendsFollowers.createFriendship(l)
  override def createFriendship(s: String): User = friendsFollowers.createFriendship(s)
  override def createFriendship(l: Long, b: Boolean): User = friendsFollowers.createFriendship(l, b)
  override def createFriendship(s: String, b: Boolean): User = friendsFollowers.createFriendship(s, b)
  override def getFollowersList(l: Long, l1: Long): PagableResponseList[User] = friendsFollowers.getFollowersList(l, l1)
  override def getFollowersList(s: String, l: Long): PagableResponseList[User] = friendsFollowers.getFollowersList(s, l)
  override def getFollowersList(l: Long, l1: Long, i: Int): PagableResponseList[User] = friendsFollowers.getFollowersList(l, l1, i)
  override def getFollowersList(s: String, l: Long, i: Int): PagableResponseList[User] = friendsFollowers.getFollowersList(s, l, i)
  override def getFollowersList(l: Long, l1: Long, i: Int, b: Boolean, b1: Boolean): PagableResponseList[User] = friendsFollowers.getFollowersList(l, l1, i, b, b1)
  override def getFollowersList(s: String, l: Long, i: Int, b: Boolean, b1: Boolean): PagableResponseList[User] = friendsFollowers.getFollowersList(s, l, i, b, b1)
  override def getFollowersIDs(l: Long): IDs = friendsFollowers.getFollowersIDs(l)
  override def getFollowersIDs(l: Long, l1: Long): IDs = friendsFollowers.getFollowersIDs(l, l1)
  override def getFollowersIDs(l: Long, l1: Long, i: Int): IDs = friendsFollowers.getFollowersIDs(l, l1, i)
  override def getFollowersIDs(s: String, l: Long): IDs = friendsFollowers.getFollowersIDs(s, l)
  override def getFollowersIDs(s: String, l: Long, i: Int): IDs = friendsFollowers.getFollowersIDs(s, l, i)
  override def getFriendsList(l: Long, l1: Long): PagableResponseList[User] = friendsFollowers.getFriendsList(l, l1)
  override def getFriendsList(l: Long, l1: Long, i: Int): PagableResponseList[User] = friendsFollowers.getFriendsList(l, l1, i)
  override def getFriendsList(s: String, l: Long): PagableResponseList[User] = friendsFollowers.getFriendsList(s, l)
  override def getFriendsList(s: String, l: Long, i: Int): PagableResponseList[User] = friendsFollowers.getFriendsList(s, l, i)
  override def getFriendsList(l: Long, l1: Long, i: Int, b: Boolean, b1: Boolean): PagableResponseList[User] = friendsFollowers.getFriendsList(l, l1, i, b, b1)
  override def getFriendsList(s: String, l: Long, i: Int, b: Boolean, b1: Boolean): PagableResponseList[User] = friendsFollowers.getFriendsList(s, l, i, b, b1)

  /* UsersResources */
  override def removeProfileBanner(): Unit = users.removeProfileBanner()
  override def showUser(l: Long): User = users.showUser(l)
  override def showUser(s: String): User = users.showUser(s)
  override def lookupUsers(longs: Array[Long]): ResponseList[User] = users.lookupUsers(longs)
  override def lookupUsers(strings: Array[String]): ResponseList[User] = users.lookupUsers(strings)
  override def updateProfileBanner(file: File): Unit = users.updateProfileBanner(file)
  override def updateProfileBanner(inputStream: InputStream): Unit = users.updateProfileBanner(inputStream)
  override def updateProfile(s: String, s1: String, s2: String, s3: String): User = users.updateProfile(s, s1, s2, s3)
  override def getBlocksIDs: IDs = users.getBlocksIDs
  override def getBlocksIDs(l: Long): IDs = users.getBlocksIDs(l)
  override def searchUsers(s: String, i: Int): ResponseList[User] = users.searchUsers(s, i)
  override def getContributors(l: Long): ResponseList[User] = users.getContributors(l)
  override def getContributors(s: String): ResponseList[User] = users.getContributors(s)
  override def getAccountSettings: AccountSettings = users.getAccountSettings
  override def getMutesIDs(l: Long): IDs = users.getMutesIDs(l)
  override def destroyBlock(l: Long): User = users.destroyBlock(l)
  override def destroyBlock(s: String): User = users.destroyBlock(s)
  override def getContributees(l: Long): ResponseList[User] = users.getContributees(l)
  override def getContributees(s: String): ResponseList[User] = users.getContributees(s)
  override def getBlocksList: PagableResponseList[User] = users.getBlocksList
  override def getBlocksList(l: Long): PagableResponseList[User] = users.getBlocksList(l)
  override def updateAccountSettings(integer: Integer, aBoolean: lang.Boolean, s: String, s1: String, s2: String, s3: String): AccountSettings = users.updateAccountSettings(integer, aBoolean, s, s1, s2, s3)
  override def updateProfileColors(s: String, s1: String, s2: String, s3: String, s4: String): User = users.updateProfileColors(s, s1, s2, s3, s4)
  override def getMutesList(l: Long): PagableResponseList[User] = users.getMutesList(l)
  override def destroyMute(l: Long): User = users.destroyMute(l)
  override def destroyMute(s: String): User = users.destroyMute(s)
  override def createBlock(l: Long): User = users.createBlock(l)
  override def createBlock(s: String): User = users.createBlock(s)
  override def createMute(l: Long): User = users.createMute(l)
  override def createMute(s: String): User = users.createMute(s)
  override def updateProfileBackgroundImage(file: File, b: Boolean): User = users.updateProfileBackgroundImage(file, b)
  override def updateProfileBackgroundImage(inputStream: InputStream, b: Boolean): User = users.updateProfileBackgroundImage(inputStream, b)
  override def verifyCredentials(): User = users.verifyCredentials()
  override def updateProfileImage(file: File): User = users.updateProfileImage(file)
  override def updateProfileImage(inputStream: InputStream): User = users.updateProfileImage(inputStream)

  /* SavedSearchesResources */
  override def destroySavedSearch(i: Int): SavedSearch = savedSearches.destroySavedSearch(i)
  override def getSavedSearches: ResponseList[SavedSearch] = savedSearches.getSavedSearches
  override def createSavedSearch(s: String): SavedSearch = savedSearches.createSavedSearch(s)
  override def showSavedSearch(i: Int): SavedSearch = savedSearches.showSavedSearch(i)

  /* SuggestedUsersResources */
  override def getMemberSuggestions(s: String): ResponseList[User] = suggestedUsers.getMemberSuggestions(s)
  override def getSuggestedUserCategories: ResponseList[Category] = suggestedUsers.getSuggestedUserCategories
  override def getUserSuggestions(s: String): ResponseList[User] = suggestedUsers.getUserSuggestions(s)

  /* DirectMessagesResources */
  override def showDirectMessage(l: Long): DirectMessage = directMessages.showDirectMessage(l)
  override def sendDirectMessage(l: Long, s: String): DirectMessage = directMessages.sendDirectMessage(l, s)
  override def sendDirectMessage(s: String, s1: String): DirectMessage = directMessages.sendDirectMessage(s, s1)
  override def destroyDirectMessage(l: Long): DirectMessage = directMessages.destroyDirectMessage(l)
  override def getDirectMessages: ResponseList[DirectMessage] = directMessages.getDirectMessages
  override def getDirectMessages(paging: Paging): ResponseList[DirectMessage] = directMessages.getDirectMessages(paging)
  override def getDMImageAsStream(s: String): InputStream = directMessages.getDMImageAsStream(s)
  override def getSentDirectMessages: ResponseList[DirectMessage] = directMessages.getSentDirectMessages
  override def getSentDirectMessages(paging: Paging): ResponseList[DirectMessage] = directMessages.getSentDirectMessages(paging)

  /* TweetsResources */
  override def getOEmbed(oEmbedRequest: OEmbedRequest): OEmbed = tweets.getOEmbed(oEmbedRequest)
  override def destroyStatus(l: Long): Status = tweets.destroyStatus(l)
  override def lookup(longs: Array[Long]): ResponseList[Status] = tweets.lookup(longs)
  override def uploadMedia(file: File): UploadedMedia = tweets.uploadMedia(file)
  override def uploadMedia(s: String, inputStream: InputStream): UploadedMedia = tweets.uploadMedia(s, inputStream)
  override def updateStatus(s: String): Status = tweets.updateStatus(s)
  override def updateStatus(statusUpdate: StatusUpdate): Status = tweets.updateStatus(statusUpdate)
  override def retweetStatus(l: Long): Status = tweets.retweetStatus(l)
  override def getRetweets(l: Long): ResponseList[Status] = tweets.getRetweets(l)
  override def getRetweeterIds(l: Long, l1: Long): IDs = tweets.getRetweeterIds(l, l1)
  override def getRetweeterIds(l: Long, i: Int, l1: Long): IDs = tweets.getRetweeterIds(l, i, l1)
  override def showStatus(l: Long): Status = tweets.showStatus(l)

  /* PlacesGeoResources */
  override def reverseGeoCode(geoQuery: GeoQuery): ResponseList[Place] = placesGeo.reverseGeoCode(geoQuery)
  override def searchPlaces(geoQuery: GeoQuery): ResponseList[Place] = placesGeo.searchPlaces(geoQuery)
  override def getGeoDetails(s: String): Place = placesGeo.getGeoDetails(s)
  override def getSimilarPlaces(geoLocation: GeoLocation, s: String, s1: String, s2: String): ResponseList[Place] = placesGeo.getSimilarPlaces(geoLocation, s, s1, s2)

  /* FavoritesResources */
  override def createFavorite(l: Long): Status = favorites.createFavorite(l)
  override def destroyFavorite(l: Long): Status = favorites.destroyFavorite(l)
  override def getFavorites: ResponseList[Status] = favorites.getFavorites
  override def getFavorites(l: Long): ResponseList[Status] = favorites.getFavorites(l)
  override def getFavorites(s: String): ResponseList[Status] = favorites.getFavorites(s)
  override def getFavorites(paging: Paging): ResponseList[Status] = favorites.getFavorites(paging)
  override def getFavorites(l: Long, paging: Paging): ResponseList[Status] = favorites.getFavorites(l, paging)
  override def getFavorites(s: String, paging: Paging): ResponseList[Status] = favorites.getFavorites(s, paging)

  /* SpamReportingResource */
  override def reportSpam(l: Long): User = spamReporting.reportSpam(l)
  override def reportSpam(s: String): User = spamReporting.reportSpam(s)

  /* TrendsResources */
  override def getClosestTrends(geoLocation: GeoLocation): ResponseList[Location] = trends.getClosestTrends(geoLocation)
  override def getAvailableTrends: ResponseList[Location] = trends.getAvailableTrends
  override def getPlaceTrends(i: Int): Trends = trends.getPlaceTrends(i)

  /* ListsResources */
  override def destroyUserListSubscription(l: Long): UserList = list.destroyUserListSubscription(l)
  override def destroyUserListSubscription(l: Long, s: String): UserList = list.destroyUserListSubscription(l, s)
  override def destroyUserListSubscription(s: String, s1: String): UserList = list.destroyUserListSubscription(s, s1)
  override def updateUserList(l: Long, s: String, b: Boolean, s1: String): UserList = list.updateUserList(l, s, b, s1)
  override def updateUserList(l: Long, s: String, s1: String, b: Boolean, s2: String): UserList = list.updateUserList(l, s, s1, b, s2)
  override def updateUserList(s: String, s1: String, s2: String, b: Boolean, s3: String): UserList = list.updateUserList(s, s1, s2, b, s3)
  override def createUserListMembers(l: Long, longs: Array[Long]): UserList = list.createUserListMembers(l, longs)
  override def createUserListMembers(l: Long, s: String, longs: Array[Long]): UserList = list.createUserListMembers(l, s, longs)
  override def createUserListMembers(s: String, s1: String, longs: Array[Long]): UserList = list.createUserListMembers(s, s1, longs)
  override def createUserListMembers(l: Long, strings: Array[String]): UserList = list.createUserListMembers(l, strings)
  override def createUserListMembers(l: Long, s: String, strings: Array[String]): UserList = list.createUserListMembers(l, s, strings)
  override def createUserListMembers(s: String, s1: String, strings: Array[String]): UserList = list.createUserListMembers(s, s1, strings)
  override def getUserListSubscriptions(s: String, l: Long): PagableResponseList[UserList] = list.getUserListSubscriptions(s, l)
  override def getUserListStatuses(l: Long, paging: Paging): ResponseList[Status] = list.getUserListStatuses(l, paging)
  override def getUserListStatuses(l: Long, s: String, paging: Paging): ResponseList[Status] = list.getUserListStatuses(l, s, paging)
  override def getUserListStatuses(s: String, s1: String, paging: Paging): ResponseList[Status] = list.getUserListStatuses(s, s1, paging)
  override def getUserListsOwnerships(s: String, i: Int, l: Long): PagableResponseList[UserList] = list.getUserListsOwnerships(s, i, l)
  override def getUserListsOwnerships(l: Long, i: Int, l1: Long): PagableResponseList[UserList] = list.getUserListsOwnerships(l, i, l1)
  override def getUserLists(s: String): ResponseList[UserList] = list.getUserLists(s)
  override def getUserLists(l: Long): ResponseList[UserList] = list.getUserLists(l)
  override def showUserListMembership(l: Long, l1: Long): User = list.showUserListMembership(l, l1)
  override def showUserListMembership(l: Long, s: String, l1: Long): User = list.showUserListMembership(l, s, l1)
  override def showUserListMembership(s: String, s1: String, l: Long): User = list.showUserListMembership(s, s1, l)
  override def createUserListMember(l: Long, l1: Long): UserList = list.createUserListMember(l, l1)
  override def createUserListMember(l: Long, s: String, l1: Long): UserList = list.createUserListMember(l, s, l1)
  override def createUserListMember(s: String, s1: String, l: Long): UserList = list.createUserListMember(s, s1, l)
  override def getUserListMemberships(l: Long): PagableResponseList[UserList] = list.getUserListMemberships(l)
  override def getUserListMemberships(l: Long, l1: Long): PagableResponseList[UserList] = list.getUserListMemberships(l, l1)
  override def getUserListMemberships(s: String, l: Long): PagableResponseList[UserList] = list.getUserListMemberships(s, l)
  override def getUserListMemberships(s: String, l: Long, b: Boolean): PagableResponseList[UserList] = list.getUserListMemberships(s, l, b)
  override def getUserListMemberships(l: Long, l1: Long, b: Boolean): PagableResponseList[UserList] = list.getUserListMemberships(l, l1, b)
  override def showUserList(l: Long): UserList = list.showUserList(l)
  override def showUserList(l: Long, s: String): UserList = list.showUserList(l, s)
  override def showUserList(s: String, s1: String): UserList = list.showUserList(s, s1)
  override def getUserListSubscribers(l: Long, l1: Long): PagableResponseList[User] = list.getUserListSubscribers(l, l1)
  override def getUserListSubscribers(l: Long, s: String, l1: Long): PagableResponseList[User] = list.getUserListSubscribers(l, s, l1)
  override def getUserListSubscribers(s: String, s1: String, l: Long): PagableResponseList[User] = list.getUserListSubscribers(s, s1, l)
  override def showUserListSubscription(l: Long, l1: Long): User = list.showUserListSubscription(l, l1)
  override def showUserListSubscription(l: Long, s: String, l1: Long): User = list.showUserListSubscription(l, s, l1)
  override def showUserListSubscription(s: String, s1: String, l: Long): User = list.showUserListSubscription(s, s1, l)
  override def createUserListSubscription(l: Long): UserList = list.createUserListSubscription(l)
  override def createUserListSubscription(l: Long, s: String): UserList = list.createUserListSubscription(l, s)
  override def createUserListSubscription(s: String, s1: String): UserList = list.createUserListSubscription(s, s1)
  override def destroyUserListMembers(l: Long, strings: Array[String]): UserList = list.destroyUserListMembers(l, strings)
  override def destroyUserListMembers(l: Long, longs: Array[Long]): UserList = list.destroyUserListMembers(l, longs)
  override def destroyUserListMembers(s: String, s1: String, strings: Array[String]): UserList = list.destroyUserListMembers(s, s1, strings)
  override def destroyUserListMember(l: Long, l1: Long): UserList = list.destroyUserListMember(l, l1)
  override def destroyUserListMember(l: Long, s: String): UserList = list.destroyUserListMember(l, s)
  override def destroyUserListMember(l: Long, s: String, l1: Long): UserList = list.destroyUserListMember(l, s, l1)
  override def destroyUserListMember(s: String, s1: String, l: Long): UserList = list.destroyUserListMember(s, s1, l)
  override def getUserListMembers(l: Long, l1: Long): PagableResponseList[User] = list.getUserListMembers(l, l1)
  override def getUserListMembers(l: Long, s: String, l1: Long): PagableResponseList[User] = list.getUserListMembers(l, s, l1)
  override def getUserListMembers(s: String, s1: String, l: Long): PagableResponseList[User] = list.getUserListMembers(s, s1, l)
  override def destroyUserList(s: String, s1: String): UserList = list.destroyUserList(s, s1)
  override def destroyUserList(l: Long, s: String): UserList = list.destroyUserList(l, s)
  override def destroyUserList(l: Long): UserList = list.destroyUserList(l)
  override def createUserList(s: String, b: Boolean, s1: String): UserList = list.createUserList(s, b, s1)

  /* TimelinesResources */
  override def getHomeTimeline: ResponseList[Status] = timelines.getHomeTimeline
  override def getHomeTimeline(paging: Paging): ResponseList[Status] = timelines.getHomeTimeline(paging)
  override def getUserTimeline(s: String, paging: Paging): ResponseList[Status] = timelines.getUserTimeline(s, paging)
  override def getUserTimeline(l: Long, paging: Paging): ResponseList[Status] = timelines.getUserTimeline(l, paging)
  override def getUserTimeline(s: String): ResponseList[Status] = timelines.getUserTimeline(s)
  override def getUserTimeline(l: Long): ResponseList[Status] = timelines.getUserTimeline(l)
  override def getUserTimeline: ResponseList[Status] = timelines.getUserTimeline
  override def getUserTimeline(paging: Paging): ResponseList[Status] = timelines.getUserTimeline(paging)
  override def getRetweetsOfMe: ResponseList[Status] = timelines.getRetweetsOfMe
  override def getRetweetsOfMe(paging: Paging): ResponseList[Status] = timelines.getRetweetsOfMe(paging)
  override def getMentionsTimeline: ResponseList[Status] = timelines.getMentionsTimeline
  override def getMentionsTimeline(paging: Paging): ResponseList[Status] = timelines.getMentionsTimeline(paging)

  /* HelpResources */
  override def getAPIConfiguration: TwitterAPIConfiguration = help.getAPIConfiguration
  override def getTermsOfService: String = help.getTermsOfService
  override def getPrivacyPolicy: String = help.getPrivacyPolicy
  override def getRateLimitStatus: util.Map[String, RateLimitStatus] = help.getRateLimitStatus
  override def getRateLimitStatus(strings: String*): util.Map[String, RateLimitStatus] = help.getRateLimitStatus(strings: _*)
  override def getLanguages: ResponseList[Language] = help.getLanguages

  /* SearchResource */
  override def search(query: Query): QueryResult = search.search(query)
}


































