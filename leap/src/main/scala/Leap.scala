object Leap {
  def leapYear(year: Int): Boolean = year match {
    case _ if(year%4==0 && year%100!=0) => true
    case _ if(year%4==0 && year%100==0 && year%400==0) => true
    case _ => false
  }
}
