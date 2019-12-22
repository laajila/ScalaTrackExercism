

import scala.collection.SortedMap

object Etl {


  def transform(oldSys: Map[Int, Seq[String]]): Map[String, Int] = {
    var new2Sys=Map[String, Int]()
    oldSys.foreach(
      (t:(Int,Seq[String]))=> {
        t._2.foreach(
          (a:String) =>  new2Sys=new2Sys+(a.toLowerCase -> t._1)
        )
      })
    new2Sys
  }
}