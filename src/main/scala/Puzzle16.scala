object Puzzle16 {

//  def regular(x: Int, y: Int, z: Int): Int = x + y + z // 6
//  def curried(x: Int)(y: Int)(z: Int): Int = x + y + z // 6
//
//  def invert(v3: Int)(v2: Int = 2, v1: Int = 1): Unit = {
//    println(v1 + ", " + v2 + ", " + v3)
//  }
//
//  val invert3: (Int, Int) => Unit = invert(3) _
//
//  invert3(v1 = 2)
  /**
   * > invert3(v1 = 2)
   * error: not enough arguments for method apply: (v1: Int, v2: Int): Unit in trait Function2.
   * Unspecified value parameter v2.
   **/

//  invert3(v1 = 2, v2 = 1)
  /**
   * > invert3(v1 = 2, v2 = 1)
   * 1, 2, 3 // Be outputted line up as defined in the definition ordering.
   */

//  def foldLeft[B](z: B)(op: (B, A) => B): B
  /**
   * > Seq("I", "II", "III").foldLeft(0)(_ + _.length)
   * res0: Int = 6
   */

  /** Summery
   * Remember that the named arguments are resolved by generated function object,
   *   not by source method when calling part-applied functions.
   *
   * Be able to avoid this problem by using arguments name used at Scala's function trait.
   */
}
