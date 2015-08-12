package susuru.core.resource

import org.apache.log4j.Logger

import scala.concurrent.{Promise, Future}
import scala.collection.mutable

class Susuru[T, R](src: () => Map[Id, T], update: R => (Int, EpochTimeMillis)) extends Thread {
  private val logger = Logger.getLogger(this.getClass.getName)
  /** Margin for time window. Unit: millisecond */
  private val margin = 1000
  private var killed = false

  val supplies: mutable.Map[Id, Supply[T]] = mutable.Map.empty[Id, Supply[T]]
  val demands: mutable.Queue[Demand[T, R]] = mutable.Queue.empty[Demand[T, R]]

  def kill: Unit = killed = true

  override def run(): Unit = {
    while (!killed) {
      matching()
    }
  }

  /**
   * Matching demands and supplies.
   * @param now Now time in milli seconds, Default: system time.
   */
  def matching(now: Long = System.currentTimeMillis()): Unit = {
    logger.trace("Market matching start: demands length = " + demands.length)
    demands.dequeueAll { demand =>
      supplies.collectFirst {
        case (id, supply) if demand.idOption.isDefined && demand.idOption.get == id && supply.until < now + margin && 0 < supply.count => supply
        case (id, supply) if demand.idOption.isDefined && demand.idOption.get == id && now + margin < supply.until => supply
        case (id, supply) if demand.idOption.isEmpty && supply.until < now + margin && 0 < supply.count => supply
        case (id, supply) if demand.idOption.isEmpty && now + margin < supply.until => supply
      } match {
        case Some(supply) =>
          val result: R = demand.f(supply.t)
          val (count, until) = update(result)
          supply.count = count
          supply.until = until
          demand.promise.success(result)
          true
        case None =>
          // update supplies
          val source = src()
          (source -- (source.keySet -- supplies.keySet)).map {
            case (id, t) => supplies.put(id, new Supply[T](t, 1, Long.MaxValue))
          }
          false
      }
    }
  }

  def loanDo(idOption: Option[Long], f: T => R, now: Long = System.currentTimeMillis()): Future[R] = {
    val demand = Demand(idOption, f, Promise[R]())
    demands.enqueue(demand)
    demand.promise.future
  }
}

final case class Demand[T, R](idOption: Option[Id], f: T => R, promise: Promise[R])

final class Supply[T](val t: T, var count: Int, var until: EpochTimeMillis = Long.MinValue)
