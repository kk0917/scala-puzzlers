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
    def overloadB(u: Unit)             = "I accept a Unit"
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
   * (n: Nothing)String < and >
   * (u: Unit)String
   * cannot be applied to (Int)
   **/

  def read(fileName: String): Array[Byte] = Array(-128)
  def read(file: java.io.File): Array[Byte] = Array(127)

  trait ReadMagnet {
    type Result
    def read(): Result
  }

  object MagnetPattern {
    def read(magnet: ReadMagnet): magnet.Result = magnet.read

    trait ReadMagnet {
      type Result
      def read(): Result
    }
    // case that arguments is String
    object ReadMagnet {
      implicit def fromString(fileName: String) =
        new ReadMagnet {
          type Result = String
          def read(): Result = { "aaa" }}

      implicit def fromFile(file: java.io.File) =
        new ReadMagnet {
          type Result = Array[Byte]
          def read(): Result = { Array("bbb".toByte) }}
    }

    import ReadMagnet._

    val s: String      = read("test.txt")
    val b: Array[Byte] = read(new java.io.File("test.txt"))
  }

  object Oh2 {
    def nonOverloadedA(f: () => Any) = "I accept a no-arg function"
    def overloadedA(f: () => Any)    = "I accept a no-arg function"
    def overloadedA(n: Nothing)      = "I accept Nothing"
  }

  def emptyParamList() = 99

  /** Summery
   *
   * 1. Be careful type conversion to be insert dependenting  of the expected type.
   *      Converting their types may not be applied adding the overload the version's method called
   * 2. If define the overload method having had arguments of same numbers with existing it,
   *      even though the argument type of new method,
   *      Be careful to that the compile
   */
}
