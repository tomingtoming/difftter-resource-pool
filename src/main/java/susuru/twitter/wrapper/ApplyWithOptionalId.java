package susuru.twitter.wrapper;

import susuru.core.Pool;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterResponse;

abstract class ApplyWithOptionalId<R extends TwitterResponse> {
    private Pool<Twitter, TwitterResponse> pool;
    private String resourceFamily;
    public ApplyWithOptionalId(Pool<Twitter, TwitterResponse> pool, String resourceFamily) {
        this.pool = pool;
        this.resourceFamily = resourceFamily;
    }
    public R apply(long id) throws TwitterException {
        Twitter twitter;
        R result;
        if (id != -1) {
            twitter = pool.leaseSome(resourceFamily, id);
            result = this.process(twitter);
        } else {
            twitter = pool.leaseAny(resourceFamily);
            try {
                result = this.process(twitter);
            } catch(TwitterException e) {
                if(e.getErrorCode() == 89) {
                    pool.invalidate(twitter);
                    result = this.apply(id);
                } else {
                    throw e;
                }
            }
        }
        pool.release(resourceFamily, twitter.getId(), twitter, result);
        return result;
    }
    abstract protected R process(Twitter twitter) throws TwitterException;
}
