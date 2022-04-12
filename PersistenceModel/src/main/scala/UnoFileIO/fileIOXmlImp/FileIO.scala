package UnoFileIO.fileIOXmlImp

import UnoGameState.GameState
import UnoPlayer.playerBaseImp.Player
import UnoCards.cardBaseImp.Card
import UnoFileIO.FileIOTrait

import java.io.{File, PrintWriter}
import scala.xml.{Elem, PrettyPrinter}
import scala.util.{Failure, Success, Try}

class FileIO extends FileIOTrait:

  override def load:Try[Option[(List[Player],List[Card])]]=
    var matchFieldOption: Option[(List[Player],List[Card])] = None
    Try{
      val file = scala.xml.XML.loadFile("gamestate.xml")
      matchFieldOption = Some((List[Player](),List[Card]()))
      matchFieldOption match {
        case Some((playList,playStack2))=>
          var newplaylist = playList
          var newplaystack2 = playStack2
          newplaylist = setPlayerList(file)
          newplaystack2= setPlayStack(file)
          matchFieldOption = Some((newplaylist,newplaystack2))
        case None=>
      }
      matchFieldOption
    }

  override def save(gameState: GameState): Unit =
    val pw = new PrintWriter(new File("gamestate.xml"))
    val prettyPrinter = new PrettyPrinter(200,4)
    val xml = prettyPrinter.format(gameStateToXml(gameState))
    pw.write(xml)
    pw.close()


  def setPlayerList (file: Elem) : List[Player] =
    val playerName = List((file \\ "gamestate" \ "playerName2").text, (file \\ "gamestate" \ "playerName1").text)
    val playerValue1 = (file \\ "gamestate" \ "playerCardValue1").text.split(" ").map(_.trim).toList.reverse.init
    val playerValue2 = (file \\ "gamestate" \ "playerCardValue2").text.split(" ").map(_.trim).toList.reverse.init
    val playerColor1 = (file \\ "gamestate" \ "playerCardColor1").text.split(" ").map(_.trim).toList.reverse.init
    val playerColor2 = (file \\ "gamestate" \ "playerCardColor2").text.split(" ").map(_.trim).toList.reverse.init
    var cards1 = List(Card(playerValue1(0), playerColor1(0)))
    for(i <- (1 to playerValue1.size - 1))
      cards1 = Card(playerValue1(i), playerColor1(i)) :: cards1
    var cards2 = List(Card(playerValue2(0), playerColor2(0)))
    for(i <- (1 to playerValue2.size - 1))
      cards2 = Card(playerValue2(i), playerColor2(i)) :: cards2
    List(Player(playerName(1), cards1), Player(playerName(0), cards2))

  def setPlayStack (file: Elem) : List[Card] =
    List(Card((file \\ "gamestate" \ "playStack" \ "playStackValue").text.trim,
      (file \\ "gamestate" \ "playStack" \ "playStackColor").text.trim))


  def gameStateToXml(gameState: GameState): Elem =
    <gamestate>
      {player1Name(gameState)}
      {player2Name(gameState)}
      {player1CardValue(gameState)}
      {player1CardColor(gameState)}
      {player2CardValue(gameState)}
      {player2CardColor(gameState)}
      {playerStack(gameState)}
    </gamestate>

  //PlayerList
  def player1Name (gameState: GameState): Elem =
    <playerName1>
      { gameState.playerList(0).name}
    </playerName1>

  def player1CardValue (gameState: GameState): Elem =
    <playerCardValue1>
      {gameState.playerList(0).playerCards.map(x => x.value + " ")}
    </playerCardValue1>

  def player1CardColor (gameState: GameState): Elem =
    <playerCardColor1>
      {gameState.playerList(0).playerCards.map(x => x.color + " ")}
    </playerCardColor1>

  def player2Name (gameState: GameState): Elem =
    <playerName2>
      {gameState.playerList(1).name}
    </playerName2>

  def player2CardValue (gameState: GameState): Elem =
    <playerCardValue2>
      {gameState.playerList(1).playerCards.map(x => x.value + " ")}
    </playerCardValue2>

  def player2CardColor (gameState: GameState): Elem =
    <playerCardColor2>
      {gameState.playerList(1).playerCards.map(x => x.color + " ")}
    </playerCardColor2>

  def playerStack (gameState: GameState): Elem =
    <playStack>
      <playStackColor>
        {gameState.playStack(0).color}
      </playStackColor>
      <playStackValue>
        {gameState.playStack(0).value}
      </playStackValue>
    </playStack>

