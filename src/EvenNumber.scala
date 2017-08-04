import scala.collection.mutable.ArrayBuffer

//constructing a function to test for even numbers from imperative to functional using filter
class EvenNumber {
  val n = 1 :: 2 :: 3 :: 4 :: Nil

  def getEvenNumber(l: List[Int]): List[Int] = {
    val tmpArray = ArrayBuffer[Int]()
    for (e <- l) {
      if (e % 2 == 0) tmpArray += e
    }
    tmpArray.toList
  }

  val evenNumbersList = getEvenNumber(n)

  //using filter
  val filteredEvens = n.filter(_ % 2 == 0)
}
