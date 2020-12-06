object Puzzle10 {
  class Country(val isoCode: String, val name: String)
  case class CountryCC(isoCode: String, name: String)

  val homeOfScala   = new Country("CH", "Switzerland")
  val homeOfScalaCC = CountryCC("CH", "Switzerland")
  /**
   * > println(Puzzle10.homeOfScala equals new Country("CH", "Switzerland"))
   * false
   *
   * > println(Puzzle10.homeOfScalaCC equals CountryCC("CH", "Switzerland"))
   * false // expected true...
   */
}