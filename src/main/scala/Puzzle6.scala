object Puzzle6 {
  // Q1
  def applyNMulti[T](n: Int)(arg: T, f: T => T): T =
    (1 to n).foldLeft(arg) { (acc, _) => f(acc) }

  def applyNCurrried[T](n: Int)(arg: T)(f: T => T): T =
    (1 to n).foldLeft(arg) { (acc, _) => f(acc) }

  def nextInt(n: Int): Int = n * n + 1

  def nextNumber[N](n: N)(implicit numericOps: Numeric[N]): N =
    numericOps.plus(numericOps.times(n, n), numericOps.one)
  /**
   * scala> println(Puzzle6.applyNMulti(3)(2, Puzzle6.nextInt))
   * 677
   *
   * scala> println(Puzzle6.applyNCurrried(3)(2)(Puzzle6.nextInt))
   * 677
   *
   * scala> println(Puzzle6.applyNMulti(3)(2.0, Puzzle6.nextInt))
   * error: type mismatch;
   * found   : Int => Int
   * required: AnyVal => AnyVal
   *
   * scala> println(Puzzle6.applyNCurrried(3)(2.0)(Puzzle6.nextNumber))
   * 677.0
   *
   **/
}
