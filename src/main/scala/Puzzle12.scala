object Puzzle12 {
  case class RomanNumeral(symbol: String, value: Int)

  implicit object RomanOrdering extends Ordering[RomanNumeral] {
    def compare(a: RomanNumeral, b: RomanNumeral): Int = a.value compare b.value
  }

  import collection.immutable.SortedSet

  val numerals: SortedSet[RomanNumeral] =
    SortedSet(
      RomanNumeral("M", 1000),
      RomanNumeral("C", 100),
      RomanNumeral("X", 10),
      RomanNumeral("I", 1),
      RomanNumeral("D", 500),
      RomanNumeral("L", 50),
      RomanNumeral("V", 5))

  println("Roman numeral symbols for 1 5 10 50 100 500 1000:")

  for (num <- numerals; sym = num.symbol) { print(s"${sym}") } // IVXLCDM

  println("")

  numerals map { _.symbol } foreach { sym => print(s"${sym}") } // CDILMVX

  println("")

  // Consideration
  for (num <- numerals) print(s"${num.symbol}")

  println("")

  numerals foreach { num => print(s"${num.symbol}") }

  println("")

  // You can use Collection's View as more general purpose alternative
  numerals.view map { _.symbol } foreach { sym => print(s"${sym}") }

  println("")

  /**
   * Most simple alternative is
   *   to use the Collection type that doesn't change by converting like Seq type
   */
  numerals.toSeq map { _.symbol } foreach { sym => print(s"${sym}") }

  println("")

  /** Summary
   * Be careful not to be taken over the source collection's order automatically
   *   when the converting execute on Collection type, especially when let several operations chained.
   */
}
