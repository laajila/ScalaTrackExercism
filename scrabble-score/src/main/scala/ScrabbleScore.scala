object ScrabbleScore {
  /*
  A, E, I, O, U, L, N, R, S, T       1
D, G                               2
B, C, M, P                         3
F, H, V, W, Y                      4
K                                  5
J, X                               8
Q, Z                               10*/
  val letterScores = Map("AEIOULNRST" -> 1)

  def scoreChar(c: Char): Int = c.toUpper match {
    case 'A' | 'E' | 'I' | 'O' | 'U' | 'L' | 'N' | 'R' | 'S' | 'T' => 1
    case 'D' | 'G' => 2
    case 'B' | 'C' | 'M' | 'P' => 3
    case 'F' | 'H' | 'V' | 'W' | 'Y' => 4
    case 'K' => 5
    case 'J' | 'X' => 8
    case 'Q' | 'Z' => 10
  }

  def score(word: String): Int = {
    word.map(scoreChar).sum
  }
}