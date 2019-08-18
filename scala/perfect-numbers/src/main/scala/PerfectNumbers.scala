import NumberType.NumberType

object PerfectNumbers {
  def classify(number: Int): Either[String, NumberType] = {
    if (number < 1) {
      Left("Classification is only possible for natural numbers.")
    } else {
      val aliquotSumValue = aliquotSum(number)
      if (aliquotSumValue == number) Right(NumberType.Perfect)
      else if (aliquotSumValue > number) Right(NumberType.Abundant)
      else Right(NumberType.Deficient)
    }
  }

  private def aliquotSum(number: Int): Int = factorsOfNumberExceptSelf(number).sum

  private def factorsOfNumberExceptSelf(n: Int): Seq[Int] = {
    1 until n filter (x => n % x == 0)
  }

}
