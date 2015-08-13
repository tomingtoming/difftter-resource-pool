package susuru.core.resource

import org.apache.log4j.Logger

import scala.concurrent.{Promise, Future}
import scala.collection.mutable

/**
 * Stock resources and matching on demand.
 * @param source Function to get recent resources.
 * @param update Function to get limit count and reset time.
 * @tparam T Resource type
 * @tparam R Result type with limit count and reset time.
 */
class Susuru[T, R](source: () => Map[Id, T], update: R => (Int, EpochTimeMillis)) extends Thread {
  private val logger = Logger.getLogger(this.getClass.getName)
  /** Margin for time window. Unit: millisecond */
  private val margin = 1000
  private var killed = false

  val supplies: mutable.Map[Id, Supply[T]] = mutable.Map.empty[Id, Supply[T]]
  val demands: mutable.Queue[Demand[T, R]] = mutable.Queue.empty[Demand[T, R]]

  def kill(): Unit = killed = true

  override def run(): Unit = {
    try {
      source().foreach { case (id, t) => supplies.put(id, new Supply[T](t, 1, Long.MaxValue)) }
      while (!killed) {
        matching()
        supplies.map(_._2.until).min - System.currentTimeMillis() match {
          case n if 0 < n =>
            logger.debug(s"Susuru will wait: demands.synchronized(demands.wait($n))")
            demands.synchronized(demands.wait(n))
            logger.debug(s"Susuru was notified: demands.synchronized(demands.wait($n))")
          case _ =>
            logger.debug("Susuru will wait: demands.synchronized(demands.wait())")
            demands.synchronized(demands.wait())
            logger.debug("Susuru was notified: demands.synchronized(demands.wait())")
        }
      }
    } finally {
      demands.dequeueAll(_ => true).foreach(_.promise.failure(new SusuruKilledException("Susuru terminated just now.")))
    }
  }

  /**
   * Matching demands and supplies.
   * @param now Now time in milli seconds, Default: system time.
   */
  def matching(now: Long = System.currentTimeMillis()): Unit = {
    logger.debug(s"Market matching start: demands.length = ${demands.length}")
    logger.debug(s"Market matching start: supplies = ${supplies.toString()}")
    demands.dequeueAll { demand =>
      logger.debug("supplies: " + supplies)
      supplies.collectFirst {
        case (id, supply) if demand.idOption.isDefined && demand.idOption.get == id && now + margin < supply.until && 0 < supply.count =>
          logger.debug("Match case:1 when a supply remaining resouce with specified id exists.")
          (id, supply)
        case (id, supply) if demand.idOption.isDefined && demand.idOption.get == id && supply.until < now + margin =>
          logger.debug("Match case:2 when a supply reset resouce with specified id exists.")
          (id, supply)
        case (id, supply) if demand.idOption.isEmpty && now + margin < supply.until && 0 < supply.count =>
          logger.debug("Match case:3 when a supply remaining resouce with id unspecified exists.")
          (id, supply)
        case (id, supply) if demand.idOption.isEmpty && supply.until < now + margin =>
          logger.debug("Match case:4 when a supply reset resouce with id unspecified exists.")
          (id, supply)
      } match {
        case Some((id, supply)) =>
          val result: R = demand.f(supply.t)
          val (count, until) = update(result)
          supply.count = count
          supply.until = until
          demand.promise.success(result)
          true
        case None =>
          logger.debug("None match:5 demand = " + demand)
          // update supplies
          val src = source()
          (src -- supplies.keySet).foreach {
            case (id, t) =>
              logger.debug("Update supplies: id = " + id)
              supplies.put(id, new Supply[T](t, 1, Long.MaxValue))
          }
          false
      }
    }
    logger.debug(s"Market matching end: demands.length = ${demands.length}")
    logger.debug(s"Market matching end: supplies = ${supplies.toString()}")
  }

  def loanDo[R2 <: R](idOption: Option[Long])(f: T => R2): Future[R2] = {
    if(!killed) {
      val demand = Demand(idOption, f, Promise[R2]())
      logger.debug(s"Enqueue market and notify: $idOption")
      demands.enqueue(demand.copy(promise = demand.promise.asInstanceOf[Promise[R]]))
      demands.synchronized(demands.notify())
      demand.promise.future
    } else {
      Future.failed(new SusuruKilledException("Susuru already terminated."))
    }
  }
}

final case class Demand[T, R](idOption: Option[Id], f: T => R, promise: Promise[R])

final class Supply[T](val t: T, var count: Int, var until: EpochTimeMillis = Long.MinValue) {
  override def toString: String = "Supply(t = %s, count = %d, until = %d)".format(t, count, until)
}
