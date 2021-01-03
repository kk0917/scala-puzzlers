object Puzzle14 {
  def sumItUp: Int = {
    def one(x: Int): Int = { return x; 1 } // By Scala, the codes after return keyword is not evaluate.

    val two = (x: Int) => { return x; 2 } // this 2 also is not ecaluate.
    /**
     * This return is valid as sumItUp method of the enclosing method,
     *   not two of enclosing block.
     * Executing sumItUp method is end here. one method is ignored.
     * If converting this two val to a method definition, it works as expected.
     *   ex. def two(x: Int): Int { ... }
     */

    1 + one(2) + two(3) // Not Execute
  }

  // println(sumItUp) // 3

  def fibonacci(n: Int): Int = {
    if (n < 2) return n
    fibonacci(n - 1) + fibonacci(n - 2)
  }
  // this method can rewrite not using return keyword like following,
  def reFibonacci(n: Int): Int =
    if (n < 2) n
    else fibonacci(n - 1) + fibonacci(n - 2)

  def findHotCurrency[A](
    currencies: Seq[A],
    threshold: (Double, Double) => Boolean): Option[A] = {

    for (currency <- currencies) {
      val oldRate = getCurrentRate(currency)
      val newRate = fetchRate(currency)

      if (threshold(oldRate, newRate)) Some(currency)
    }

    None
  }

  def getCurrentRate(a: Double): Int = { 999 }
  def fetchRate(a: Double): Int = { 999 }

  /** Summery
   * If could, you shouldn't use explicit return.
   * If you need to use explicit return, you should confirm to be return the intended place.
   * You should warn that Return Phrase returns from method or local func, but not from the func definited into them.
   */
}
