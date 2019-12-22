import Bearing.Bearing

import scala.util.{Success, Try}

case class Robot(bearing: Bearing, coordinates: (Int, Int)) {
  def turnRight: Robot = this.bearing match {
    case Bearing.North => this.copy(Bearing.East, this.coordinates)
    case Bearing.South => this.copy(Bearing.West, this.coordinates)
    case Bearing.East => this.copy(Bearing.South, this.coordinates)
    case Bearing.West => this.copy(Bearing.North, this.coordinates)
  }

  def turnLeft: Robot = this.bearing match {
    case Bearing.North => this.copy(Bearing.West, (this.coordinates))
    case Bearing.South => this.copy(Bearing.East, this.coordinates)
    case Bearing.East => this.copy(Bearing.North, this.coordinates)
    case Bearing.West => this.copy(Bearing.South, this.coordinates)
  }

  def advance: Robot = this.bearing match {
    case Bearing.North => this.copy(this.bearing, (this.coordinates._1, this.coordinates._2 + 1))
    case Bearing.South => this.copy(this.bearing, (this.coordinates._1, this.coordinates._2 - 1))
    case Bearing.East => this.copy(this.bearing, (this.coordinates._1 + 1, this.coordinates._2))
    case Bearing.West => this.copy(this.bearing, (this.coordinates._1 - 1, this.coordinates._2))
  }

  def simulate(instruction: String, robot: Robot = this): Robot = Try(instruction.charAt(0)) match{
    case Success('A') => simulate(instruction.drop(1),robot.advance)
    case Success('R') => simulate(instruction.drop(1),robot.turnRight)
    case Success('L') => simulate(instruction.drop(1),robot.turnLeft)
    case _ => robot
  }

}






