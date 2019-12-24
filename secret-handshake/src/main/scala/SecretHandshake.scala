import scala.util.{Success, Try}

object SecretHandshake {

  def toBinaryRversed(x: Int, binaryString: StringBuilder = new StringBuilder("")): String = x match {
    case 0 => binaryString.toString()
    case _ => toBinaryRversed(x / 2, binaryString.append(x % 2))
  }

  def commands(x: Int): List[String] = {
    var result: List[String] = List()
    val binaryString = toBinaryRversed(x)

    if (Try(binaryString.charAt(0)) == Success('1')) result = result :+ "wink"
    if (Try(binaryString.charAt(1)) == Success('1')) result = result :+ "double blink"
    if (Try(binaryString.charAt(2)) == Success('1')) result = result :+ "close your eyes"
    if (Try(binaryString.charAt(3)) == Success('1')) result = result :+ "jump"
    if (Try(binaryString.charAt(4)) == Success('1')) result = result.reverse
    result
  }


}