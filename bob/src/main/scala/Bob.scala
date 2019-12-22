

object Bob {


  def response(statement: String): String = statement match {
    case _ if (statement.endsWith("?") && statement.toUpperCase.equals(statement) && (statement.dropRight(1).forall(!_.isDigit))) => "Calm down, I know what I'm doing!"
    case _ if (statement.contains("?")) => "Sure."
    case _ if (statement.trim.isEmpty) => "Fine. Be that way!"
    case _ if (statement.toUpperCase.equals(statement)) => "Whoa, chill out!"
    case _ => "Whatever."

  }
}
