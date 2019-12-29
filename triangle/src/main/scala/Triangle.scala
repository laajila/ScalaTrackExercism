case class Triangle(x: Double, y: Double, z: Double) {
  def isTriangle(): Boolean = {

    (x, y, z) match {
      case _ if ((x + y <= z) || (x + z <= y) || (y + z <= x)) => false
      case _ => true

    }
  }

  def equilateral: Boolean = (x, y, z) match {
    case _ if (x == y && y == z) => isTriangle()
    case _ => false
  }

  def isosceles: Boolean = (x, y, z) match {
    case _ if (x == y || x == z || y == z) => isTriangle()
    case _ => false
  }

  def scalene: Boolean = (!this.isosceles && !this.equilateral) && isTriangle()
}