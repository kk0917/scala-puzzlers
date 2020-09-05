object Puzzle2 {
  // hit variable on REPL
  var MONTH = 12; var DAY = 24 // Successed output
  var (HOUR, MINUTE, SECOND) = (12, 0, 0) //compile error

  // hit REPL
  /**
   * scala> def checkGuess(guess: Int) = guess match {
   *   case TheAnswer => "Your guess is correct"
   *   case _ => "Try again"
   * }
   * checkGuess: (guess: Int): String
   *
   * scala> checkGuess(21)
   * res1: String = Try again
   *
   * scala> checkGuess(42)
   * res2: String = Your guess is correct
   */

  /**
   * scala> var (hour, minute, second) = (12, 0, 0)
   * hour: Int = 12
   * minute: Int = 0
   * second: Int = 0
   */ 

  /**
   * val HOUR = 12; val MINUTE, SECOND = 0;
   * scala> var (HOUR, MINUTE, SECOND) = (12, 0, 0)
   * val HOUR = 13; val MINUTE
   */
}
