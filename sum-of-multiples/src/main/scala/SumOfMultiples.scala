object SumOfMultiples {

  def sum(factors: Set[Int], limit: Int): Int = {
    val listtoFindMultiplier = List.range(1, limit)
    factors.flatMap(
      i => listtoFindMultiplier.map(m => m*i).filter(_<limit)
    ).sum

  }
}

