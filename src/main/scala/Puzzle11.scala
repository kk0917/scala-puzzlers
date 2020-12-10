/**
 * lazy val doesn't only initialize by first access,
 *   it initialize again when exceptions are thrown in the middle of initialization.
 *
 * So, Scala initialize processing every time it access until initialization success.
 *   this is an effective choice to the lazy initialization of resource.
 */
object Puzzle11 {
  var x = 0

  lazy val y: Int = 1 / x

  try {
    println(y)
  } catch {
    case _: Exception =>
      x = 1
      println(y)
  }
}
