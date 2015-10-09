package susuru.core

trait State[R] {
  def query(q: Query[R]): (Result[R], State[R])
}
