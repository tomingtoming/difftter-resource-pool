package susuru.core

trait Pool[RSC, RSP] {

  def lease(): RSC

  def lease(id: Long): RSC

  def release(id: Long, resource: RSC, response: RSP): Unit
}
