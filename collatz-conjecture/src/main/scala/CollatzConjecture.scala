object CollatzConjecture {
  def steps(num: Int, iter: Int = 0): Option[Int] = num match {
    case _ if (num <= 0) => None
    case 1 => Some(iter)
    case _ if (num % 2 == 0) => steps(num / 2, iter + 1)
    case _ if (num % 2 != 0) => steps(3 * num + 1, iter + 1)
  }
}