class NumberNotPossibleException extends Exception

object nthLargest extends App {

  def apply(input: List[Int], nth : Int) : Any = {
    val uniqueNums = input.distinct
      uniqueNums(uniqueNums.length - nth)
  }
  
}