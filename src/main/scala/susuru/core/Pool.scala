package susuru.core

trait Pool[R] {

  def lease(): R

  def lease(id: Long): R

  def release(id: Long, count: Int, until: Long, resource: R): Unit
}
