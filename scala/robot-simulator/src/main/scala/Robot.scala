import Bearing._

case class Robot(bearing: Bearing, coordinates: (Int, Int)) {

  def simulate(commands: String): Robot = commands.foldLeft(this) { (acc, command) =>
    if (command == 'L') acc.turnLeft
    else if (command == 'R') acc.turnRight
    else if (command == 'A') acc.advance
    else acc
  }


  def turnRight: Robot = bearing match {
    case North => copy(bearing = East)
    case South => copy(bearing = West)
    case East => copy(bearing = South)
    case West => copy(bearing = North)
  }

  def turnLeft: Robot = bearing match {
    case North => copy(bearing = West)
    case South => copy(bearing = East)
    case East => copy(bearing = North)
    case West => copy(bearing = South)
  }

  def advance: Robot = bearing match {
    case North => copy(coordinates = incrementY(coordinates))
    case South => copy(coordinates = decrementY(coordinates))
    case East => copy(coordinates = incrementX(coordinates))
    case West => copy(coordinates = decrementX(coordinates))
  }

  private def incrementX(coordinates: (Int, Int)): (Int, Int) = (coordinates._1 + 1, coordinates._2)

  private def incrementY(coordinates: (Int, Int)): (Int, Int) = (coordinates._1, coordinates._2 + 1)

  private def decrementX(coordinates: (Int, Int)): (Int, Int) = (coordinates._1 - 1, coordinates._2)

  private def decrementY(coordinates: (Int, Int)): (Int, Int) = (coordinates._1, coordinates._2 - 1)

}
