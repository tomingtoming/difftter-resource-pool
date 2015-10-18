package susuru.core

case class StateCollection[R](_idMap: Map[Long, Resource[R]]) extends State[R] {
  def this() = this(Map.empty[Long, Resource[R]])

  private val idMap: Map[Long, Resource[R]] = _idMap

  override def idSet: Set[Long] = idMap.keySet

  override def add(resources: Map[Long, R]): State[R] = {
    StateCollection(idMap ++ resources.map {
      case (id, resource) => (id, Resource(id, Int.MaxValue, Long.MaxValue, resource))
    })
  }

  override def leaseAny(at: Long): (Result[R], State[R]) = {
    idMap.find {
      case (id, res) =>
        // Resource is not now leasing, within the time limit, within the limit number of times.
        at < res.until && 0 < res.count
    } match {
      case Some((id, res)) =>
        (Lease(res), StateCollection(idMap.updated(id, res.copy(count = -1))))
      case None =>
        (Wait(idMap.map(_._2.until).min), this)
    }
  }

  override def leaseSome(id: Long, at: Long): (Result[R], State[R]) = idMap.get(id) match {
    case Some(res) if res.count < 0 =>
      // Resource is now leasing.
      (WaitNotify(res.body), this)
    case Some(res) if res.until < at && 0 == res.count =>
      // Within the time limit, limit the number of times over.
      (Wait(res.until), this)
    case Some(res) =>
      // Time limit over OR Within the time limit, within the limit number of times.
      (Lease(res), StateCollection(idMap.updated(id, res.copy(count = -1))))
    case None =>
      (NotExists(), this)
  }

  override def release(resource: Resource[R]): State[R] = {
    StateCollection(idMap.updated(resource.id, resource))
  }
}
