object Puzzle17 {
//  def add(x: Int)(y: Int): Int = x + y

//  def addto2: Int => Int = add(2)
  /**
   * > Puzzle17.addto2(3)
   * val res0: Int = 5
   */

//  implicit val z1: Int = 2
//  def add(x: Int)(y: Int)(implicit z: Int): Int = x + y + z
//  def addTo(n: Int): Int => Int = add(n)
//
//  implicit val z2: Int = 3
//  val addTo1: Int => Int = addTo(1)

  /**
   * > addTo1(2)
   * res0: Int = 5
   *
   * > addTo1(2)(3)
   *            ^
   * error: Int does not take parameters
   **/

  /** Anonymous Function and implicit parameters
   *
   */
  def iNeedAnImplicit(implicit n: Int): Int = n + 1
  /**
   * > val anonFunc = { x: Int => y: Int => x + y + Puzzle17.iNeedAnImplicit }
   *                                                         ^
   * error: could not find implicit value for parameter n: Int
   */

  val anonFuncWithImplicitParam = { x: Int => implicit y: Int => x + y + Puzzle17.iNeedAnImplicit }

  implicit val z = 2
  /**
   * > val anonFuncWithImplicitParam = { x: Int => implicit y: Int => x + y + Puzzle17.iNeedAnImplicit }
   * val anonFuncWithImplicitParam: Int => (Int => Int) = "< function1 >"
   *
   * > anonFuncWithImplicitParam(1)(2)
   * val res0: Int = 6
   *
   * // compiler doesn't supply the implicit parameters
   * > anonFuncWithImplicitParam(1)
   * val res1: Int => Int = < function2>
   */

}
