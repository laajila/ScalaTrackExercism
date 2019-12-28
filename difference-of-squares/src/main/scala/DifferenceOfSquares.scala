object DifferenceOfSquares {

  def sumOfSquares(n: Int): Int = List.range(1,n+1).map(x => x*x).sum

  def squareOfSum(n: Int): Int = scala.math.pow(List.range(1,n+1).sum,2).toInt

  def differenceOfSquares(n: Int): Int = squareOfSum(n)-sumOfSquares(n)
}
