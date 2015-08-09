package susuru.twitter.wrapper

import java.io.{File, InputStream}
import java.{lang, util}

import twitter4j._
import twitter4j.api.HelpResources.Language
import twitter4j.api._
import twitter4j.auth.{AccessToken, Authorization, OAuth2Token, RequestToken}
import twitter4j.conf.Configuration
import twitter4j.util.function.Consumer

class TwitterWrapper(twitter: Twitter) extends Twitter {

  override lazy val friendsFollowers: FriendsFollowersResources = new FriendsFollowersResourcesWrapper(twitter)

  override lazy val users: UsersResources = new UsersResourcesWrapper(twitter)

  override lazy val savedSearches: SavedSearchesResources = new SavedSearchesResourcesWrapper(twitter)

  override lazy val suggestedUsers: SuggestedUsersResources = new SuggestedUsersResourcesWrapper(twitter)

  override lazy val directMessages: DirectMessagesResources = new DirectMessagesResourcesWrapper(twitter)

  override lazy val tweets: TweetsResources = new TweetsResourcesWrapper(twitter)

  override lazy val placesGeo: PlacesGeoResources = new PlacesGeoResourcesWrapper(twitter)

  override lazy val favorites: FavoritesResources = new FavoritesResourcesWrapper(twitter)

  override lazy val spamReporting: SpamReportingResource = new SpamReportingResourceWrapper(twitter)

  override lazy val trends: TrendsResources = new TrendsResourcesWrapper(twitter)

  override lazy val list: ListsResources = new ListsResourcesWrapper(twitter)

  override lazy val timelines: TimelinesResources = new TimelinesResourcesWrapper(twitter)

  override lazy val help: HelpResources = new HelpResourcesWrapper(twitter)

  override lazy val search: SearchResource = new SearchResourceWrapper(twitter)


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

  override def setOAuthConsumer(s: String, s1: String): Unit = throw new NotImplementedError("Sorry!")

  override def getOAuth2Token: OAuth2Token = throw new NotImplementedError("Sorry!")

  override def invalidateOAuth2Token(): Unit = throw new NotImplementedError("Sorry!")

  override def setOAuth2Token(oAuth2Token: OAuth2Token): Unit = throw new NotImplementedError("Sorry!")

  override def addRateLimitStatusListener(rateLimitStatusListener: RateLimitStatusListener): Unit = throw new NotImplementedError("Sorry!")

  override def getScreenName: String = throw new NotImplementedError("Sorry!")

  override def onRateLimitStatus(consumer: Consumer[RateLimitStatusEvent]): Unit = throw new NotImplementedError("Sorry!")

  override def onRateLimitReached(consumer: Consumer[RateLimitStatusEvent]): Unit = throw new NotImplementedError("Sorry!")

  override def getId: Long = throw new NotImplementedError("Sorry!")

  override def getAuthorization: Authorization = throw new NotImplementedError("Sorry!")

  override def getConfiguration: Configuration = throw new NotImplementedError("Sorry!")

  override def getClosestTrends(geoLocation: GeoLocation): ResponseList[Location] = throw new NotImplementedError("Sorry!")

  override def getAvailableTrends: ResponseList[Location] = throw new NotImplementedError("Sorry!")

  override def getPlaceTrends(i: Int): Trends = throw new NotImplementedError("Sorry!")

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

  override def searchUsers(s: String, i: Int): ResponseList[User] = throw new NotImplementedError("Sorry!")

  override def getContributors(l: Long): ResponseList[User] = throw new NotImplementedError("Sorry!")

  override def getContributors(s: String): ResponseList[User] = throw new NotImplementedError("Sorry!")

  override def getAccountSettings: AccountSettings = throw new NotImplementedError("Sorry!")

  override def getMutesIDs(l: Long): IDs = throw new NotImplementedError("Sorry!")

  override def destroyBlock(l: Long): User = throw new NotImplementedError("Sorry!")

  override def destroyBlock(s: String): User = throw new NotImplementedError("Sorry!")

  override def getContributees(l: Long): ResponseList[User] = throw new NotImplementedError("Sorry!")

  override def getContributees(s: String): ResponseList[User] = throw new NotImplementedError("Sorry!")

  override def getBlocksList: PagableResponseList[User] = throw new NotImplementedError("Sorry!")

  override def getBlocksList(l: Long): PagableResponseList[User] = throw new NotImplementedError("Sorry!")

  override def updateAccountSettings(integer: Integer, aBoolean: lang.Boolean, s: String, s1: String, s2: String, s3: String): AccountSettings = throw new NotImplementedError("Sorry!")

  override def updateProfileColors(s: String, s1: String, s2: String, s3: String, s4: String): User = throw new NotImplementedError("Sorry!")

  override def getMutesList(l: Long): PagableResponseList[User] = throw new NotImplementedError("Sorry!")

  override def destroyMute(l: Long): User = throw new NotImplementedError("Sorry!")

  override def destroyMute(s: String): User = throw new NotImplementedError("Sorry!")

  override def createBlock(l: Long): User = throw new NotImplementedError("Sorry!")

  override def createBlock(s: String): User = throw new NotImplementedError("Sorry!")

  override def createMute(l: Long): User = throw new NotImplementedError("Sorry!")

  override def createMute(s: String): User = throw new NotImplementedError("Sorry!")

  override def updateProfileBackgroundImage(file: File, b: Boolean): User = throw new NotImplementedError("Sorry!")

  override def updateProfileBackgroundImage(inputStream: InputStream, b: Boolean): User = throw new NotImplementedError("Sorry!")

  override def verifyCredentials(): User = throw new NotImplementedError("Sorry!")

  override def updateProfileImage(file: File): User = throw new NotImplementedError("Sorry!")

  override def updateProfileImage(inputStream: InputStream): User = throw new NotImplementedError("Sorry!")

  override def search(query: Query): QueryResult = throw new NotImplementedError("Sorry!")

  override def getMemberSuggestions(s: String): ResponseList[User] = throw new NotImplementedError("Sorry!")

  override def getSuggestedUserCategories: ResponseList[Category] = throw new NotImplementedError("Sorry!")

  override def getUserSuggestions(s: String): ResponseList[User] = throw new NotImplementedError("Sorry!")

  override def showDirectMessage(l: Long): DirectMessage = throw new NotImplementedError("Sorry!")

  override def sendDirectMessage(l: Long, s: String): DirectMessage = throw new NotImplementedError("Sorry!")

  override def sendDirectMessage(s: String, s1: String): DirectMessage = throw new NotImplementedError("Sorry!")

  override def destroyDirectMessage(l: Long): DirectMessage = throw new NotImplementedError("Sorry!")

  override def getDMImageAsStream(s: String): InputStream = throw new NotImplementedError("Sorry!")

  override def getDirectMessages: ResponseList[DirectMessage] = throw new NotImplementedError("Sorry!")

  override def getDirectMessages(paging: Paging): ResponseList[DirectMessage] = throw new NotImplementedError("Sorry!")

  override def getSentDirectMessages: ResponseList[DirectMessage] = throw new NotImplementedError("Sorry!")

  override def getSentDirectMessages(paging: Paging): ResponseList[DirectMessage] = throw new NotImplementedError("Sorry!")

  override def getOAuthRequestToken: RequestToken = throw new NotImplementedError("Sorry!")

  override def getOAuthRequestToken(s: String): RequestToken = throw new NotImplementedError("Sorry!")

  override def getOAuthRequestToken(s: String, s1: String): RequestToken = throw new NotImplementedError("Sorry!")

  override def getOAuthRequestToken(s: String, s1: String, s2: String): RequestToken = throw new NotImplementedError("Sorry!")

  override def setOAuthAccessToken(accessToken: AccessToken): Unit = throw new NotImplementedError("Sorry!")

  override def getOAuthAccessToken: AccessToken = throw new NotImplementedError("Sorry!")

  override def getOAuthAccessToken(s: String): AccessToken = throw new NotImplementedError("Sorry!")

  override def getOAuthAccessToken(requestToken: RequestToken): AccessToken = throw new NotImplementedError("Sorry!")

  override def getOAuthAccessToken(requestToken: RequestToken, s: String): AccessToken = throw new NotImplementedError("Sorry!")

  override def getOAuthAccessToken(s: String, s1: String): AccessToken = throw new NotImplementedError("Sorry!")

  override def reverseGeoCode(geoQuery: GeoQuery): ResponseList[Place] = throw new NotImplementedError("Sorry!")

  override def searchPlaces(geoQuery: GeoQuery): ResponseList[Place] = throw new NotImplementedError("Sorry!")

  override def getGeoDetails(s: String): Place = throw new NotImplementedError("Sorry!")

  override def getSimilarPlaces(geoLocation: GeoLocation, s: String, s1: String, s2: String): ResponseList[Place] = throw new NotImplementedError("Sorry!")

  override def getOutgoingFriendships(l: Long): IDs = throw new NotImplementedError("Sorry!")

  override def lookupFriendships(longs: Long*): ResponseList[Friendship] = throw new NotImplementedError("Sorry!")

  override def lookupFriendships(strings: String*): ResponseList[Friendship] = throw new NotImplementedError("Sorry!")

  override def updateFriendship(l: Long, b: Boolean, b1: Boolean): Relationship = throw new NotImplementedError("Sorry!")

  override def updateFriendship(s: String, b: Boolean, b1: Boolean): Relationship = throw new NotImplementedError("Sorry!")

  override def getIncomingFriendships(l: Long): IDs = throw new NotImplementedError("Sorry!")

  override def destroyFriendship(l: Long): User = throw new NotImplementedError("Sorry!")

  override def destroyFriendship(s: String): User = throw new NotImplementedError("Sorry!")

  override def getFriendsIDs(l: Long): IDs = throw new NotImplementedError("Sorry!")

  override def getFriendsIDs(l: Long, l1: Long): IDs = throw new NotImplementedError("Sorry!")

  override def getFriendsIDs(l: Long, l1: Long, i: Int): IDs = throw new NotImplementedError("Sorry!")

  override def getFriendsIDs(s: String, l: Long): IDs = throw new NotImplementedError("Sorry!")

  override def getFriendsIDs(s: String, l: Long, i: Int): IDs = throw new NotImplementedError("Sorry!")

  override def getNoRetweetsFriendships: IDs = throw new NotImplementedError("Sorry!")

  override def showFriendship(l: Long, l1: Long): Relationship = throw new NotImplementedError("Sorry!")

  override def showFriendship(s: String, s1: String): Relationship = throw new NotImplementedError("Sorry!")

  override def createFriendship(l: Long): User = throw new NotImplementedError("Sorry!")

  override def createFriendship(s: String): User = throw new NotImplementedError("Sorry!")

  override def createFriendship(l: Long, b: Boolean): User = throw new NotImplementedError("Sorry!")

  override def createFriendship(s: String, b: Boolean): User = throw new NotImplementedError("Sorry!")

  override def getFollowersList(l: Long, l1: Long): PagableResponseList[User] = throw new NotImplementedError("Sorry!")

  override def getFollowersList(s: String, l: Long): PagableResponseList[User] = throw new NotImplementedError("Sorry!")

  override def getFollowersList(l: Long, l1: Long, i: Int): PagableResponseList[User] = throw new NotImplementedError("Sorry!")

  override def getFollowersList(s: String, l: Long, i: Int): PagableResponseList[User] = throw new NotImplementedError("Sorry!")

  override def getFollowersList(l: Long, l1: Long, i: Int, b: Boolean, b1: Boolean): PagableResponseList[User] = throw new NotImplementedError("Sorry!")

  override def getFollowersList(s: String, l: Long, i: Int, b: Boolean, b1: Boolean): PagableResponseList[User] = throw new NotImplementedError("Sorry!")

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

  override def createFavorite(l: Long): Status = throw new NotImplementedError("Sorry!")

  override def destroyFavorite(l: Long): Status = throw new NotImplementedError("Sorry!")

  override def getFavorites: ResponseList[Status] = throw new NotImplementedError("Sorry!")

  override def getFavorites(l: Long): ResponseList[Status] = throw new NotImplementedError("Sorry!")

  override def getFavorites(s: String): ResponseList[Status] = throw new NotImplementedError("Sorry!")

  override def getFavorites(paging: Paging): ResponseList[Status] = throw new NotImplementedError("Sorry!")

  override def getFavorites(l: Long, paging: Paging): ResponseList[Status] = throw new NotImplementedError("Sorry!")

  override def getFavorites(s: String, paging: Paging): ResponseList[Status] = throw new NotImplementedError("Sorry!")

  override def reportSpam(l: Long): User = throw new NotImplementedError("Sorry!")

  override def reportSpam(s: String): User = throw new NotImplementedError("Sorry!")

  override def getAPIConfiguration: TwitterAPIConfiguration = throw new NotImplementedError("Sorry!")

  override def getTermsOfService: String = throw new NotImplementedError("Sorry!")

  override def getPrivacyPolicy: String = throw new NotImplementedError("Sorry!")

  override def getRateLimitStatus: util.Map[String, RateLimitStatus] = throw new NotImplementedError("Sorry!")

  override def getRateLimitStatus(strings: String*): util.Map[String, RateLimitStatus] = throw new NotImplementedError("Sorry!")

  override def getLanguages: ResponseList[Language] = throw new NotImplementedError("Sorry!")

  override def createUserList(s: String, b: Boolean, s1: String): UserList = throw new NotImplementedError("Sorry!")

  override def destroyUserList(l: Long): UserList = throw new NotImplementedError("Sorry!")

  override def destroyUserList(l: Long, s: String): UserList = throw new NotImplementedError("Sorry!")

  override def destroyUserList(s: String, s1: String): UserList = throw new NotImplementedError("Sorry!")

  override def destroyUserListSubscription(l: Long): UserList = throw new NotImplementedError("Sorry!")

  override def destroyUserListSubscription(l: Long, s: String): UserList = throw new NotImplementedError("Sorry!")

  override def destroyUserListSubscription(s: String, s1: String): UserList = throw new NotImplementedError("Sorry!")

  override def updateUserList(l: Long, s: String, b: Boolean, s1: String): UserList = throw new NotImplementedError("Sorry!")

  override def updateUserList(l: Long, s: String, s1: String, b: Boolean, s2: String): UserList = throw new NotImplementedError("Sorry!")

  override def updateUserList(s: String, s1: String, s2: String, b: Boolean, s3: String): UserList = throw new NotImplementedError("Sorry!")

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

  override def destroySavedSearch(l: Long): SavedSearch = throw new NotImplementedError("Sorry!")

  override def getSavedSearches: ResponseList[SavedSearch] = throw new NotImplementedError("Sorry!")

  override def createSavedSearch(s: String): SavedSearch = throw new NotImplementedError("Sorry!")

  override def showSavedSearch(l: Long): SavedSearch = throw new NotImplementedError("Sorry!")

  override def getHomeTimeline: ResponseList[Status] = throw new NotImplementedError("Sorry!")

  override def getHomeTimeline(paging: Paging): ResponseList[Status] = throw new NotImplementedError("Sorry!")

  override def getUserTimeline(s: String, paging: Paging): ResponseList[Status] = throw new NotImplementedError("Sorry!")

  override def getUserTimeline(l: Long, paging: Paging): ResponseList[Status] = throw new NotImplementedError("Sorry!")

  override def getUserTimeline(s: String): ResponseList[Status] = throw new NotImplementedError("Sorry!")

  override def getUserTimeline(l: Long): ResponseList[Status] = throw new NotImplementedError("Sorry!")

  override def getUserTimeline: ResponseList[Status] = throw new NotImplementedError("Sorry!")

  override def getUserTimeline(paging: Paging): ResponseList[Status] = throw new NotImplementedError("Sorry!")

  override def getMentionsTimeline: ResponseList[Status] = throw new NotImplementedError("Sorry!")

  override def getMentionsTimeline(paging: Paging): ResponseList[Status] = throw new NotImplementedError("Sorry!")

  override def getRetweetsOfMe: ResponseList[Status] = throw new NotImplementedError("Sorry!")

  override def getRetweetsOfMe(paging: Paging): ResponseList[Status] = throw new NotImplementedError("Sorry!")
}
