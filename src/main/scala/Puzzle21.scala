object Puzzle21 {
  implicit class Padder(val sb: StringBuilder) extends AnyVal {
    def pad2(width: Int): StringBuilder = {
      1 to width - sb.length foreach { sb +=  '*'  }
      sb
    }

    def eqPad2(width: Int): StringBuilder = {
      val appendedSb = sb += '*'
      1 to width - sb.length foreach appendedSb.apply
      sb
    }

    def refactorPad2(width: Int): StringBuilder = {
      1 to width - sb.length foreach { _ => sb += '*' }
      /**
       * if using for brace like this, be expanded to the above code
       *   -> for (_ <- 1 to width = sb.length) { sb += '*' }
       */

      sb
    }
  }

  val greeting = new StringBuilder("Hello, kitteh!")
  println(greeting pad2 20)
  // Hello, kitteh!*

  val farewell = new StringBuilder("U go now.")
  println(farewell pad2 20)
  // java.lang.StringIndexOutOfBoundsException: ...

  println(new StringBuilder("Hello, kitteh!").padTo(20,'*').mkString)
  // Hello, kitteh!******

  println(new StringBuilder("U go now.").padTo(20, '*').mkString)
  // U go now.***********

  /** Summery
   * You Should notice when passing an expression that returns a function.
   *   As a more general lesson,
   *     let's check whether if there is the appropriate method into Scala's library
   *       before writing your unique utilitiy or not.
   */
}
