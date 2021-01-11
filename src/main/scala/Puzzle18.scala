object Puzzle18 {
  def foo(n: Int, a: Any): Unit = {
    println(s"n: ${n}, a: ${a}")} // expect=n: 1, a: 2

  object A {
    def foo(n: Int, a: Any): Unit = println((s"a: ${n}, n: ${a}"))
    def foo(a: Any, n: Int): Unit = println((s"a: ${a}, n: ${n}"))
  }
  /**
   * > Puzzle18.A.foo(1, 2)
   * Puzzle18.A.foo(1, 2)
   *            ^
   * error: ambiguous reference to overloaded definition,
   * both method foo in object A of type (a: Any, n: Int): Unit
   * and  method foo in object A of type (n: Int, a: Any): Unit
   * match argument types (Int,Int)
   **/

  object Oh {
    def overloadA(u: Unit)             = "I accept a Unit"
    def overloadA(u: Unit, n: Nothing) = "I accept a Unit and Nothing"
    def overloadB(u: Unit)             = "I accept a Uni"
    def overloadB(n: Nothing)          = "I accept Nothing"
  }
  /**
   * > println(Oh overloadA 99)
   *                        ^
   * warning: a pure expression does nothing in statement position
   * I accept a Unit
   *
   * > println(Oh overloadB 99)
   *           ^
   * error: overloaded method overloadB with alternatives:
   * (n: Nothing)String <and>
   * (u: Unit)String
   * cannot be applied to (Int)
   **/

  def read(fileName: String): Array[Byte] = "..."
  def read(file: java.io.File): Array[Byte] = "..."

  def read(magnet: ReadMagnet): magnet.Result = magnet.read
}
