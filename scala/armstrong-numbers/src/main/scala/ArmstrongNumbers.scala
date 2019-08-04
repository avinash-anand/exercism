import scala.annotation.tailrec

object ArmstrongNumbers {
  def isArmstrongNumber(i: Int): Boolean = {
    val numberOfDigits = i.toString.length

    @tailrec
    def loop(number: Int, acc: Int): Int = {
      if (number == 0) acc
      else loop(number / 10, Math.pow(number % 10, numberOfDigits).toInt + acc)
    }

    val sumOfDigitsToItsPowerOfNumberOfDigits = loop(i, 0)
    sumOfDigitsToItsPowerOfNumberOfDigits == i
  }

}
