object RnaTranscription{
  def nucleotideDnaToRna(c: Char):Char= c match {
  case 'G' => 'C'
  case 'C' => 'G'
  case 'T' => 'A'
  case 'A' => 'U'
  }
  def toRna(dna:String):Option[String]=Some(dna.map(nucleotideDnaToRna))
}