package susuru.core

sealed case class Query[R]()

case class AddResource[R](id: Long, r: R) extends Query

case class DelResource[R](id: Long) extends Query

case class LeaseResource[R](id: Long) extends Query

case class ReleaseResource[R](id: Long) extends Query

