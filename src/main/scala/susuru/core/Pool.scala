package susuru.core

trait Pool[R] {
   def lease(): R
   def lease(id: Long): R
   def release(): Unit
 }
