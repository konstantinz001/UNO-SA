package UNO.model

import scala.util.Random

object Stack{
  val initialize: List[Card] = {

    /*for(a <- 0 to 9) {
      List.fill(2)(new Card(number = a, "green"))
      List.fill(2)(new Card(number = a, "yellow"))
      List.fill(2)(new Card(number = a, "blue"))
      List.fill(2)(new Card(number = a, "red"))
    }*/

    val green = List.fill(2)(new Card(0,"green"))
    val green1 = List.fill(2)(new Card(1,"green"))
    val green2 = List.fill(2)(new Card(2,"green"))
    val green3 = List.fill(2)(new Card(3,"green"))
    val green4 = List.fill(2)(new Card(4,"green"))
    val green5 = List.fill(2)(new Card(5,"green"))

    val yellow = List.fill(2)(new Card(0,"yellow"))
    val yellow1 = List.fill(2)(new Card(1,"yellow"))
    val yellow2 = List.fill(2)(new Card(2,"yellow"))
    val yellow3 = List.fill(2)(new Card(3,"yellow"))
    val yellow4 = List.fill(2)(new Card(4,"yellow"))
    val yellow5 = List.fill(2)(new Card(5,"yellow"))

    val blue = List.fill(2)(new Card(0,"blue"))
    val blue1 = List.fill(2)(new Card(1,"blue"))
    val blue2 = List.fill(2)(new Card(2,"blue"))
    val blue3 = List.fill(2)(new Card(3,"blue"))
    val blue4 = List.fill(2)(new Card(4,"blue"))
    val blue5 = List.fill(2)(new Card(5,"blue"))

    val red = List.fill(2)(new Card(0,"red"))
    val red1 = List.fill(2)(new Card(1,"red"))
    val red2 = List.fill(2)(new Card(2,"red"))
    val red3 = List.fill(2)(new Card(3,"red"))
    val red4 = List.fill(2)(new Card(4,"red"))
    val red5 = List.fill(2)(new Card(5,"red"))



    green ::: green1 :::green2 :::green3 :::green4 ::: green5 ::: red ::: red1 ::: red2 ::: red3 ::: red4 ::: red5 ::: blue :::
      blue1   ::: blue2   ::: blue3   ::: blue4 ::: blue5::: yellow ::: yellow1 :::yellow2 :::yellow3 :::yellow4 ::: yellow5
  }

  def shuffleCards(a:List[Card]): List[Card] = {
    Random.shuffle(a);
  }


}
