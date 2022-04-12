package model

import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers
import UNO.model.GameState
import UnoPlayer.playerBaseImp.Player
import UnoCards.cardBaseImp.Card

class GameStateSpec extends AnyWordSpec with Matchers {

  var playStack2: List[Card] = List(Card("","blue"))
  var playerList: List[Player] = List(Player("Testy",List(Card("","red"))))
  var gameState: GameState = new GameState(playerList, playStack2)

  "A GameState" when {
    "have a method getplayerList" in {
      gameState.getplayerList() should be(List(Player("Testy", List(Card("", "red")))))
    }
    "have a method getstackCard" in {
      gameState.getstackCard() should be(gameState.getstackCard())
    }
    "have a method getplayStack" in {
      gameState.getplayStack() should be(List(Card("", "blue")))
    }
  }
}