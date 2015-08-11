package susuru.core.resource

import org.specs2._
import org.specs2.mock.Mockito
import susuru.twitter.TwitterPool
import twitter4j._

class ListedStocksTest extends Specification with Mockito {
  def is = s2"""
  Specification: ${this.getClass.getName}
    New `listing` id is included in `permitted`.      $newListing
    Forbidden forever id is included in `forbidden`.  $forbitForever
    `delisting`ed id excluded in both list.           $delistingId
    Id `forbit` until now is included in `permitted`  $forbitUntilNow
  """
  def newListing = {
    val ls = new ListedStocks
    ls.listing(42L)
    ls.permitted() must contain(42L)
    ls.forbidden() must not contain(42L)
  }

  def forbitForever = {
    val ls = new ListedStocks
    ls.listing(42L, 23L)
    ls.forbit(42L, Long.MaxValue)
    ls.permitted() must contain(23L)
    ls.forbidden() must contain(23L)
    ls.permitted() must not contain(42L)
    ls.forbidden() must not contain(42L)
  }

  def delistingId = {
    val ls = new ListedStocks
    ls.listing(42L, 23L)
    ls.delisting(23L)
    ls.permitted() must not contain(23L)
    ls.forbidden() must not contain(23L)
    ls.permitted() must contain(42L)
    ls.forbidden() must not contain(42L)
  }

  def forbitUntilNow = {
    val ls = new ListedStocks
    ls.listing(42L, 23L)
    ls.delisting(23L)
    ls.permitted() must not contain(23L)
    ls.forbidden() must not contain(23L)
    ls.permitted() must contain(42L)
    ls.forbidden() must not contain(42L)
  }
}
