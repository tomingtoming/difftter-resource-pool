package susuru.core

trait Pool[RSC, RSP] {

  def leaseAny(family: String): RSC

  def leaseSome(family: String, id: Long): RSC

  def release(family: String, id: Long, resource: RSC, response: RSP): Unit

  def invalidate(resource: RSC): Unit
}
