
object ArmstrongNumbers {

  def isArmstrongNumber(n: Int): Boolean = {
    digits(n).map(scala.math.pow(_,numDigits(n)).asInstanceOf[Int]).sum==n
  }

  def numDigits(n: Int, nDigits: Int = 0): Int = n match {
    case _ if(n/10==0) => nDigits +1
    case _ => numDigits(n / 10, nDigits + 1)
  }

  def digits(n: Int, list: List[Int] = List()): List[Int] = n % 10 match {
    case 0 => list :+ n / (numDigits(n) * 10)
    case _ => digits(n / 10, list :+ n % 10)

  }
}