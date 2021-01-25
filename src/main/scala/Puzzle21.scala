object Puzzle21 {
  implicit class Padder(val sb: StringBuilder) extends AnyVal {
    def pad2(width: Int): StringBuilder = {
      1 to width - sb.length foreach { sb +=  '*'  }
      sb
    }
  }

  val greeting = new StringBuilder("Hello, kitteh!")
  println(greeting pad2 20)

  val farewell = new StringBuilder("U go now.")
  println(farewell pad2 20)
}

class Adder(val sb: StringBuilder) {
  def add(width: Int): StringBuilder = {
    1 to width - sb.length foreach { sb +=  '*'  }
    sb
  }
}