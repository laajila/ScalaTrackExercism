object BinarySearch {
  def find(l: List[Int], n: Int, i: Int = 0): Option[Int] = n match {
    case _ if (l.isEmpty) => None
    case _ if (l(l.length / 2) > n) => find(l.slice(0, l.length / 2), n, i)
    case _ if (l(l.length / 2) < n) => find(l.slice(l.length / 2 + 1, l.length + 1), n, i + (l.length / 2) + 1)
    case _ if (l(l.length / 2) == n) => Some(i + l.length / 2)
  }


}