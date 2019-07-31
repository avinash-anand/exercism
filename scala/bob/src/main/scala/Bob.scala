object Bob {
  def response(statement: String): String = {
    if (isYellingAQuestion(statement)) "Calm down, I know what I'm doing!"
    else if (isShouting(statement)) "Whoa, chill out!"
    else if (isAskingQuestion(statement)) "Sure."
    else if (isAddressingWithoutSayingAnything(statement)) "Fine. Be that way!"
    else "Whatever."
  }

  private def isShouting(statement: String): Boolean = statement.exists(_.isLetter) && statement.filter(_.isLetter).forall(_.isUpper)

  private def isAskingQuestion(statement: String): Boolean = statement.nonEmpty && statement.trim.endsWith("?")

  private def isYellingAQuestion(statement: String): Boolean = isShouting(statement) && isAskingQuestion(statement)

  private def isAddressingWithoutSayingAnything(statement: String): Boolean = statement.isEmpty || statement.forall(_.isWhitespace)

}
