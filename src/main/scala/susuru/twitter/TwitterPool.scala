package susuru.twitter

import susuru.twitter.wrapper.TwitterWrapper
import twitter4j.{TwitterFactory, RateLimitStatus, Twitter}

import scala.collection.mutable

class TwitterPool(resolve: Long => Twitter, supply: () => Seq[Twitter]) {
  private val ordering: Ordering[(RateLimitStatus, Twitter)] = new Ordering[(RateLimitStatus, Twitter)] {
    override def compare(x: (RateLimitStatus, Twitter), y: (RateLimitStatus, Twitter)): Int = {
      val nowTimeInSeconds: Double = System.currentTimeMillis() / 1000.0
      def conv(rateLimit: RateLimitStatus): Double = {
        rateLimit.getLimit * (rateLimit.getResetTimeInSeconds - nowTimeInSeconds)
      }
      Ordering[Double].compare(conv(x._1), conv(y._1))
    }
  }
  private val limitQueue: mutable.PriorityQueue[(RateLimitStatus, Twitter)] = mutable.PriorityQueue.empty[(RateLimitStatus, Twitter)](ordering)
  private val id2Resource: mutable.Map[Long, (Twitter, Option[RateLimitStatus])] = mutable.Map.empty
  private val zeroRateLimit: RateLimitStatus = new RateLimitStatus {
    override val getLimit: Int = 1
    override val getRemaining: Int = 1
    override val getSecondsUntilReset: Int = 0
    override val getResetTimeInSeconds: Int = 0
  }

  def withResource[T](idOption: Option[Long])(f: Twitter => T): T = {
    val twitter = new TwitterWrapper(this)
    idOption.foreach { id => twitter.setId(id) }
    f(twitter)
  }

  def lease(id: Long): Twitter = id match {
    case 0 if limitQueue.isEmpty =>
      limitQueue.enqueue(supply().map { tw => (zeroRateLimit, tw) }: _*)
      lease(id)
    case 0 =>
      val (rateLimit, twitter) = limitQueue.dequeue()
      if (isValid(rateLimit)) {
        null
      } else {
        null
      }
    case n if id2Resource.contains(n) =>
      null
    case n =>
      null
  }

  def release(id: Long, rateLimit: RateLimitStatus): Unit = {
    //
  }

  private def isValid(rateLimit: RateLimitStatus): Boolean = {
    2.5 < rateLimit.getResetTimeInSeconds.toDouble - System.currentTimeMillis() / 1000.0 && 0 < rateLimit.getRemaining
  }
}
