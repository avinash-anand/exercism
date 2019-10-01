object Pangrams {

  private val listOfAlphabets: Seq[Char] = 'a' to 'z'

  def isPangram2(input: String): Boolean = {
    val lower = input.toLowerCase
    input.nonEmpty && listOfAlphabets.forall(x => lower.contains(x))
  }

  def isPangram(input: String): Boolean = input.toLowerCase.filter(_.isLetter).distinct.length == 26

}
