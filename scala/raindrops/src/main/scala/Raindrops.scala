import scala.annotation.tailrec

object Raindrops {
  def convert1(n: Int): String = {

    @tailrec
    def loop(n: Int, acc: List[String]): String = {
      if (isNotDivisibleBy(n, 7) && isNotDivisibleBy(n, 5) && isNotDivisibleBy(n, 3)) acc.mkString("")
      else if (isDivisibleBy(n, 7)) loop(divideUntilIndivisibleBy(n, 7), "Plong" :: acc)
      else if (isDivisibleBy(n, 5)) loop(divideUntilIndivisibleBy(n, 5), "Plang" :: acc)
      else if (isDivisibleBy(n, 3)) loop(divideUntilIndivisibleBy(n, 3), "Pling" :: acc)
      else loop(n, acc)
    }

    val result = loop(n, Nil)
    if (result.isEmpty) n.toString else result
  }

  private def divideUntilIndivisibleBy(num: Int, divisor: Int): Int = {
    @tailrec
    def loop(num: Int, divisor: Int): Int = {
      if (num % divisor != 0) num
      else loop(num / divisor, divisor)
    }

    loop(num, divisor)
  }

  private def isDivisibleBy(num: Int, divisor: Int): Boolean = num % divisor == 0

  private def isNotDivisibleBy(num: Int, divisor: Int): Boolean = !isDivisibleBy(num, divisor)

  //using foldLeft
  def convert(n: Int): String = {
    val raindrops: Map[Int, String] = Map(3 -> "Pling", 5 -> "Plang", 7 -> "Plong")
    val result = raindrops.foldLeft("") { case (acc, (key, value)) => if (n % key == 0) acc + value else acc }
    if (result.isEmpty) n.toString
    else result
  }

}
