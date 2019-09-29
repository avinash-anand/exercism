object Isogram {
  def isIsogram(str: String): Boolean = {
    val lowerCaseStr = str.replaceAll("[- ]", "").toLowerCase
    lowerCaseStr.distinct.length == lowerCaseStr.length
  }
}
