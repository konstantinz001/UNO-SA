var cardsstaple = 9
var player = 7

def drawcard(numberofcards:Int): Int = {
  player = player + numberofcards
return player}


def doublestaple() : Int = {
  if(cardsstaple < 10) {
    cardsstaple = cardsstaple * 2
  }
  return cardsstaple
}


println ("draw cards", drawcard(1))
println("new staple", doublestaple())

var i = 0
for (i <- 1 to 10)
  println(i)
