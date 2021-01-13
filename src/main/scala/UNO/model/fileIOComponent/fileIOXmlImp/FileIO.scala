package UNO.model.fileIOComponent.fileIOXmlImp

import UNO.UnoGameModule
import UNO.model.GameState
import UNO.model.PlayerComponent.PlayerInterface
import UNO.model.PlayerComponent.playerBaseImp.Player
import UNO.model.cardComponent.CardInterface
import UNO.model.fileIOComponent.FileIOTrait
import UNO.model.stackComponent.stackBaseImp.Stack
import com.google.inject.Guice

import java.io.{File, PrintWriter}
import scala.xml.{Elem, Node, NodeSeq, PrettyPrinter}

class FileIO extends FileIOTrait{
  override def load: Unit = {
    /*val file = scala.xml.XML.loadFile("gamestate.xml")
    val playerList = (file \\ "gamestate" \ "playerList").text.trim
    val stackCard = (file \\ "gamestate" \ "stackCard").text.trim
    val playStack2 = (file \\ "gamestate" \ "playStack2").text.trim
    val gameState = GameState(playerList,stackCard,playStack2)




*/


  }

  override def save(gameState: GameState): Unit = {
    val pw = new PrintWriter(new File("gamestate.xml"))
    val prettyPrinter = new PrettyPrinter(120,4)
    val xml = prettyPrinter.format(gameStateToXml(gameState))
    pw.write(xml)
    pw.close()
  }

  def gameStateToXml(gameState: GameState): Elem = {
    <gamestate>

      <playerList>
        {gameState.getplayerList.toString}
      </playerList>

      <stackCard>
        {gameState.getstackCard.toString}
      </stackCard>

      <playStack2>
        {gameState.getplayStack.toString}
      </playStack2>

    </gamestate>

  }
}
