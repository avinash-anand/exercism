import java.util.Objects.nonNull

import scala.annotation.tailrec

class Accumulate {
  def accumulate[A, B](f: (A) => B, list: List[A]): List[B] = {
    require(nonNull(list))

    @tailrec
    def loop(list: List[A], f: (A) => B, acc: List[B]): List[B] = {
      list match {
        case Nil => acc
        case head :: tail => loop(tail, f, f(head) :: acc)
      }
    }

    loop(list, f, Nil).reverse
  }

}
