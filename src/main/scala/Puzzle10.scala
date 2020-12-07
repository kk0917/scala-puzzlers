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

  trait TraceHashCode {
    override def hashCode(): Int = {
      println(s"TRACE: in hashCode for ${this}")
      super.hashCode()
    }
  }

  // Mix in the trait when instance gererates.
  case class Country2(isoCode: String)
  def newSwitzInst = new Country2("CH") with TraceHashCode

  // Mix in the trait when case class define.
  case class CountryWithTrace(isoCode: String) extends TraceHashCode
  def newSwitzDec1 = CountryWithTrace("CH")

  import collection.immutable.HashSet
  val countriesInst: HashSet[Country2 with TraceHashCode] = HashSet(newSwitzInst)

  def case1(): Unit = {
    println(countriesInst.iterator contains newSwitzInst)
    println(countriesInst contains newSwitzInst)
    /**
     * > case1()
     * true
     * TRACE: in hashCode for Country2(CH)
     * true
     */
  }

  val countriesDec1: HashSet[CountryWithTrace] = HashSet(newSwitzDec1)
  def case2(): Unit = {
    println(countriesDec1.iterator contains newSwitzDec1)
    println(countriesDec1 contains newSwitzDec1)
    /**
     * > case2()
     * TRACE: in hashCode for CountryWithTrace(CH)
     * true
     * TRACE: in hashCode for CountryWithTrace(CH)
     * false
     */
  }

  abstract case class Country3(isoCode: String)
  object  Country3 {
    def apply(isoCode: String): Country3 = new Country3(isoCode) with TraceHashCode
  }
  def newSwitzFact = Country3("CH")
}

/** Summary
 * 1. 2つのメソッドの片方だけをオーバーライドする場合、構造的等価性に従っていることを確認すること
 * 2. もし1でなければ両方のメソッドをequals/hashCodeの規則に従って実装すること
 */
