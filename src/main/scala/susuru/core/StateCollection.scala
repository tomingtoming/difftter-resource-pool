package susuru.core

class StateCollection[R] extends State {
  private val idMap: Map[Long, R] = Map.empty
  override def query(q: Query, at: Long): (Result, State) = q match {
    case
  }
}
