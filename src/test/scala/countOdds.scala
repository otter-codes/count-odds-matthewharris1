import org.scalatest.{MustMatchers, WordSpec}

class countOddsSpec extends WordSpec with MustMatchers {

  "countOdds" should {

    "When given 5 return 1 and 3" in {
    countOdds.returnOdds(5) mustEqual List(1, 3)
    }
  }
}
