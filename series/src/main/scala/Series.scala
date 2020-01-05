object Series {

  def slices(size: Int, numString: String): List[Any] = {
    numString.sliding(size,1).toList.map(_.toCharArray.map(_.asDigit).toList)
  }


}