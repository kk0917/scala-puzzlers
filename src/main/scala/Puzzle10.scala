object Puzzle10 {

}

class Country(val isoCode: String, val name: String)
case class CountryCC(isoCode: String, name: String)

val homeOfScala   = new Country("CH", "Switzerland")
val homeOfScalaCC = CountryCC("CH", "switzer")