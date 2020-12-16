object Puzzle13 {
  val s1: String = s1
  val s2: String = s2 + s2

  println(s1.length) // null of AnyRef's default, so this output is NullPointerException.
  println(s2.length) // Both are null, but s2 is "nullnull" of String Type by using + operator.

  /** Summary
   * 
   * Never define self-reference value!!!
   */
}
