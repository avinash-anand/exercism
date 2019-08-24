import Bearing._

import scala.annotation.tailrec

case class Robot(bearing: Bearing, coordinates: (Int, Int)) {

  def simulate(commands: String): Robot = {

    @tailrec
    def loop(commands: List[Char], result: Robot): Robot = commands match {
      case Nil => result
      case head :: tail if head == 'L' => loop(tail, result.turnLeft)
      case head :: tail if head == 'R' => loop(tail, result.turnRight)
      case head :: tail if head == 'A' => loop(tail, result.advance)
    }

    loop(commands.toList, this)
  }

  def turnRight: Robot = this.bearing match {
    case North => this.copy(bearing = East)
    case South => this.copy(bearing = West)
    case East => this.copy(bearing = South)
    case West => this.copy(bearing = North)
  }

  def turnLeft: Robot = this.bearing match {
    case North => this.copy(bearing = West)
    case South => this.copy(bearing = East)
    case East => this.copy(bearing = North)
    case West => this.copy(bearing = South)
  }

  def advance: Robot = this.bearing match {
    case North => this.copy(coordinates = incrementY(this.coordinates))
    case South => this.copy(coordinates = decrementY(this.coordinates))
    case East => this.copy(coordinates = incrementX(this.coordinates))
    case West => this.copy(coordinates = decrementX(this.coordinates))
  }

  private def incrementX(coordinates: (Int, Int)): (Int, Int) = (coordinates._1 + 1, coordinates._2)

  private def incrementY(coordinates: (Int, Int)): (Int, Int) = (coordinates._1, coordinates._2 + 1)

  private def decrementX(coordinates: (Int, Int)): (Int, Int) = (coordinates._1 - 1, coordinates._2)

  private def decrementY(coordinates: (Int, Int)): (Int, Int) = (coordinates._1, coordinates._2 - 1)

}
