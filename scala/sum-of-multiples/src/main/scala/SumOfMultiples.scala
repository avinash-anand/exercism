import scala.annotation.tailrec

object SumOfMultiples {

  def sum(factors: Set[Int], limit: Int): Int = {
    factors.filter(_ < limit).flatMap(factor => multiples(factor, limit)).sum
  }

  private def multiples(factor: Int, limit: Int): Set[Int] = {

    @tailrec
    def loop(multiplyBy: Int, acc: Set[Int]): Set[Int] = {
      if ((factor * multiplyBy) >= limit) acc
      else loop(multiplyBy + 1, acc.+(factor * multiplyBy))
    }

    loop(1, Set())
  }

}
