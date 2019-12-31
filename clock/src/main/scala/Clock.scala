case class Clock(hours: Int, minutes: Int) {
  def totalMunites = (hours % 24) * 60 + minutes

  def hm = totalMunites match {
    case a if (a < 0 && totalMunites % 60 != 0) => (23 + (a / 60) % 24, 60 + totalMunites % 60)
    case a if (a < 0) => (24 + (a / 60), 0)
    case c => ((c / 60) % 24, c % 60)
  }

  override def equals(that: Any): Boolean = that match {
    case c: Clock => c.hm._1 == this.hm._1 && c.hm._2 == this.hm._2
    case _ => false
  }

  def equalsByAttributes(obj: Any): Boolean = this.equals(obj)

  def ==(that: Clock): Boolean = {
    that.hm._1 == this.hm._1 && that.hm._2 == this.hm._2
  }

  def +(that: Clock): Clock = {
    val h = this.hm._1 + that.hm._1
    val m = that.hm._2 + this.hm._2
    Clock(h, m)
  }

  def -(that: Clock): Clock = {
    val h = this.hm._1 - that.hm._1
    val m = this.hm._2 - that.hm._2
    Clock(h, m)
  }
}

object Clock {
  def apply(minutes: Int): Clock = this (0, minutes)
}