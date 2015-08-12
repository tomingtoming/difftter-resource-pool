package susuru.twitter

import susuru.core.resource.Susuru
import susuru.core.resource.Id
import twitter4j.{TwitterResponse, Twitter}

class TwitterSusuru(source: () => Map[Id, Twitter])
  extends Susuru[Twitter, TwitterResponse](
    source, r => (r.getRateLimitStatus.getRemaining, r.getRateLimitStatus.getResetTimeInSeconds * 1000)
  ) {
}
