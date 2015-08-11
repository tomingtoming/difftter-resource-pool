package susuru.core

import scala.collection.mutable
import scala.concurrent.{Promise, Future}
import scala.math.Ordering

package object resource {

  type EpochTime = Long
  type Id = Long

  trait Resource[T] {
    val id: Long
  }
}
