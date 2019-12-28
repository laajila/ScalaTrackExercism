case class Matrix(elements: String) {
  val vectorElements = elements.split("\n").map(x => x.split(" ").map(_.toInt).toVector).toVector


  def column(n: Int): Vector[Int] = {
    vectorElements.map(x => x(n))
  }

  def row(n: Int): Vector[Int] = {
    vectorElements(n)
  }
}