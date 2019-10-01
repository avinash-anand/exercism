object DifferenceOfSquares {

  def sumOfSquares(n: Int): Int = (1 to n).map(num => num * num).sum

  def squareOfSum(n: Int): Int = {
    val sumOfNum = (1 to n).sum
    sumOfNum * sumOfNum
  }

  def differenceOfSquares(n: Int): Int = squareOfSum(n) - sumOfSquares(n)

}
