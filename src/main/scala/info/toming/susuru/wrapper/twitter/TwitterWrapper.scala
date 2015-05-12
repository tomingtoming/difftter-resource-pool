package info.toming.susuru.wrapper.twitter

import java.io.{File, InputStream}
import java.{lang, util}

import twitter4j._
import twitter4j.api.HelpResources.Language
import twitter4j.api._
import twitter4j.auth.{AccessToken, Authorization, OAuth2Token, RequestToken}
import twitter4j.conf.Configuration

class TwitterWrapper(t: Twitter) extends Twitter {
  override def friendsFollowers(): FriendsFollowersResources = t.friendsFollowers()

  override def users(): UsersResources = t.users()

  override def savedSearches(): SavedSearchesResources = t.savedSearches()

  override def suggestedUsers(): SuggestedUsersResources = t.suggestedUsers()

  override def directMessages(): DirectMessagesResources = t.directMessages()

  override def tweets(): TweetsResources = t.tweets()

  override def placesGeo(): PlacesGeoResources = t.placesGeo()

  override def favorites(): FavoritesResources = t.favorites()

  override def spamReporting(): SpamReportingResource = t.spamReporting()

  override def trends(): TrendsResources = t.trends()

  override def list(): ListsResources = t.list()

  override def timelines(): TimelinesResources = t.timelines()

  override def help(): HelpResources = t.help()

  override def search(): SearchResource = t.search()

  override def getAPIConfiguration: TwitterAPIConfiguration = t.getAPIConfiguration

  override def getTermsOfService: String = t.getTermsOfService

  override def getPrivacyPolicy: String = t.getPrivacyPolicy

  override def getRateLimitStatus: util.Map[String, RateLimitStatus] = t.getRateLimitStatus

  override def getRateLimitStatus(strings: String*): util.Map[String, RateLimitStatus] = t.getRateLimitStatus(strings: _*)

  override def getLanguages: ResponseList[Language] = t.getLanguages

  override def getOEmbed(oEmbedRequest: OEmbedRequest): OEmbed = t.getOEmbed(oEmbedRequest)

  override def destroyStatus(l: Long): Status = t.destroyStatus(l)

  override def lookup(longs: Array[Long]): ResponseList[Status] = t.lookup(longs)

  override def uploadMedia(file: File): UploadedMedia = t.uploadMedia(file)

  override def uploadMedia(s: String, inputStream: InputStream): UploadedMedia = t.uploadMedia(s, inputStream)

  override def updateStatus(s: String): Status = t.updateStatus(s)

  override def updateStatus(statusUpdate: StatusUpdate): Status = t.updateStatus(statusUpdate)

  override def retweetStatus(l: Long): Status = t.retweetStatus(l)

  override def getRetweets(l: Long): ResponseList[Status] = t.getRetweets(l)

  override def getRetweeterIds(l: Long, l1: Long): IDs = t.getRetweeterIds(l, l1)

  override def getRetweeterIds(l: Long, i: Int, l1: Long): IDs = t.getRetweeterIds(l, i, l1)

  override def showStatus(l: Long): Status = t.showStatus(l)

  override def getHomeTimeline: ResponseList[Status] = t.getHomeTimeline

  override def getHomeTimeline(paging: Paging): ResponseList[Status] = t.getHomeTimeline(paging)

  override def getUserTimeline(s: String, paging: Paging): ResponseList[Status] = t.getUserTimeline(s, paging)

  override def getUserTimeline(l: Long, paging: Paging): ResponseList[Status] = t.getUserTimeline(l, paging)

  override def getUserTimeline(s: String): ResponseList[Status] = t.getUserTimeline(s)

  override def getUserTimeline(l: Long): ResponseList[Status] = t.getUserTimeline(l)

  override def getUserTimeline: ResponseList[Status] = t.getUserTimeline

  override def getUserTimeline(paging: Paging): ResponseList[Status] = t.getUserTimeline(paging)

  override def getMentionsTimeline: ResponseList[Status] = t.getMentionsTimeline

  override def getMentionsTimeline(paging: Paging): ResponseList[Status] = t.getMentionsTimeline(paging)

  override def getRetweetsOfMe: ResponseList[Status] = t.getRetweetsOfMe

  override def getRetweetsOfMe(paging: Paging): ResponseList[Status] = t.getRetweetsOfMe(paging)

  override def reverseGeoCode(geoQuery: GeoQuery): ResponseList[Place] = t.reverseGeoCode(geoQuery)

  override def searchPlaces(geoQuery: GeoQuery): ResponseList[Place] = t.searchPlaces(geoQuery)

  override def getGeoDetails(s: String): Place = t.getGeoDetails(s)

  override def getSimilarPlaces(geoLocation: GeoLocation, s: String, s1: String, s2: String): ResponseList[Place] = t.getSimilarPlaces(geoLocation, s, s1, s2)

  override def setOAuthConsumer(s: String, s1: String): Unit = t.setOAuthConsumer(s, s1)

  override def getOAuth2Token: OAuth2Token = t.getOAuth2Token

  override def invalidateOAuth2Token(): Unit = t.invalidateOAuth2Token()

  override def setOAuth2Token(oAuth2Token: OAuth2Token): Unit = t.setOAuth2Token(oAuth2Token)

  override def reportSpam(l: Long): User = t.reportSpam(l)

  override def reportSpam(s: String): User = t.reportSpam(s)

  override def search(query: Query): QueryResult = t.search(query)

  override def showDirectMessage(l: Long): DirectMessage = t.showDirectMessage(l)

  override def sendDirectMessage(l: Long, s: String): DirectMessage = t.sendDirectMessage(l, s)

  override def sendDirectMessage(s: String, s1: String): DirectMessage = t.sendDirectMessage(s, s1)

  override def destroyDirectMessage(l: Long): DirectMessage = t.destroyDirectMessage(l)

  override def getDMImageAsStream(s: String): InputStream = t.getDMImageAsStream(s)

  override def getDirectMessages: ResponseList[DirectMessage] = t.getDirectMessages

  override def getDirectMessages(paging: Paging): ResponseList[DirectMessage] = t.getDirectMessages(paging)

  override def getSentDirectMessages: ResponseList[DirectMessage] = t.getSentDirectMessages

  override def getSentDirectMessages(paging: Paging): ResponseList[DirectMessage] = t.getSentDirectMessages(paging)

  override def createUserList(s: String, b: Boolean, s1: String): UserList = t.createUserList(s, b, s1)

  override def destroyUserList(l: Long): UserList = t.destroyUserList(l)

  override def destroyUserList(l: Long, s: String): UserList = t.destroyUserList(l, s)

  override def destroyUserList(s: String, s1: String): UserList = t.destroyUserList(s, s1)

  override def destroyUserListSubscription(l: Long): UserList = t.destroyUserListSubscription(l)

  override def destroyUserListSubscription(l: Long, s: String): UserList = t.destroyUserListSubscription(l, s)

  override def destroyUserListSubscription(s: String, s1: String): UserList = t.destroyUserListSubscription(s, s1)

  override def updateUserList(l: Long, s: String, b: Boolean, s1: String): UserList = t.updateUserList(l, s, b, s1)

  override def updateUserList(l: Long, s: String, s1: String, b: Boolean, s2: String): UserList = t.updateUserList(l, s, s1, b, s2)

  override def updateUserList(s: String, s1: String, s2: String, b: Boolean, s3: String): UserList = t.updateUserList(s, s1, s2, b, s3)

  override def createUserListMembers(l: Long, longs: Array[Long]): UserList = t.createUserListMembers(l, longs)

  override def createUserListMembers(l: Long, s: String, longs: Array[Long]): UserList = t.createUserListMembers(l, s, longs)

  override def createUserListMembers(s: String, s1: String, longs: Array[Long]): UserList = t.createUserListMembers(s, s1, longs)

  override def createUserListMembers(l: Long, strings: Array[String]): UserList = t.createUserListMembers(l, strings)

  override def createUserListMembers(l: Long, s: String, strings: Array[String]): UserList = t.createUserListMembers(l, s, strings)

  override def createUserListMembers(s: String, s1: String, strings: Array[String]): UserList = t.createUserListMembers(s, s1, strings)

  override def getUserListSubscriptions(s: String, l: Long): PagableResponseList[UserList] = t.getUserListSubscriptions(s, l)

  override def getUserListStatuses(l: Long, paging: Paging): ResponseList[Status] = t.getUserListStatuses(l, paging)

  override def getUserListStatuses(l: Long, s: String, paging: Paging): ResponseList[Status] = t.getUserListStatuses(l, s, paging)

  override def getUserListStatuses(s: String, s1: String, paging: Paging): ResponseList[Status] = t.getUserListStatuses(s, s1, paging)

  override def getUserListsOwnerships(s: String, i: Int, l: Long): PagableResponseList[UserList] = t.getUserListsOwnerships(s, i, l)

  override def getUserListsOwnerships(l: Long, i: Int, l1: Long): PagableResponseList[UserList] = t.getUserListsOwnerships(l, i, l1)

  override def getUserLists(s: String): ResponseList[UserList] = t.getUserLists(s)

  override def getUserLists(l: Long): ResponseList[UserList] = t.getUserLists(l)

  override def showUserListMembership(l: Long, l1: Long): User = t.showUserListMembership(l, l1)

  override def showUserListMembership(l: Long, s: String, l1: Long): User = t.showUserListMembership(l, s, l1)

  override def showUserListMembership(s: String, s1: String, l: Long): User = t.showUserListMembership(s, s1, l)

  override def createUserListMember(l: Long, l1: Long): UserList = t.createUserListMember(l, l1)

  override def createUserListMember(l: Long, s: String, l1: Long): UserList = t.createUserListMember(l, s, l1)

  override def createUserListMember(s: String, s1: String, l: Long): UserList = t.createUserListMember(s, s1, l)

  override def getUserListMemberships(l: Long): PagableResponseList[UserList] = t.getUserListMemberships(l)

  override def getUserListMemberships(l: Long, l1: Long): PagableResponseList[UserList] = t.getUserListMemberships(l, l1)

  override def getUserListMemberships(s: String, l: Long): PagableResponseList[UserList] = t.getUserListMemberships(s, l)

  override def getUserListMemberships(s: String, l: Long, b: Boolean): PagableResponseList[UserList] = t.getUserListMemberships(s, l, b)

  override def getUserListMemberships(l: Long, l1: Long, b: Boolean): PagableResponseList[UserList] = t.getUserListMemberships(l, l1, b)

  override def showUserList(l: Long): UserList = t.showUserList(l)

  override def showUserList(l: Long, s: String): UserList = t.showUserList(l, s)

  override def showUserList(s: String, s1: String): UserList = t.showUserList(s, s1)

  override def getUserListSubscribers(l: Long, l1: Long): PagableResponseList[User] = t.getUserListSubscribers(l, l1)

  override def getUserListSubscribers(l: Long, s: String, l1: Long): PagableResponseList[User] = t.getUserListSubscribers(l, s, l1)

  override def getUserListSubscribers(s: String, s1: String, l: Long): PagableResponseList[User] = t.getUserListSubscribers(s, s1, l)

  override def showUserListSubscription(l: Long, l1: Long): User = t.showUserListSubscription(l, l1)

  override def showUserListSubscription(l: Long, s: String, l1: Long): User = t.showUserListSubscription(l, s, l1)

  override def showUserListSubscription(s: String, s1: String, l: Long): User = t.showUserListSubscription(s, s1, l)

  override def createUserListSubscription(l: Long): UserList = t.createUserListSubscription(l)

  override def createUserListSubscription(l: Long, s: String): UserList = t.createUserListSubscription(l, s)

  override def createUserListSubscription(s: String, s1: String): UserList = t.createUserListSubscription(s, s1)

  override def destroyUserListMembers(l: Long, strings: Array[String]): UserList = t.destroyUserListMembers(l, strings)

  override def destroyUserListMembers(l: Long, longs: Array[Long]): UserList = t.destroyUserListMembers(l, longs)

  override def destroyUserListMembers(s: String, s1: String, strings: Array[String]): UserList = t.destroyUserListMembers(s, s1, strings)

  override def destroyUserListMember(l: Long, l1: Long): UserList = t.destroyUserListMember(l, l1)

  override def destroyUserListMember(l: Long, s: String): UserList = t.destroyUserListMember(l, s)

  override def destroyUserListMember(l: Long, s: String, l1: Long): UserList = t.destroyUserListMember(l, s, l1)

  override def destroyUserListMember(s: String, s1: String, l: Long): UserList = t.destroyUserListMember(s, s1, l)

  override def getUserListMembers(l: Long, l1: Long): PagableResponseList[User] = t.getUserListMembers(l, l1)

  override def getUserListMembers(l: Long, s: String, l1: Long): PagableResponseList[User] = t.getUserListMembers(l, s, l1)

  override def getUserListMembers(s: String, s1: String, l: Long): PagableResponseList[User] = t.getUserListMembers(s, s1, l)

  override def getOutgoingFriendships(l: Long): IDs = t.getOutgoingFriendships(l)

  override def lookupFriendships(longs: Array[Long]): ResponseList[Friendship] = t.lookupFriendships(longs)

  override def lookupFriendships(strings: Array[String]): ResponseList[Friendship] = t.lookupFriendships(strings)

  override def updateFriendship(l: Long, b: Boolean, b1: Boolean): Relationship = t.updateFriendship(l, b, b1)

  override def updateFriendship(s: String, b: Boolean, b1: Boolean): Relationship = t.updateFriendship(s, b, b1)

  override def getIncomingFriendships(l: Long): IDs = t.getIncomingFriendships(l)

  override def destroyFriendship(l: Long): User = t.destroyFriendship(l)

  override def destroyFriendship(s: String): User = t.destroyFriendship(s)

  override def getFriendsIDs(l: Long): IDs = t.getFriendsIDs(l)

  override def getFriendsIDs(l: Long, l1: Long): IDs = t.getFriendsIDs(l, l1)

  override def getFriendsIDs(l: Long, l1: Long, i: Int): IDs = t.getFriendsIDs(l, l1, i)

  override def getFriendsIDs(s: String, l: Long): IDs = t.getFriendsIDs(s, l)

  override def getFriendsIDs(s: String, l: Long, i: Int): IDs = t.getFriendsIDs(s, l, i)

  override def getNoRetweetsFriendships: IDs = t.getNoRetweetsFriendships

  override def showFriendship(l: Long, l1: Long): Relationship = t.showFriendship(l, l1)

  override def showFriendship(s: String, s1: String): Relationship = t.showFriendship(s, s1)

  override def createFriendship(l: Long): User = t.createFriendship(l)

  override def createFriendship(s: String): User = t.createFriendship(s)

  override def createFriendship(l: Long, b: Boolean): User = t.createFriendship(l, b)

  override def createFriendship(s: String, b: Boolean): User = t.createFriendship(s, b)

  override def getFollowersList(l: Long, l1: Long): PagableResponseList[User] = t.getFollowersList(l, l1)

  override def getFollowersList(s: String, l: Long): PagableResponseList[User] = t.getFollowersList(s, l)

  override def getFollowersList(l: Long, l1: Long, i: Int): PagableResponseList[User] = t.getFollowersList(l, l1, i)

  override def getFollowersList(s: String, l: Long, i: Int): PagableResponseList[User] = t.getFollowersList(s, l, i)

  override def getFollowersList(l: Long, l1: Long, i: Int, b: Boolean, b1: Boolean): PagableResponseList[User] = t.getFollowersList(l, l1, i, b, b1)

  override def getFollowersList(s: String, l: Long, i: Int, b: Boolean, b1: Boolean): PagableResponseList[User] = t.getFollowersList(s, l, i, b, b1)

  override def getFollowersIDs(l: Long): IDs = t.getFollowersIDs(l)

  override def getFollowersIDs(l: Long, l1: Long): IDs = t.getFollowersIDs(l, l1)

  override def getFollowersIDs(l: Long, l1: Long, i: Int): IDs = t.getFollowersIDs(l, l1, i)

  override def getFollowersIDs(s: String, l: Long): IDs = t.getFollowersIDs(s, l)

  override def getFollowersIDs(s: String, l: Long, i: Int): IDs = t.getFollowersIDs(s, l, i)

  override def getFriendsList(l: Long, l1: Long): PagableResponseList[User] = t.getFriendsList(l, l1)

  override def getFriendsList(l: Long, l1: Long, i: Int): PagableResponseList[User] = t.getFriendsList(l, l1, i)

  override def getFriendsList(s: String, l: Long): PagableResponseList[User] = t.getFriendsList(s, l)

  override def getFriendsList(s: String, l: Long, i: Int): PagableResponseList[User] = t.getFriendsList(s, l, i)

  override def getFriendsList(l: Long, l1: Long, i: Int, b: Boolean, b1: Boolean): PagableResponseList[User] = t.getFriendsList(l, l1, i, b, b1)

  override def getFriendsList(s: String, l: Long, i: Int, b: Boolean, b1: Boolean): PagableResponseList[User] = t.getFriendsList(s, l, i, b, b1)

  override def destroySavedSearch(i: Int): SavedSearch = t.destroySavedSearch(i)

  override def getSavedSearches: ResponseList[SavedSearch] = t.getSavedSearches

  override def createSavedSearch(s: String): SavedSearch = t.createSavedSearch(s)

  override def showSavedSearch(i: Int): SavedSearch = t.showSavedSearch(i)

  override def getMemberSuggestions(s: String): ResponseList[User] = t.getMemberSuggestions(s)

  override def getSuggestedUserCategories: ResponseList[Category] = t.getSuggestedUserCategories

  override def getUserSuggestions(s: String): ResponseList[User] = t.getUserSuggestions(s)

  override def createFavorite(l: Long): Status = t.createFavorite(l)

  override def destroyFavorite(l: Long): Status = t.destroyFavorite(l)

  override def getFavorites: ResponseList[Status] = t.getFavorites

  override def getFavorites(l: Long): ResponseList[Status] = t.getFavorites(l)

  override def getFavorites(s: String): ResponseList[Status] = t.getFavorites(s)

  override def getFavorites(paging: Paging): ResponseList[Status] = t.getFavorites(paging)

  override def getFavorites(l: Long, paging: Paging): ResponseList[Status] = t.getFavorites(l, paging)

  override def getFavorites(s: String, paging: Paging): ResponseList[Status] = t.getFavorites(s, paging)

  override def removeProfileBanner(): Unit = t.removeProfileBanner()

  override def showUser(l: Long): User = t.showUser(l)

  override def showUser(s: String): User = t.showUser(s)

  override def lookupUsers(longs: Array[Long]): ResponseList[User] = t.lookupUsers(longs)

  override def lookupUsers(strings: Array[String]): ResponseList[User] = t.lookupUsers(strings)

  override def updateProfileBanner(file: File): Unit = t.updateProfileBanner(file)

  override def updateProfileBanner(inputStream: InputStream): Unit = t.updateProfileBanner(inputStream)

  override def updateProfile(s: String, s1: String, s2: String, s3: String): User = t.updateProfile(s, s1, s2, s3)

  override def getBlocksIDs: IDs = t.getBlocksIDs

  override def getBlocksIDs(l: Long): IDs = t.getBlocksIDs(l)

  override def searchUsers(s: String, i: Int): ResponseList[User] = t.searchUsers(s, i)

  override def getContributors(l: Long): ResponseList[User] = t.getContributors(l)

  override def getContributors(s: String): ResponseList[User] = t.getContributors(s)

  override def getAccountSettings: AccountSettings = t.getAccountSettings

  override def getMutesIDs(l: Long): IDs = t.getMutesIDs(l)

  override def destroyBlock(l: Long): User = t.destroyBlock(l)

  override def destroyBlock(s: String): User = t.destroyBlock(s)

  override def getContributees(l: Long): ResponseList[User] = t.getContributees(l)

  override def getContributees(s: String): ResponseList[User] = t.getContributees(s)

  override def getBlocksList: PagableResponseList[User] = t.getBlocksList

  override def getBlocksList(l: Long): PagableResponseList[User] = t.getBlocksList(l)

  override def updateAccountSettings(integer: Integer, aBoolean: lang.Boolean, s: String, s1: String, s2: String, s3: String): AccountSettings = t.updateAccountSettings(integer, aBoolean, s, s1, s2, s3)

  override def updateProfileColors(s: String, s1: String, s2: String, s3: String, s4: String): User = t.updateProfileColors(s, s1, s2, s3, s4)

  override def getMutesList(l: Long): PagableResponseList[User] = t.getMutesList(l)

  override def destroyMute(l: Long): User = t.destroyMute(l)

  override def destroyMute(s: String): User = t.destroyMute(s)

  override def createBlock(l: Long): User = t.createBlock(l)

  override def createBlock(s: String): User = t.createBlock(s)

  override def createMute(l: Long): User = t.createMute(l)

  override def createMute(s: String): User = t.createMute(s)

  override def updateProfileBackgroundImage(file: File, b: Boolean): User = t.updateProfileBackgroundImage(file, b)

  override def updateProfileBackgroundImage(inputStream: InputStream, b: Boolean): User = t.updateProfileBackgroundImage(inputStream, b)

  override def verifyCredentials(): User = t.verifyCredentials()

  override def updateProfileImage(file: File): User = t.updateProfileImage(file)

  override def updateProfileImage(inputStream: InputStream): User = t.updateProfileImage(inputStream)

  override def getOAuthRequestToken: RequestToken = t.getOAuthRequestToken

  override def getOAuthRequestToken(s: String): RequestToken = t.getOAuthRequestToken(s)

  override def getOAuthRequestToken(s: String, s1: String): RequestToken = t.getOAuthRequestToken(s, s1)

  override def getOAuthRequestToken(s: String, s1: String, s2: String): RequestToken = t.getOAuthRequestToken(s, s1, s2)

  override def setOAuthAccessToken(accessToken: AccessToken): Unit = t.setOAuthAccessToken(accessToken)

  override def getOAuthAccessToken: AccessToken = t.getOAuthAccessToken

  override def getOAuthAccessToken(s: String): AccessToken = t.getOAuthAccessToken(s)

  override def getOAuthAccessToken(requestToken: RequestToken): AccessToken = t.getOAuthAccessToken(requestToken)

  override def getOAuthAccessToken(requestToken: RequestToken, s: String): AccessToken = t.getOAuthAccessToken(requestToken, s)

  override def getOAuthAccessToken(s: String, s1: String): AccessToken = t.getOAuthAccessToken(s, s1)

  override def addRateLimitStatusListener(rateLimitStatusListener: RateLimitStatusListener): Unit = t.addRateLimitStatusListener(rateLimitStatusListener)

  override def getScreenName: String = t.getScreenName

  override def getId: Long = t.getId

  override def getAuthorization: Authorization = t.getAuthorization

  override def getConfiguration: Configuration = t.getConfiguration

  override def getClosestTrends(geoLocation: GeoLocation): ResponseList[Location] = t.getClosestTrends(geoLocation)

  override def getAvailableTrends: ResponseList[Location] = t.getAvailableTrends

  override def getPlaceTrends(i: Int): Trends = t.getPlaceTrends(i)
}
