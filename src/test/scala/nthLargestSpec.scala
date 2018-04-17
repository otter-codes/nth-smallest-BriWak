import org.scalatest._

class nthLargestSpec extends WordSpec with MustMatchers {

  "nthLargest" must {

    "return 1 when given List(1) and 1" in {
      nthLargest(List(1), 1) mustEqual 1
    }

    "return 2 when given List(1,2) and 1" in {
      nthLargest(List(1, 2), 1) mustEqual 2
    }

    "return 1 when given List(1,2) and 2" in {
      nthLargest(List(1, 2), 2) mustEqual 1
    }

    "return 4 when given List(1,2,3,4,5) and 2" in {
      nthLargest(List(1, 2, 3, 4, 5), 2) mustEqual 4
    }

    "return 2 when given List(1,1,2,2) and 1" in {
      nthLargest(List(1, 1, 2, 2), 1) mustEqual 2
    }
    "return 3 when given List(3,3,4,4,5,5) and 3" in {
      nthLargest(List(3, 3, 4, 4, 5, 5), 3) mustEqual 3
    }
  }
}
