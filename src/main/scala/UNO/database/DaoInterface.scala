package UNO.database
import scala.concurrent.Future
import UnoPlayer.playerBaseImp.Player
import UnoCards.cardBaseImp.Card
import UnoGameState.GameState


trait DaoInterface  {
  def load(gameid:String):GameState
  def save(gameid: String, player: String, value: List[String], color:List[String]):Unit
  def save(gameState: GameState):Unit

}