import scala.annotation.tailrec

object CollatzConjecture {
  def steps(num: Int): Option[Int] = {
    @tailrec
    def loop(number: Int, acc: Int): Int = {
      if (number == 1) acc
      else if (isEven(number)) loop(number / 2, acc + 1)
      else loop(threeTimesNumberPlusOne(number), acc + 1)
    }

    if (num <= 0) None
    else Some(loop(num, 0))
  }

  private def isEven(num: Int): Boolean = num % 2 == 0

  private def threeTimesNumberPlusOne(number: Int): Int = (3 * number) + 1

}
