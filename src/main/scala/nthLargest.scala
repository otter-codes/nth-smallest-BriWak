class NumberNotPossibleException extends Exception

object nthLargest {

  def apply(input: List[Int], nth: Int): Any = {

    val uniqueNums = input.distinct.sorted

    if (nth <= uniqueNums.length) {
      uniqueNums(uniqueNums.length - nth)
    } else {
      throw new NumberNotPossibleException
    }
  }
}