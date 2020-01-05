case class WordCount(text: String) {
  def countWords = text.toLowerCase.trim
    .replaceAll("[&@$%^&:,.!?\\-\"]", " ").split("\\s+")
    .groupBy(x => deleteTwoQuetes(x)).map(x => (x._1 -> x._2.length))

  def deleteTwoQuetes(s: String): String = s.count(_ == (''')) match {
    case 1 => s
    case _ => s.replaceAll("'", "")
  }
}