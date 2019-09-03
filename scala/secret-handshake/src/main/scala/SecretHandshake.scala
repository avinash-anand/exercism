import scala.annotation.tailrec

object SecretHandshake {

  def commands(i: Int): List[String] = {
    require(i < 32, "Secret handshake not defined for int greater than 31")
    val binaryRepresentation = i.toBinaryString.toInt

    def getCommands(binaryRep: Int): List[String] = {
      if (binaryRep >= 10000) {
        loop(binaryRep - 10000, Nil).reverse
      } else {
        loop(binaryRep, Nil)
      }
    }

    @tailrec
    def loop(binaryRep: Int, acc: List[String]): List[String] = {
      if (binaryRep >= 1000) loop(binaryRep - 1000, "jump" :: acc)
      else if (binaryRep >= 100) loop(binaryRep - 100, "close your eyes" :: acc)
      else if (binaryRep >= 10) loop(binaryRep - 10, "double blink" :: acc)
      else if (binaryRep >= 1) loop(binaryRep - 1, "wink" :: acc)
      else acc
    }

    getCommands(binaryRepresentation)
  }

}
