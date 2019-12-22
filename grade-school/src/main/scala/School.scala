import scala.collection.immutable.{ListMap, SortedMap}

class School {
  type DB = Map[Int, Seq[String]]
  var db = SortedMap[Int, Seq[String]]().withDefaultValue(Seq())
  def grade=db


  def add(name: String, grade: Int) = db += grade -> (db(grade) :+ name)

  def sorted = db.mapValues(_.sorted)

}
