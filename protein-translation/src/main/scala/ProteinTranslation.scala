object ProteinTranslation {
  def proteins(rna: String): List[String] = rna.sliding(3,3).toStream
    .takeWhile(x => x != "UAA" && x != "UAG" && x != "UGA").map(rnaToProtein).toList

  def rnaToProtein(codon: String): String = codon match {
    case "AUG" => "Methionine"
    case "UUU" | "UUC" => "Phenylalanine"
    case "UUA" | "UUG" => "Leucine"
    case "UCU" | "UCC" | "UCA" | "UCG" => "Serine"
    case "UAU" | "UAC" => "Tyrosine"
    case "UGU" | "UGC" => "Cysteine"
    case "UGG" => "Tryptophan"
  }
}