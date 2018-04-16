import Math._

object countOdds {

  def returnOdds(input: Int): Int = {
    val list = 0 until input
    val filteredList = list.count(x => x % 2 != 0)
    filteredList
  }
}
