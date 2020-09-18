object Puzzle6 {
  // Q1
  def applyNMulti[T](n: Int)(arg: T, f: T => T): T =
    (1 to n).foldLeft(arg) {(acc, _) => f(acc) }

  def applyNCurrried[T](n: Int)(arg: T)(f: T => T): T =
    (1 to n).foldLeft(arg) { (acc, _) => f(acc) }

  def nextInt(n: Int): Int = n * n + 1

  def nextNumber[N](n: N)(implicit numericOps: Numeric[N]): N =
    numericOps.plus(numericOps.times(n, n), numericOps.one)
}
