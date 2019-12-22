

import scala.collection.SortedMap

object Etl {


  def transform(oldSys: Map[Int, Seq[String]]): Map[String, Int] = {
    var new2Sys=Map[String, Int]()
    oldSys.flatMap(
      (t:(Int,Seq[String]))=> {
        t._2.map(
          (a:String) => (a.toLowerCase -> t._1)
        )
      })

  }

  def transform2(old: Map[Int,Seq[String]]): Map[String,Int] =
    old.flatMap{  t:(Int,Seq[String]) => t._2 map (_.toLowerCase -> t._1) }
}