package susuru.core.resource

import scala.concurrent.{Promise, Future}

trait Market[T] {
  val listedStocks: ListedStocks = new ListedStocks
  val supplies: Supplies[T] = new Supplies[T]
  val demands: Demands[T] = new Demands[T]

  def supply(s: Supply[T]): Future[T] = {
    val promise = Promise[T]()
    promise.future
  }

  def demand(id: Option[Long]): Future[T] = {
    val promise = Promise[T]()
    promise.future
  }
}

final case class Supply[T](res: Resource[T], limit: Long = Long.MinValue)

final class Supplies[T] {
  //
}

final case class Demand[T](res: Resource[T], limit: Long = Long.MaxValue)

final class Demands[T] {
  //
}
