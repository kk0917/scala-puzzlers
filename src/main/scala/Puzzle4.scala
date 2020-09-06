object Puzzle4 {

}

trait A {
  val foo: Int
  val bar = 10
  println("In A: foo: " + foo + ", bar: " + bar)
}

class B extends A {
  val foo: Int = 25
  println("IN B: foo: " + foo + ", bar: " + bar)
}

class C extends B {
  override val bar = 99
  println("In C: " + foo + ", bar: " + bar)
}

new C()
/**
 * scala> new C()
 * In A: foo: 0, bar: 0
 * IN B: foo: 25, bar: 0
 * In C: 25, bar: 99
 * res12: C = C@33ed6546
 */

/**
 * ❯ scala -Xcheckinit
 *
 * scala> new C()
 * scala.UninitializedFieldError: Uninitialized field: <console>: 2
 * at B.foo(<console>:2)
 * at A.$init$(<console>:4)
 * ... 30 elided
 */

trait newA {
  val foo: Int
  def bar: Int = 10
  println("In newA: foo: " + foo + ", bar: " + bar)
}

class newB extends newA {
  val foo: Int = 25
  println("IN newB: foo: " + foo + ", bar: " + bar)
}

class newC extends newB {
  override def bar: Int = 99
  println("In newC: foo: " + foo + ", bar: " + bar)
}
/**
 * scala> new newC()
 * In newA: foo: 0, bar: 99
 * IN newB: foo: 25, bar: 99
 * In newC: foo: 25, bar: 99
 * res0: newC = newC@2c2a027c
 */
