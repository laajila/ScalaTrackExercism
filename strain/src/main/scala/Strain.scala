object Strain {
  def keep[A](l: Seq[A], f: A => Boolean): Seq[A] = {
    l.filter(f(_))
  }
  def discard[A](l: Seq[A], f: A => Boolean): Seq[A] = {
    l.filter(!f(_))
  }
}