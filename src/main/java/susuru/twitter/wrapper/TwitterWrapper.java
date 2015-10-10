package susuru.twitter.wrapper;

import susuru.core.Pool;
import twitter4j.*;
import twitter4j.api.*;
import twitter4j.auth.*;
import twitter4j.conf.Configuration;
import twitter4j.util.function.Consumer;

import java.io.File;
import java.io.InputStream;
import java.util.Map;

public class TwitterWrapper implements Twitter, FriendsFollowersResources, UsersResources, SavedSearchesResources, SuggestedUsersResources, DirectMessagesResources, TweetsResources, PlacesGeoResources, FavoritesResources, SpamReportingResource, TrendsResources, ListsResources, TimelinesResources, HelpResources, SearchResource {

    Pool<Twitter> pool;

    public TwitterWrapper(Pool<Twitter> pool) {
        this.pool = pool;
    }

    @Override
    public TimelinesResources timelines() {
        return this;
    }

    @Override
    public TweetsResources tweets() {
        return this;
    }

    @Override
    public SearchResource search() {
        return this;
    }

    @Override
    public DirectMessagesResources directMessages() {
        return this;
    }

    @Override
    public FriendsFollowersResources friendsFollowers() {
        return this;
    }

    @Override
    public UsersResources users() {
        return this;
    }

    @Override
    public SuggestedUsersResources suggestedUsers() {
        return this;
    }

    @Override
    public FavoritesResources favorites() {
        return this;
    }

    @Override
    public ListsResources list() {
        return this;
    }

    @Override
    public SavedSearchesResources savedSearches() {
        return this;
    }

    @Override
    public PlacesGeoResources placesGeo() {
        return this;
    }

    @Override
    public TrendsResources trends() {
        return this;
    }

    @Override
    public SpamReportingResource spamReporting() {
        return this;
    }

    @Override
    public HelpResources help() {
        return this;
    }

    @Override
    public ResponseList<DirectMessage> getDirectMessages() throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public ResponseList<DirectMessage> getDirectMessages(Paging paging) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public ResponseList<DirectMessage> getSentDirectMessages() throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public ResponseList<DirectMessage> getSentDirectMessages(Paging paging) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public DirectMessage showDirectMessage(long l) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public DirectMessage destroyDirectMessage(long l) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public DirectMessage sendDirectMessage(long l, String s) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public DirectMessage sendDirectMessage(String s, String s1) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public InputStream getDMImageAsStream(String s) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public ResponseList<Status> getFavorites() throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public ResponseList<Status> getFavorites(long l) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public ResponseList<Status> getFavorites(String s) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public ResponseList<Status> getFavorites(Paging paging) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public ResponseList<Status> getFavorites(long l, Paging paging) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public ResponseList<Status> getFavorites(String s, Paging paging) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public Status createFavorite(long l) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public Status destroyFavorite(long l) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public IDs getNoRetweetsFriendships() throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public IDs getFriendsIDs(long l) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public IDs getFriendsIDs(long l, long l1) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public IDs getFriendsIDs(long l, long l1, int i) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public IDs getFriendsIDs(String s, long l) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public IDs getFriendsIDs(String s, long l, int i) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public IDs getFollowersIDs(long l) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public IDs getFollowersIDs(long l, long l1) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public IDs getFollowersIDs(long l, long l1, int i) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public IDs getFollowersIDs(String s, long l) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public IDs getFollowersIDs(String s, long l, int i) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public ResponseList<Friendship> lookupFriendships(long... longs) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public ResponseList<Friendship> lookupFriendships(String... strings) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public IDs getIncomingFriendships(long l) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public IDs getOutgoingFriendships(long l) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public User createFriendship(long l) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public User createFriendship(String s) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public User createFriendship(long l, boolean b) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public User createFriendship(String s, boolean b) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public User destroyFriendship(long l) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public User destroyFriendship(String s) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public Relationship updateFriendship(long l, boolean b, boolean b1) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public Relationship updateFriendship(String s, boolean b, boolean b1) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public Relationship showFriendship(long l, long l1) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public Relationship showFriendship(String s, String s1) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public PagableResponseList<User> getFriendsList(long l, long l1) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public PagableResponseList<User> getFriendsList(long l, long l1, int i) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public PagableResponseList<User> getFriendsList(String s, long l) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public PagableResponseList<User> getFriendsList(String s, long l, int i) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public PagableResponseList<User> getFriendsList(long l, long l1, int i, boolean b, boolean b1) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public PagableResponseList<User> getFriendsList(String s, long l, int i, boolean b, boolean b1) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public PagableResponseList<User> getFollowersList(long l, long l1) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public PagableResponseList<User> getFollowersList(String s, long l) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public PagableResponseList<User> getFollowersList(long l, long l1, int i) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public PagableResponseList<User> getFollowersList(String s, long l, int i) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public PagableResponseList<User> getFollowersList(long l, long l1, int i, boolean b, boolean b1) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public PagableResponseList<User> getFollowersList(String s, long l, int i, boolean b, boolean b1) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public TwitterAPIConfiguration getAPIConfiguration() throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public ResponseList<Language> getLanguages() throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public String getPrivacyPolicy() throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public String getTermsOfService() throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public Map<String, RateLimitStatus> getRateLimitStatus() throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public Map<String, RateLimitStatus> getRateLimitStatus(String... strings) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public ResponseList<UserList> getUserLists(String s) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public ResponseList<UserList> getUserLists(String s, boolean b) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public ResponseList<UserList> getUserLists(long l) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public ResponseList<UserList> getUserLists(long l, boolean b) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public ResponseList<Status> getUserListStatuses(long l, Paging paging) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public ResponseList<Status> getUserListStatuses(long l, String s, Paging paging) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public ResponseList<Status> getUserListStatuses(String s, String s1, Paging paging) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public UserList destroyUserListMember(long l, long l1) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public UserList destroyUserListMember(long l, String s) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public UserList destroyUserListMembers(long l, String[] strings) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public UserList destroyUserListMembers(long l, long[] longs) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public UserList destroyUserListMembers(String s, String s1, String[] strings) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public UserList destroyUserListMember(long l, String s, long l1) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public UserList destroyUserListMember(String s, String s1, long l) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public PagableResponseList<UserList> getUserListMemberships(long l) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public PagableResponseList<UserList> getUserListMemberships(int i, long l) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public PagableResponseList<UserList> getUserListMemberships(long l, long l1) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public PagableResponseList<UserList> getUserListMemberships(long l, int i, long l1) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public PagableResponseList<UserList> getUserListMemberships(String s, long l) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public PagableResponseList<UserList> getUserListMemberships(String s, int i, long l) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public PagableResponseList<UserList> getUserListMemberships(String s, long l, boolean b) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public PagableResponseList<UserList> getUserListMemberships(String s, int i, long l, boolean b) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public PagableResponseList<UserList> getUserListMemberships(long l, long l1, boolean b) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public PagableResponseList<UserList> getUserListMemberships(long l, int i, long l1, boolean b) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public PagableResponseList<User> getUserListSubscribers(long l, long l1) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public PagableResponseList<User> getUserListSubscribers(long l, int i, long l1) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public PagableResponseList<User> getUserListSubscribers(long l, int i, long l1, boolean b) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public PagableResponseList<User> getUserListSubscribers(long l, String s, long l1) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public PagableResponseList<User> getUserListSubscribers(long l, String s, int i, long l1) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public PagableResponseList<User> getUserListSubscribers(long l, String s, int i, long l1, boolean b) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public PagableResponseList<User> getUserListSubscribers(String s, String s1, long l) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public PagableResponseList<User> getUserListSubscribers(String s, String s1, int i, long l) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public PagableResponseList<User> getUserListSubscribers(String s, String s1, int i, long l, boolean b) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public UserList createUserListSubscription(long l) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public UserList createUserListSubscription(long l, String s) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public UserList createUserListSubscription(String s, String s1) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public User showUserListSubscription(long l, long l1) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public User showUserListSubscription(long l, String s, long l1) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public User showUserListSubscription(String s, String s1, long l) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public UserList destroyUserListSubscription(long l) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public UserList destroyUserListSubscription(long l, String s) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public UserList destroyUserListSubscription(String s, String s1) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public UserList createUserListMembers(long l, long... longs) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public UserList createUserListMembers(long l, String s, long... longs) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public UserList createUserListMembers(String s, String s1, long... longs) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public UserList createUserListMembers(long l, String... strings) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public UserList createUserListMembers(long l, String s, String... strings) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public UserList createUserListMembers(String s, String s1, String... strings) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public User showUserListMembership(long l, long l1) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public User showUserListMembership(long l, String s, long l1) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public User showUserListMembership(String s, String s1, long l) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public PagableResponseList<User> getUserListMembers(long l, long l1) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public PagableResponseList<User> getUserListMembers(long l, int i, long l1) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public PagableResponseList<User> getUserListMembers(long l, int i, long l1, boolean b) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public PagableResponseList<User> getUserListMembers(long l, String s, long l1) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public PagableResponseList<User> getUserListMembers(long l, String s, int i, long l1) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public PagableResponseList<User> getUserListMembers(long l, String s, int i, long l1, boolean b) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public PagableResponseList<User> getUserListMembers(String s, String s1, long l) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public PagableResponseList<User> getUserListMembers(String s, String s1, int i, long l) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public PagableResponseList<User> getUserListMembers(String s, String s1, int i, long l, boolean b) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public UserList createUserListMember(long l, long l1) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public UserList createUserListMember(long l, String s, long l1) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public UserList createUserListMember(String s, String s1, long l) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public UserList destroyUserList(long l) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public UserList destroyUserList(long l, String s) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public UserList destroyUserList(String s, String s1) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public UserList updateUserList(long l, String s, boolean b, String s1) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public UserList updateUserList(long l, String s, String s1, boolean b, String s2) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public UserList updateUserList(String s, String s1, String s2, boolean b, String s3) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public UserList createUserList(String s, boolean b, String s1) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public UserList showUserList(long l) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public UserList showUserList(long l, String s) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public UserList showUserList(String s, String s1) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public PagableResponseList<UserList> getUserListSubscriptions(String s, long l) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public PagableResponseList<UserList> getUserListSubscriptions(String s, int i, long l) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public PagableResponseList<UserList> getUserListSubscriptions(long l, long l1) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public PagableResponseList<UserList> getUserListSubscriptions(long l, int i, long l1) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public PagableResponseList<UserList> getUserListsOwnerships(String s, long l) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public PagableResponseList<UserList> getUserListsOwnerships(String s, int i, long l) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public PagableResponseList<UserList> getUserListsOwnerships(long l, long l1) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public PagableResponseList<UserList> getUserListsOwnerships(long l, int i, long l1) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public OAuth2Token getOAuth2Token() throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public void setOAuth2Token(OAuth2Token oAuth2Token) {

    }

    @Override
    public void invalidateOAuth2Token() throws TwitterException {

    }

    @Override
    public void setOAuthConsumer(String s, String s1) {

    }

    @Override
    public RequestToken getOAuthRequestToken() throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public RequestToken getOAuthRequestToken(String s) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public RequestToken getOAuthRequestToken(String s, String s1) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public RequestToken getOAuthRequestToken(String s, String s1, String s2) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public AccessToken getOAuthAccessToken() throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public AccessToken getOAuthAccessToken(String s) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public AccessToken getOAuthAccessToken(RequestToken requestToken) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public AccessToken getOAuthAccessToken(RequestToken requestToken, String s) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public AccessToken getOAuthAccessToken(String s, String s1) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public void setOAuthAccessToken(AccessToken accessToken) {

    }

    @Override
    public Place getGeoDetails(String s) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public ResponseList<Place> reverseGeoCode(GeoQuery geoQuery) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public ResponseList<Place> searchPlaces(GeoQuery geoQuery) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public ResponseList<Place> getSimilarPlaces(GeoLocation geoLocation, String s, String s1, String s2) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public ResponseList<SavedSearch> getSavedSearches() throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public SavedSearch showSavedSearch(long l) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public SavedSearch createSavedSearch(String s) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public SavedSearch destroySavedSearch(long l) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public QueryResult search(Query query) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public User reportSpam(long l) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public User reportSpam(String s) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public ResponseList<User> getUserSuggestions(String s) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public ResponseList<Category> getSuggestedUserCategories() throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public ResponseList<User> getMemberSuggestions(String s) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public ResponseList<Status> getMentionsTimeline() throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public ResponseList<Status> getMentionsTimeline(Paging paging) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public ResponseList<Status> getUserTimeline(String s, Paging paging) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public ResponseList<Status> getUserTimeline(long l, Paging paging) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public ResponseList<Status> getUserTimeline(String s) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public ResponseList<Status> getUserTimeline(long l) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public ResponseList<Status> getUserTimeline() throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public ResponseList<Status> getUserTimeline(Paging paging) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public ResponseList<Status> getHomeTimeline() throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public ResponseList<Status> getHomeTimeline(Paging paging) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public ResponseList<Status> getRetweetsOfMe() throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public ResponseList<Status> getRetweetsOfMe(Paging paging) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public Trends getPlaceTrends(int i) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public ResponseList<Location> getAvailableTrends() throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public ResponseList<Location> getClosestTrends(GeoLocation geoLocation) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public ResponseList<Status> getRetweets(long l) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public IDs getRetweeterIds(long l, long l1) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public IDs getRetweeterIds(long l, int i, long l1) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public Status showStatus(long l) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public Status destroyStatus(long l) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public Status updateStatus(String s) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public Status updateStatus(StatusUpdate statusUpdate) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public Status retweetStatus(long l) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public OEmbed getOEmbed(OEmbedRequest oEmbedRequest) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public ResponseList<Status> lookup(long... longs) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public UploadedMedia uploadMedia(File file) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public UploadedMedia uploadMedia(String s, InputStream inputStream) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public String getScreenName() throws TwitterException, IllegalStateException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public long getId() throws TwitterException, IllegalStateException {
        return 0;
    }

    @Override
    public void addRateLimitStatusListener(RateLimitStatusListener rateLimitStatusListener) {

    }

    @Override
    public void onRateLimitStatus(Consumer<RateLimitStatusEvent> consumer) {

    }

    @Override
    public void onRateLimitReached(Consumer<RateLimitStatusEvent> consumer) {

    }

    @Override
    public Authorization getAuthorization() {
        return null;
    }

    @Override
    public Configuration getConfiguration() {
        return null;
    }

    @Override
    public AccountSettings getAccountSettings() throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public User verifyCredentials() throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public AccountSettings updateAccountSettings(Integer integer, Boolean aBoolean, String s, String s1, String s2, String s3) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public User updateProfile(String s, String s1, String s2, String s3) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public User updateProfileBackgroundImage(File file, boolean b) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public User updateProfileBackgroundImage(InputStream inputStream, boolean b) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public User updateProfileColors(String s, String s1, String s2, String s3, String s4) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public User updateProfileImage(File file) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public User updateProfileImage(InputStream inputStream) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public PagableResponseList<User> getBlocksList() throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public PagableResponseList<User> getBlocksList(long l) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public IDs getBlocksIDs() throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public IDs getBlocksIDs(long l) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public User createBlock(long l) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public User createBlock(String s) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public User destroyBlock(long l) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public User destroyBlock(String s) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public PagableResponseList<User> getMutesList(long l) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public IDs getMutesIDs(long l) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public User createMute(long l) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public User createMute(String s) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public User destroyMute(long l) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public User destroyMute(String s) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public ResponseList<User> lookupUsers(long... longs) throws TwitterException {
        ResponseList<User> result;
        Twitter twitter = pool.lease();
        result = twitter.lookupUsers(longs);
        RateLimitStatus limit = result.getRateLimitStatus();
        pool.release(twitter.getId(), limit.getRemaining(), limit.getResetTimeInSeconds() ,twitter);
        return result;
    }

    @Override
    public ResponseList<User> lookupUsers(String... strings) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public User showUser(long l) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public User showUser(String s) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public ResponseList<User> searchUsers(String s, int i) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public ResponseList<User> getContributees(long l) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public ResponseList<User> getContributees(String s) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public ResponseList<User> getContributors(long l) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public ResponseList<User> getContributors(String s) throws TwitterException {
        throw new TwitterException("Sorry! not implemented yet");
    }

    @Override
    public void removeProfileBanner() throws TwitterException {
    }

    @Override
    public void updateProfileBanner(File file) throws TwitterException {
    }

    @Override
    public void updateProfileBanner(InputStream inputStream) throws TwitterException {
    }
}
