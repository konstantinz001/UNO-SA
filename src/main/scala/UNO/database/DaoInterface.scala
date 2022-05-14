package UNO.database
import scala.concurrent.Future
import UnoPlayer.playerBaseImp.Player
import UnoCards.cardBaseImp.Card
import UnoGameState.GameState


trait DaoInterface  {
  def load(gameid:String):GameState
  def save(playerNames: List[String],value1: List[String], color1:List[String],
           value2: List[String], color2:List[String], valueStack: List[String], colorStack: List[String]): Unit
  def save(gameState: GameState):Unit

}