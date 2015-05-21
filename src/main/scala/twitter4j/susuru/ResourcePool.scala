package twitter4j.susuru

import akka.actor._
import twitter4j.Twitter
import twitter4j.susuru.actor.RateLimitActor
import twitter4j.susuru.wrapper.TwitterWrapper

import scala.concurrent.duration.Duration

/**
 * Resource pool to manage twitter rate limit resources
 */
class ResourcePool(val refreshInterval: Duration, actorSystem: Option[ActorSystem] = None) {
  protected val system: ActorSystem = actorSystem.getOrElse(ActorSystem("SusuruResourcePoolSystem"))
  protected val actor: ActorRef = system.actorOf(Props(classOf[RateLimitActor]), "RateLimitActor")

  /* Pool configurations */
  def resourceSource(): Seq[Twitter] = Nil

  /* Provide resource wrappper */
  def lease(id: Long): Twitter = new TwitterWrapper(id, actor)

  /* Shutdown if the system requires a shutdown */
  def shutdown(): Unit = {
    if (actorSystem.isEmpty) {
      system.shutdown()
    }
  }
}
