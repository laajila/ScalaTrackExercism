case class Triangle(x: Double, y: Double, z: Double) {
  def isTriangle(): Boolean = !((x + y <= z) || (x + z <= y) || (y + z <= x) || x == 0 || y == 0 || z == 0)

  def equilateral: Boolean = x == y && y == z && isTriangle()

  def isosceles: Boolean = (x == y || x == z || y == z) && isTriangle()


  def scalene: Boolean = (!this.isosceles && !this.equilateral) && isTriangle()
}