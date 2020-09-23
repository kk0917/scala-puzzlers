object Puzzle8 {
  val xs: Seq[Seq[String]] = Seq(Seq("a", "b", "c"), Seq("d", "e", "f"), Seq("g", "h"), Seq("i", "J", "k"))
  val ys: Seq[String] = for (Seq(x, y, z) <- xs) yield x + y + z
  val zs: Seq[Unit] = xs map {
  case Seq( x, y, z)  =>  x + y + z }
  /*
   * scala> val xs: Seq[Seq[String]] = Seq(Seq("a", "b", "c"), Seq("d", "e", "f"), Seq("g", "h"), Seq("i", "J", "k"))
   * val ys: Seq[String] = for (Seq(x, y, z) <- xs) yield x + y + z
   * val zs: Seq[Unit] = xs map { case Seq( x, y, z)  =>  x + y + z }
   *
   * val xs: Seq[Seq[String]] = List(List(a, b, c), List(d, e, f), List(g, h), List(i, J, k))
   * val ys: Seq[String] = for (Seq(x, y, z) <- xs)val ys: Seq[String] = List(abc, def, iJk)
   * val zs: Seq[Unit] = xs map { case Seq( x, y, z)  =>  x + y + z }
   *
   * scala.MatchError: List(g, h) (of class scala.collection.immutable.$colon$colon)
   * at $anonfun$zs$1(<console>:1)
   *   at $anonfun$zs$1$adapted(<console>:1)
   *     at scala.collection.immutable.List.map(List.scala:250)
   *     at scala.collection.immutable.List.map(List.scala:79)
   *     ... 32 elided
   */
}