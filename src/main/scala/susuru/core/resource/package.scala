package susuru.core

import scala.concurrent.{Promise, Future}

package object resource {

  trait Resource[T] {
    val id: Long
  }

  class Market[T] {
    val forbidden: Forbidden[T] = new Forbidden[T]
    val permitted: Permitted[T] = new Permitted[T]
    val supplies: Supplies[T] = new Supplies[T]
    val demands: Demands[T] = new Demands[T]
    def demand: Future[T] = {
      val promise = Promise[T]()
      promise.future
    }
  }

  class Forbidden[T] {
    //
  }

  class Permitted[T] {
    //
  }

  case class Supply[T](res: Resource[T], limit: Long)
  class Supplies[T] {
    //
  }

  case class Demand[T](res: Resource[T])
  class Demands[T] {
    //
  }
}
