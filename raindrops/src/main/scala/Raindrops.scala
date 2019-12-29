object Raindrops {
  def convert(n: Int,raindrop:String=""): String = n match {
    case _ if(n%3==0 && !raindrop.contains("Pling")) => convert(n/3,raindrop+"Pling")
    case _ if(n%5==0 && !raindrop.contains("Plang")) => convert(n/5,raindrop+"Plang")
    case _ if(n%7==0 &&  !raindrop.contains("Plong")) => convert(n/7,raindrop+"Plong")
    case _ if(raindrop=="") => n.toString
    case _ => raindrop

  }
}

