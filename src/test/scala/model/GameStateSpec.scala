package model

import UNO.model.GameState
import UNO.model.PlayerComponent.playerBaseImp.Player
import UNO.model.cardComponent.cardBaseImp.Card
import org.scalatest.{Matchers, WordSpec}

class GameStateSpec extends WordSpec with Matchers {

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