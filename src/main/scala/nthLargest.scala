class NumberNotPossibleException extends Exception

object nthLargest {

  def apply(input: List[Int], nth: Int): Any = {

    val uniqueNums = input.distinct.sorted

    if (nth <= uniqueNums.length && nth > 0) {
      uniqueNums(uniqueNums.length - nth)
    } else {
      throw new NumberNotPossibleException
    }
  }
}