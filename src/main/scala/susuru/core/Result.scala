package susuru.core

sealed class Result[R]

case class Void[R]() extends Result[R]

case class NotExists[R]() extends Result[R]

case class WaitNotify[R](r: R) extends Result[R]

case class Wait[R](until: Long) extends Result[R]

case class Lease[R](resource: Resource[R]) extends Result[R]
