object PhoneNumber{
  def clean(num:String):Option[String]=num.filter(_.isDigit) match {
    case x if(x.length<=9) => None
    case x if((x.takeRight(10)(0)=='0' || x.takeRight(10)(3)=='0' || x.takeRight(10)(0)=='1' || x.takeRight(10)(3)=='1')) => None
    case x if(x.length==11 && x(0)!='1' ) => None
    case x  => Some(x.takeRight(10))
  }
}