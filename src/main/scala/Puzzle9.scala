object Puzzle9 {

}

object XY {
  object X {
    val value: Int = Y.value + 1
  }

  object Y {
    val value: Int = X.value + 1
  }
}

// scala> println(if (math.random() > 0.5) XY.X.value else XY.Y.value)
// 2
//
// scala > println(s"X: ${XY.X.value} Y: ${XY.Y.value}")
//
// X: 1 Y: 2
