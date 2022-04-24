package UNO.controller.controllerComponent

import akka.actor.typed.ActorSystem
import akka.actor.typed.scaladsl.Behaviors
import akka.http.scaladsl.Http
import akka.http.scaladsl.model.{ContentTypes, HttpEntity, HttpMethods, HttpRequest}
import akka.http.scaladsl.server.Directives.*
import UNO.controller.controllerComponent.controllerInterface
import UNO.UnoGame.tui
import UNO.aview.gui.SwingGui
import UNO.controller.controllerComponent.controllerBaseImp._

import scala.concurrent.{ExecutionContextExecutor, Future}
import scala.swing.Reactor

class RootService (Controller: controllerInterface) extends Reactor {
  listenTo(Controller)

  implicit val system: ActorSystem[Nothing] = ActorSystem(Behaviors.empty, "my-system")
  implicit val executionContext: ExecutionContextExecutor = system.executionContext

  val rootPort = 8080
  val rootUri = "root-service"

  def server(): Future[Http.ServerBinding] = {
    val route =
      concat(
        path("tui") {
          get {
            complete(HttpEntity(ContentTypes.`application/json`, Controller.gameToJson()))
          }
        },
        path("tui" / "newGame") {
          get {
            Controller.setDefault()
            complete(HttpEntity(ContentTypes.`application/json`, Controller.gameToJson()))
          }
        },
        get {
          path("tui" / "load") {
            Controller.load
            complete(HttpEntity(ContentTypes.`application/json`, Controller.gameToJson()))
          }
        },
        get {
          path("tui" / "save") {
            Controller.save
            complete(HttpEntity(ContentTypes.`application/json`, Controller.gameToJson()))
          }
        },
        get {
          path("tui" / "redo") {
            Controller.redoGet
            complete(HttpEntity(ContentTypes.`application/json`, Controller.gameToJson()))
          }
        },
        get {
          path("tui" / "undo") {
            Controller.undoGet
            complete(HttpEntity(ContentTypes.`application/json`, Controller.gameToJson()))
          }
        },
        get {
          pathPrefix("tui" / "set") {
            concat(
              pathEnd {
                complete("/set")
              },
              path (akka.http.scaladsl.server.PathMatchers.Segment) { handIndex =>
                Controller.removeCard(handIndex.toInt)
                complete(HttpEntity(ContentTypes.`application/json`, Controller.gameToJson()))
              }
            )
          }
        },
        get {
          pathPrefix("tui" / "setUno") {
            concat(
              pathEnd {
                complete("/setUno")
              },
              path (akka.http.scaladsl.server.PathMatchers.Segment) { handIndex =>
                Controller.removeUnoCard(handIndex.toInt)
                complete(HttpEntity(ContentTypes.`application/json`, Controller.gameToJson()))
              }
            )
          }
        },
        get {
          pathPrefix("tui" / "setcolor") {
            concat(
              pathEnd {
                complete("/setcolor")
              },
              parameters("handIndex", "color") { (handIndex, color) =>
                Controller.removeBlackCard(s"${handIndex}".toInt, s"$color")
                complete(HttpEntity(ContentTypes.`application/json`, Controller.gameToJson()))
              }
              //http://localhost:7070/tui/setcolor/?handIndex=1&color=green
            )
          }
        },
        get {
          path("tui" / "get") {
            Controller.getCard()
            complete(HttpEntity(ContentTypes.`application/json`, Controller.gameToJson()))
          }
        },
      )
    Http().newServerAt(rootUri, rootPort).bind(route)
  }

  reactions += {
    case event: updateStates => print(GameStatus.handleStatus(Controller.gameStatus, Controller))
    case event: welcomeStates => print(GameStatus.handleStatus(Controller.gameStatus, Controller))
    case event: endStates => print(GameStatus.handleStatus(Controller.gameStatus, Controller))
    case event: failureStates => print(GameStatus.handleStatus(Controller.gameStatus, Controller))
    case event: saveStates => print(GameStatus.handleStatus(Controller.gameStatus, Controller))
    case event: loadStates => print(GameStatus.handleStatus(Controller.gameStatus, Controller))
    case event: undoStates => print(GameStatus.handleStatus(Controller.gameStatus, Controller))
    case event: redoStates => print(GameStatus.handleStatus(Controller.gameStatus, Controller))
    case event: newgameStates => print(GameStatus.handleStatus(Controller.gameStatus, Controller))
  }

  def stop(server: Future[Http.ServerBinding]): Unit = {
    server
      .flatMap(_.unbind()).onComplete(_ => println(rootPort + " released"))
  }
}