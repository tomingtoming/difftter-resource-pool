package susuru.core

trait Pool[R] {

  def lease(at: Long = System.currentTimeMillis()): R

  def lease(id: Long, at: Long = System.currentTimeMillis()): R

  def release(id: Long, count: Int, until: Long, resource: R): Unit
}
