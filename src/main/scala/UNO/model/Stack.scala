package UNO.model

object Stack{
  val initialize: List[Card] = {
    //Card yellow = new Card(1,"yellow")
    val green = List.fill(5)(new Card(5,"green"))
    val yellow = List.fill(5)(new Card(5,"yellow"))
    val blue = List.fill(5)(new Card(5,"blue"))
    val red = List.fill(5)(new Card(5,"red"))

    green ::: yellow ::: blue ::: red
  }

  def shuffleCards(a:List[Card]): List[Card] = {
    Random.shuffle(a);
  }


}
