package susuru.core

import scala.collection.mutable
import scala.concurrent.{Promise, Future}
import scala.math.Ordering

package object resource {
  type EpochTimeMillis = Long
  type Id = Long
}
