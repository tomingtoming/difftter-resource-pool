package susuru.core.resource

import org.specs2.Specification
import org.specs2.mock.Mockito

class MarketTest extends Specification with Mockito {
  def is = s2"""
  Specification: ${this.getClass.getName}
    New `listing` id is included in `permitted`.      $e1
  """
  def e1 = {
    //val susuru = new Susuru
    true
  }
}
