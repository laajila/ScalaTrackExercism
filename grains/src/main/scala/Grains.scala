object Grains{
  def square(sq:Int):Option[BigInt]=sq match {
    case sq if(sq<=0 || sq>64) => None
    case _ => Some(List.fill(sq-1)(BigInt(2)).foldLeft(BigInt(1))(_*_))
  }

  def total():BigInt=Some(List.range(1,65).map(x => square(x).get).sum).get
}