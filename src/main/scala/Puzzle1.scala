object Puzzle1 {
  def greet1(): Unit = {
    val list: List[Int] = List(1, 2)
    list.map { i => println("hi"); i + 1; }
    println(list)
  }

  def greet2(): Unit = {
    val list: List[Int] = List(2, 3)
    list.map { println("Hi"); _ + 1  }
    println(list)
  }
}
