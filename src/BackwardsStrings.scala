class BackwardsStrings{

  val names: List[String] = "Hal" :: "Pecorino" :: "Burl" :: "Stnait" :: Nil

  def stringToLowerCase(s: String): String = s.toLowerCase

  val namesAllLowerCase = names.map(stringToLowerCase)

  def reverseItemsInList(ls: List[String]): List[String] = ls.map(_ reverse)

  println(reverseItemsInList(namesAllLowerCase))

}



