case class Card(number:Int, Color:String) {}

object cards{
  val red1 = new Card(1,"red")
  val blue1 = new Card(1,"blue")
  val yellow1 = new Card(1,"yellow")
  val green1 = new Card(1,"green")
  val red2 = new Card(2,"red")
  val blue2 = new Card(2,"blue")
  val yellow2 = new Card(2,"yellow")
  val green2 = new Card(2,"green")
  val red3 = new Card(3,"red")
  val blue3 = new Card(3,"blue")
  val yellow3 = new Card(3,"yellow")
  val green3 = new Card(3,"green")

  var staplecontent : List[Card] = List(red1,blue1,yellow1,green1,red2,blue2,yellow2,green2,red2,blue2,yellow2,green2)
  val rand = scala.util.Random
  val hand1 = new Array[Card](7)
  var karte = staplecontent(rand.nextInt(112))

  def rando(): Card = staplecontent(rand.nextInt(112))

}

def functionToAdd(a:Int, b:Int) : Int =  a + b

functionToAdd(17,4)
println("Sum is: " + functionToAdd(5,3));

val a = 10.toDouble