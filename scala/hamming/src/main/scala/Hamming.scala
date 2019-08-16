import java.util.Objects.nonNull

object Hamming {

  def distance(leftString: String, rightString: String): Option[Int] = {
    require(nonNull(leftString) && nonNull(rightString))
    if (leftString.length != rightString.length) None
    else Some(getHammingDistance(leftString, rightString))
  }

  private def getHammingDistance(leftString: String, rightString: String): Int = {
    leftString.zip(rightString).count { case (l, r) => l != r }
  }

}
