object Leap {
  def leapYear(year: Int): Boolean = yearDivisibleBy400(year) || yearDivisibleBy4ButNotBy100(year)

  private def yearDivisibleBy4(year: Int): Boolean = year % 4 == 0

  private def yearNotDivisibleBy100(year: Int): Boolean = year % 100 != 0

  private def yearDivisibleBy4ButNotBy100(year: Int): Boolean = yearDivisibleBy4(year) && yearNotDivisibleBy100(year)

  private def yearDivisibleBy400(year: Int): Boolean = year % 400 == 0
}
