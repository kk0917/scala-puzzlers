object Puzzle17 {
//  def add(x: Int)(y: Int): Int = x + y

//  def addto2: Int => Int = add(2)
  /**
   * > Puzzle17.addto2(3)
   * val res0: Int = 5
   */

  implicit val z1: Int = 2
  def add(x: Int)(y: Int)(implicit z: Int): Int = x + y + z
  def addTo(n: Int): Int => Int = add(n)

  implicit val z2: Int = 3
  val addTo1: Int => Int = addTo(1)

  /**
   * > addTo1(2)
   * res0: Int = 5
   *
   * > addTo1(2)(3)
   *            ^
   * error: Int does not take parameters
   **/
}
