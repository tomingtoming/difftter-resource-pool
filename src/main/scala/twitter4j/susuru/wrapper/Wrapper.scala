package twitter4j.susuru.wrapper

import java.util.concurrent.TimeUnit

import akka.actor.ActorRef
import akka.pattern._
import akka.util.Timeout
import info.toming.susuru.actor.LeaseResourcePersonal
import twitter4j.susuru.actor.{LeaseResourcePersonal, LeaseResourcePublic}

import scala.concurrent.Await
import scala.concurrent.duration.Duration
import scala.reflect.ClassTag

trait Wrapper[T] {
  implicit val m: ClassTag[T]
  implicit val timeout: Timeout = Timeout(120, TimeUnit.SECONDS)
  val id: Long
  val actor: ActorRef
  protected def pub(group: String): T = {
    Await.result((actor ? LeaseResourcePublic(group)).mapTo[T], Duration.Inf)
  }
  protected def per(group: String): T = {
    Await.result((actor ? LeaseResourcePersonal(id, group)).mapTo[T], Duration.Inf)
  }
}
