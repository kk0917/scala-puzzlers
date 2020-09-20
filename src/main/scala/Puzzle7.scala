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
}
/**
 * scala>
 */
