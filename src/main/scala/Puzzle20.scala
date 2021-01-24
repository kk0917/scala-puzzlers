object Puzzle20 {
  def traceIt[T <: Iterator[_]](it: T): T = {
    println(s"TRACE: using iterator '${it}'")
    it
  }

  val msg = "I love Scala"
  println("First match index: " + traceIt("a".r.findAllIn(msg)).start)
  println("First match index: " + "a".r.findAllIn(msg).start)

  /** Summery
   *
   * When you use Regex type, you should findAllMatchIn method than findAllIn
   *   or convert MatchIterator of that returns findAllIn by usingMatchIterator matchData Iterator[Match]
   */
}
