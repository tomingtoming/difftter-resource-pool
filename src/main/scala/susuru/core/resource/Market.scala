package susuru.core.resource

import scala.concurrent.{Promise, Future}
import scala.collection.mutable

class Market[T] {
  /** Margin for time window. Unit: millisecond */
  private val margin = 1000

  val listedStocks: ListedStocks = new ListedStocks
  val supplies: mutable.PriorityQueue[(EpochTime, Id)] = mutable.PriorityQueue.empty[(EpochTime, Id)]
  val demands: mutable.PriorityQueue[(EpochTime, Id)] = mutable.PriorityQueue.empty[(EpochTime, Id)]

  /**
   * Clean up demands and supplies after the deadline.
   * @param now Now time in milli seconds, Default: system time.
   */
  private def cleanup(now: Long = System.currentTimeMillis()): Unit = demands.synchronized {
    supplies.synchronized {
      demands.filter(_._2 < now).map(_._2)
      supplies.filter(_._2 < now).map(_._2)
    }
  }

  def matching(): Unit = demands.synchronized {
    supplies.synchronized {
      demands.foreach { case (epoch: EpochTime, id: Id) =>
        //
      }
    }
  }

  def supply(s: Supply[T], ms: Long, now: Long = System.currentTimeMillis()): Future[T] = {
    val promise = Promise[T]()
    supplies.enqueue()
    cleanup()
    matching()
    promise.future
  }

  def demand(id: Option[Long]): Future[T] = {
    val promise = Promise[T]()
    cleanup()
    promise.future
  }
}

final case class Supply[T](res: Resource[T], promise: Promise[T], limit: Long = Long.MinValue)

final case class Demand[T](res: Resource[T], promise: Promise[T], limit: Long = Long.MaxValue)
