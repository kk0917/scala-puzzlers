object Puzzle3 {

  trait A {
    val audience: String
    println("Hello, " + audience)
  }

  class BMember(a: String = "World") extends A {
    val audience: String = a
    println("I repeat: Hello, " + audience)
  }

  class BConstructor(val audience: String = "World") extends A {
    println("I repeat: Hello, " + audience)
  }

  new BMember("Readers")
  /**
   * scala> new BMember("Readers")
   * Hello, null
   * I repeat: Hello, Readers
   * res5: BMember = BMember@3cc9632d
   */

  new BConstructor("Readers")
  /**
   * scala> new BConstructor("Readers")
   * Hello, Readers
   * I repeat: Hello, Readers
   * res7: BConstructor = BConstructor@21a5b599
   */

  class BEarlyDef(a: String = "World") extends {
    val audience = a
  } with  A {
    println("I repeat: Hello, " + audience)
  }
  new BEarlyDef("Readers")
  /**
   * scala> new BEarlyDef("Readers")
   * Hello, Readers
   * I repeat: Hello, Readers
   * res8: BEarlyDef = BEarlyDef@40b70f31
   */

  /**
   * scala> new {
   * | val audience = "Readers"
   * |} with A {
   * | println("I repeat: Hello, " + audience)
   * |}
   * Hello, Readers
   * I repeat: Hello, Readers
   * res9: A = $anon$1@4dffa400
   **/

  trait AfterA {
    val introduction: String
    println(introduction)
  }

  class BEvery(val audience: String) extends {
    val introduction = { println("Evaluating early def"); "Are you there?" }
  } with A with AfterA {
    println("I repeat: Hello, " + audience)
  }
  new BEvery({ println("Evaluationg param"); "Readers" })
  /**
   * scala> new BEvery({ println("Evaluationg param"); "Readers" })
   * Evaluationg param
   * Evaluating early def
   * Hello, Readers
   * Are you there?
   * I repeat: Hello, Readers
   * res11: BEvery = BEvery@7dda5b25
   */

}
