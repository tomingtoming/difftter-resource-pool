package susuru.core

sealed class Query[R]

case class Add[R](id: Long, resource: R) extends Query[R]

case class Delete[R](id: Long) extends Query[R]

case class LeaseSome[R](id: Long, at: Long) extends Query[R]

case class LeaseAny[R](at: Long) extends Query[R]

case class Release[R](resource: Resource[R]) extends Query[R]
