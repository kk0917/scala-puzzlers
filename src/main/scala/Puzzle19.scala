// What's in a Name
object Puzzle19 {
  def inEcosystem(predator: String, prey: String): Unit = {
    println(s"${predator} eat ${prey}")
    /**
     * > inEcosystem("cats", "mice")
     * cats eat cats
     */
  }

  def inEcosystem2(prey: String, predator: String): Unit = {
    println(s"${predator} eat ${predator}")
  }

  def mkSeq(end: Int, start: Int = 1, step: Int = 1): Unit = {
    println("")
  }

  class SimpleAdder {
    def add(x: Int = 1, y: Int = 2): Int = x + y
  }

  class AdderWithBonus extends SimpleAdder {
    override def add(y: Int = 3, x: Int = 4): Int =
      super.add(x, y) + 10
  }

  val adder: SimpleAdder = new AdderWithBonus
  adder add (y = 0)
  /**
   * > adder add(y = 0)
   * val res0: Int = 13
   */
  adder add 0
  /**
   * > adder add 0
   * val res1: Int = 14
   */

  val adder2 = new AdderWithBonus
  /**
   * > adder2 add(y = 0)
   * val res0: Int = 14
   *
   * > adder2 add 0
   * * val res0: Int = 14
   */

  /** Summery
   *
   * 1. If you could, should not change the parameters order
   *      when overriding methods
   * 2. should remember "name is at compile time, value is at runtime",
   *      when using named arguments and default arguments.
   */
}
