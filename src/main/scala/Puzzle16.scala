object Puzzle16 {

  def regular(x: Int, y: Int, z: Int): Int = x + y + z // 6
  def curried(x: Int)(y: Int)(z: Int): Int = x + y + z // 6

  def invert(v3: Int)(v2: Int = 2, v1: Int = 1) = {
    println(v1 + ", " + v2 + ", " + v3)
  }

  val invert3 = invert(3) _

  invert3(v1 = 2)
  /**
   * > invert3(v3 = 2)
   * error: not enough arguments for method apply: (v1: Int, v2: Int): Unit in trait Function2.
   * Unspecified value parameter v2.
   **/

  invert3(v1 = 2, v2 = 1)
  /**
   * > invert3(v1 = 2, v2 = 1)
   * 1, 2, 3 // Be outputted line up as defined in the definition ordering.
   */

  // To be continued...
}
