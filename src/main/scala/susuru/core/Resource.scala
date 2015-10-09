package susuru.core

case class Resource[R](id: Long, count: Int, until: Long, body: R)
