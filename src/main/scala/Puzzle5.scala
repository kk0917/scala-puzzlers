object Puzzle5 {
  def Main: Int = {
    999
  }

  def sumSizes(collections: Iterable[Iterable[_]]): Int =
    collections.map(_.size).sum
  /**
   * scala> Puzzle5.sumSizes(List(Set(1, 2), List(3, 4)))
   * res3: Int = 4
   *
   * scala> Puzzle5.sumSizes(Set(List(1, 2), Set(3, 4)))
   * res4: Int = 2
   */
}
