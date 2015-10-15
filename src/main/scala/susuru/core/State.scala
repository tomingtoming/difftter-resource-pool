package susuru.core

trait State[R] {
  def idSet: Set[Long]
  def query(q: Query[R]): (Result[R], State[R])
}
