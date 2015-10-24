package susuru.core

trait Pool[RSC, RSP] {

  def leaseAny(): RSC

  def leaseSome(id: Long): RSC

  def release(id: Long, resource: RSC, response: RSP): Unit
}
