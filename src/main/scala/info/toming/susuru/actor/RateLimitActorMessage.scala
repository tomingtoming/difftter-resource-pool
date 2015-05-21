package info.toming.susuru.actor

import twitter4j.Twitter

sealed trait RateLimitActorMessage

/* Messages require response */
sealed trait RateLimitActorRequest extends RateLimitActorMessage
case class LeaseThinWrapper(id: Long) extends RateLimitActorRequest
case class LeaseResourcePublic(title: String) extends RateLimitActorRequest
case class LeaseResourcePersonal(id: Long, title: String) extends RateLimitActorRequest

/* Messages notify only */
sealed trait RateLimitActorNotification extends RateLimitActorMessage
case class ResourceHasBeenReset(t: Twitter) extends RateLimitActorNotification
