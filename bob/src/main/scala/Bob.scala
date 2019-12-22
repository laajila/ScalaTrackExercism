object Bob {


  def response(statement: String): String = statement match {
    case _ if (statement.trim.endsWith("?")
      && statement.toUpperCase.equals(statement)
      && statement.dropRight(1).exists(_.isLetter)) => "Calm down, I know what I'm doing!"
    case _ if (statement.trim.endsWith("?")) => "Sure."
    case _ if (statement.trim.isEmpty) => "Fine. Be that way!"
    case _ if (statement.toUpperCase.equals(statement)
      && statement.replaceAll(",", "")
      .exists(_.isLetter)) => "Whoa, chill out!"
    case _ => "Whatever."

  }
}
