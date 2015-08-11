package susuru.core.resource

import scala.collection.mutable

class ListedStocks {
  private val listed: mutable.Map[Id, EpochTime] = mutable.Map.empty[Long, Long]

  def listing(ids: Id*): Unit = ids.foreach(listed.put(_, 0L))

  def forbit(id: Id, until: EpochTime): Unit = listed.update(id, until)

  def delisting(ids: Id*): Unit = ids.foreach(listed.remove)

  def forbidden(now: EpochTime = System.currentTimeMillis()): Seq[Id] = listed.filter(now < _._2).values.toSeq

  def permitted(now: EpochTime = System.currentTimeMillis()): Seq[Id] = listed.filter(_._2 < now).values.toSeq
}
