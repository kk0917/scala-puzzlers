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

  def sumSizesToSeq(collections: Iterable[Iterable[_]]): Int =
    collections.toSeq.map(_.size).sum
  /**
   * scala> Puzzle5.sumSizesToSeq(List(Set(1, 2), List(3, 4)))
   * res7: Int = 4
   *
   * scala> Puzzle5.sumSizesToSeq(List(List(1, 2), Set(3, 4)))
   * res9: Int = 4
   */

  def sumSizesFold(collections: Iterable[Iterable[_]]): Int =
//    collections.foldLeft(0) { (sumOfSizes, collection) => sumOfSizes + collection.size }
    collections.foldLeft(0) (_ + _.size)
    /**
     * 1. sumOfSizes = 畳み込み計算の途中結果。デフォルトは0
     * 2. collection = 次に計算する要素(ex. Seq(1,2,3) -> Seq(0)から)
     */
  /**
   * scala> Puzzle5.sumSizesFold(List(Set(1, 2), List(3, 4)))
   * res0: Int = 4
   *
   * scala> Puzzle5.sumSizesFold(List(List(1, 2), Set(3, 4)))
   * res1: Int = 4
   */
}
