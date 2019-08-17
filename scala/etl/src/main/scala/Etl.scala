object Etl {
  def transform(lettersPerScore: Map[Int, Seq[String]]): Map[String, Int] = {
    lettersPerScore.flatMap { case (score, letters) => letters.map(letter => letter.toLowerCase -> score) }
  }

}
