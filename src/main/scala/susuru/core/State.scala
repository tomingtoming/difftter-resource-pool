package susuru.core

trait State {
  def query(q: Query, at: Long): (Result, State)
}
