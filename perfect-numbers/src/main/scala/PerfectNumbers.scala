import NumberType.NumberType

object PerfectNumbers {
  def properDivisorsSum(n: Int): Int = {
    List.range(1, n/2+1).filter(n % _ == 0).sum
  }

  def classify(n: Int): Either[String, String] ={
    val sum=properDivisorsSum(n)
    n match {
      case _ if (n <= 0) => Left("Classification is only possible for natural numbers.")
      case _ if (n == sum) => Right(NumberType.Perfect)
      case _ if (n < sum) => Right(NumberType.Abundant)
      case _ if (n > sum) => Right(NumberType.Deficient)
    }
  }
}