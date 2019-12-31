object Isogram {
  def isIsogram(word: String): Boolean = {
    val wordWithoutPunc = word.toLowerCase.filter(_.isLetter)
    wordWithoutPunc.length == wordWithoutPunc.toSet.size
  }
}