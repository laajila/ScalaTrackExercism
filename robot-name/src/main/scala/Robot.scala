class Robot {
  private var nameRobot = generatedname()

  RobotRegistry.listOfnames+= name
  println(RobotRegistry.listOfnames)

  def name(): String = this.nameRobot


  private def generatedname(name: String = ""): String = name match {
    case _ if (RobotRegistry.listOfnames.contains(name) || name == "") =>
      generatedname(util.Random.alphanumeric.filter(_.isLetter).take(2).mkString.toUpperCase + util.Random.alphanumeric.filter(_.isDigit).take(3).mkString)
    case _ => name
  }

  def reset() = {
    val oldName=this.nameRobot
    this.nameRobot = generatedname()
    RobotRegistry.listOfnames=RobotRegistry.listOfnames.filter(_!=oldName)
    println(RobotRegistry.listOfnames)
  }

}