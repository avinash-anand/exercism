

object SecretHandshake {

  private def shouldReverse(n: Int): Boolean = (n & 16) != 0

  private val CommandMapping = Map(1 -> "wink", 2 -> "double blink", 4 -> "close your eyes", 8 -> "jump")

  def commands(i: Int): List[String] = {
    val result = CommandMapping.toList
      .filter { case (command, _) => (command & i) != 0 }
      .map { case (_, value) => value }
    if (shouldReverse(i)) result.reverse
    else result
  }

}
