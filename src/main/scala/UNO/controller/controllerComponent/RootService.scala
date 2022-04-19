package UNO.controller.controllerComponent

import akka.actor.typed.ActorSystem
import akka.actor.typed.scaladsl.Behaviors
import akka.http.scaladsl.Http
import akka.http.scaladsl.model.{ContentTypes, HttpEntity, HttpMethods, HttpRequest}
import akka.http.scaladsl.server.Directives.*
import UNO.UnoGame.Controller
import UNO.UnoGame.tui
import UNO.aview.gui.SwingGui
import UNO.controller.controllerComponent.controllerBaseImp.updateStates
import UNO.util.{State, gameStatsEvent}
import UNO.controller.controllerComponent.GameStatus.SAVED

import scala.concurrent.{ExecutionContextExecutor, Future}
import scala.swing.Reactor

object RootService extends Reactor {
  listenTo(Controller)

  implicit val system: ActorSystem[Nothing] = ActorSystem(Behaviors.empty, "my-system")
  implicit val executionContext: ExecutionContextExecutor = system.executionContext

  val port = 7070

  def server(): Future[Http.ServerBinding] = {
    val route =
      concat(
        path("tui") {
          get {
            complete(HttpEntity(ContentTypes.`application/json`, Controller.gameToJson()))
            //complete(HttpEntity(ContentTypes.`text/html(UTF-8)`, GameStatus.getMessage(SAVED)))
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
            tui.processInputLine("load")
            //Controller.load
            complete(HttpEntity(ContentTypes.`application/json`, Controller.gameToJson()))
          }
        },
        get {
          path("tui" / "save") {
            tui.processInputLine("save")
            //Controller.save
            complete(HttpEntity(ContentTypes.`application/json`, Controller.gameToJson()))
            //complete(HttpEntity(ContentTypes.`text/html(UTF-8)`, Controller.gameStatus.toString()))
          }
        },
        get {
          path("tui" / "redo") {
            tui.processInputLine("redo")
            //Controller.redoGet
            complete(HttpEntity(ContentTypes.`application/json`, Controller.gameToJson()))
          }
        },
        get {
          path("tui" / "undo") {
            tui.processInputLine("undo")
            //Controller.undoGet
            complete(HttpEntity(ContentTypes.`application/json`, Controller.gameToJson()))
          }
        },
        get {
          pathPrefix("tui" / "set") {
            concat(
              pathEnd {
                complete("/set")
              },
              //akka.http.scaladsl.server.PathMatchers
              path (akka.http.scaladsl.server.PathMatchers.Segment) { handIndex =>
                tui.processInputLine("r " + handIndex)
                //Controller.removeCard(handIndex)
                complete(HttpEntity(ContentTypes.`application/json`, Controller.gameToJson()))
              }
            )
          }
        },
        get {
          path("tui" / "get") {
            tui.processInputLine("s")
            //Controller.getCard()
            complete(HttpEntity(ContentTypes.`application/json`, Controller.gameToJson()))
          }
        },
      )
    Http().newServerAt("localhost", port).bind(route)
  }

  reactions += {
    case event: updateStates => print(State.handle(gameStatsEvent()))
  }

  def stop(server: Future[Http.ServerBinding]): Unit = {
    server
      .flatMap(_.unbind()).onComplete(_ => println(port + " released"))
  }
}