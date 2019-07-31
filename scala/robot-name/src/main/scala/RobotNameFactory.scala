import java.util.Random

object RobotNameFactory {

  private val random = new Random()
  private val Bound = 10

  def getName: String = s"$getRandomAlphabet$getRandomAlphabet$getRandomInt$getRandomInt$getRandomInt"

  private def getRandomAlphabet: Char = {
    val alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    alphabets.charAt(random.nextInt(alphabets.length))
  }

  private def getRandomInt: Int = random.nextInt(Bound)

}
