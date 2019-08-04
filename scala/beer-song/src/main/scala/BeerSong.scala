object BeerSong {
  def recite(numberOfBottlesOnWall: Int, numberOfTimesToRecite: Int): String = {
    def loop(, acc: Seq[String]): Seq[String] = {
      if (numberOfBottlesOnWall > 2)
        s"$numberOfBottlesOnWall bottles of beer on the wall, $numberOfBottlesOnWall bottles of beer.\nTake one down and pass it around, ${numberOfBottlesOnWall - 1} bottles of beer on the wall.\n"
      else if(numberOfBottlesOnWall == 2) {

      }
    }
  }

}
