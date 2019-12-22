object Hamming {
  def distance(dna1:String,dna2:String):Option[Int]=dna1.length match {
    case l if(l==dna2.length) => {
      var hammingDistance=Some(0)
      (dna1,dna2).zipped.foreach((a,b)=>if(!a.equals(b)) hammingDistance=Some(hammingDistance.get+1))
      hammingDistance
    }
    case _ => None

  }
}