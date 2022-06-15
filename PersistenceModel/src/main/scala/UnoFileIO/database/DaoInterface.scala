package UnoFileIO.database

import UnoCards.cardBaseImp.Card
import UnoGameState.GameState
import UnoPlayer.playerBaseImp.Player

import scala.concurrent.Future


trait DaoInterface  {
  def load(gameid:String): Future[String]
  def save(game: String): Unit

}