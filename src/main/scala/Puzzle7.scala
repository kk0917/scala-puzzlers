import scala.collection.mutable

object Puzzle7 {
  val accessors1: mutable.Buffer[() => Int] = mutable.Buffer.empty[() => Int]
  val accessors2: mutable.Buffer[() => Int] = mutable.Buffer.empty[() => Int]

  val data: Seq[Int] = Seq(100, 110, 120)
  var j    = 0
  for (i <- 0 until data.length) {
    accessors1 += (() => data(j))
    accessors2 += (() => data(j))
    j += 1
  }
  /**
   * scala> Puzzle7.accessors1.foreach(a1 => println(a1()))
   * 100
   * 110
   * 120
   *
   * scala> Puzzle7.accessors2.foreach(a2 => println(a2()))
   * Puzzle7.accessors2.foreach(a2 => println(a2()))java.lang.IndexOutOfBoundsException: 3
   * at scala.collection.LinearSeqOps.apply(LinearSeq.scala:116)
   * ...
   */

  /**
   * var j is mutable, and so its variable change value
   * def fun(): Function0 = {
   *   val i: Int = 1
   *   var j: runtime.IntRef = new runtime.IntRef(2)
   *   {
   *     (new anonymous class anonfunfun(Illustration.this, i, j): Function0)
   *   }
   * }
   */
  /**
   * if you should use variables, it assign var to val
   * ...
   * for (i <- 0 until data.length) {
   *   val currentJ = j
   *   accessors2 += (() => data(currentJ))
   *   j += 1
   * }
   * ...
   *
   * scala> Puzzle7.accessors2.foreach(a2 => println(a2()))
   * 100
   * 110
   * 120
   */
}
