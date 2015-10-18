package susuru.core

trait State[R] {
  def idSet: Set[Long]

  def add(resources: Map[Long, R]): State[R]

  def leaseAny(at: Long): (Result[R], State[R])

  def leaseSome(id: Long, at: Long): (Result[R], State[R])

  def release(resource: Resource[R]): State[R]
}
