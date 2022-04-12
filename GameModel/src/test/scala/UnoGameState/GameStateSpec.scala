package UnoGameState

import UnoCards.cardBaseImp.Card
import UnoPlayer.playerBaseImp.Player
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class GameStateSpec extends AnyWordSpec with Matchers {

  var playStack2: List[Card] = List(Card("","blue"))
  var playerList: List[Player] = List(Player("Testy",List(Card("","red"))))
  var gameState: GameState = new GameState(playerList, playStack2)

  "A GameState" when {
    "have a method getplayerList" in {
      gameState.playerList should be(List(Player("Testy", List(Card("", "red")))))
    }
    "have a method getstackCard" in {
      gameState.getstackCard() should be(gameState.getstackCard())
    }
  }
}