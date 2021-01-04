object Puzzle15 {
  var x = 0

  def counter(): Int = { x += 1; x }
  def add(a: Int)(b: Int): Int = a + b

  val adder1: Int => Int = add(counter())(_) // adder1: Int => Int = <function>
  val adder2: Int => Int = add(counter())    // adder2: Int => Int = <function>

  println("x = " + x) // x = 1
  println(adder1(10)) // 12
  println("x = " + x) // x = 2
  println(adder2(10)) // 11
  println("x = " + x) // x = 2

  // TODO: I've not understand this puzzle..
  /** Summery
   * ...
   */
}
