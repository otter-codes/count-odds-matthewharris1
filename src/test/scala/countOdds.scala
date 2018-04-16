import org.scalatest.{MustMatchers, WordSpec}

class countOddsSpec extends WordSpec with MustMatchers {

  "countOdds" should {

    "When given 5 return the number of odd numbers below it" in {
    countOdds.returnOdds(5) mustEqual 2
    }
    "When given 7 return the number of odd numbers below it" in {
      countOdds.returnOdds(7) mustEqual 3
    }
    "When given 10 return the number of odd numbers below it" in {
      countOdds.returnOdds(10) mustEqual 5
    }
  }
}
