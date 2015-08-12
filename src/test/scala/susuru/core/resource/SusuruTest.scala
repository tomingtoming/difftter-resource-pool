package susuru.core.resource

import org.specs2.Specification
import org.specs2.mock.Mockito

import scala.concurrent.Await
import scala.concurrent.duration.Duration

class SusuruTest extends Specification with Mockito {
  def is = s2"""
  Specification: ${this.getClass.getName}
    Case: New resource exists.                        $e1
  """

  case class Resource(id: Id)

  case class Result(string: String, count: Int, until: EpochTimeMillis)

  def e1 = {
    val susuru = new Susuru[Resource, Result](() => Map[Id, Resource](1L -> Resource(1L)), r => (r.count, r.until))
    val future1 = susuru.loanDo(None)(t => Result("Result:" + t.id, 0, Long.MaxValue - 1))
    val future2 = susuru.loanDo(Some(2))(t => throw new Exception("Test fail"))
    susuru.matching()
    susuru.matching()
    future1.isCompleted must beTrue
    future2.isCompleted must beFalse
    Await.result(future1, Duration("1.0s")) mustEqual Result("Result:1", 0, Long.MaxValue - 1)
  }
}
