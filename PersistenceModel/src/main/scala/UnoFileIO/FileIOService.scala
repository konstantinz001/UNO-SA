package UnoFileIO

import UnoFileIO.database.{DaoInterface, FileIODBProxy}
import UnoFileIO.fileIOJsonImp.FileIO
import akka.actor.typed.ActorSystem
import akka.actor.typed.scaladsl.Behaviors
import akka.http.scaladsl.Http
import akka.http.scaladsl.model.{ContentTypes, HttpEntity, StatusCodes}
import akka.http.scaladsl.server.Directives.{post, *}
import net.codingwell.scalaguice.InjectorExtensions.ScalaInjector
import com.google.inject.Guice

import scala.concurrent.Await
import scala.concurrent.duration.Duration

import scala.util.{Failure, Success}

case object FileIOService {

  def main(args: Array[String]): Unit = {

    val fileIO = new FileIO
    val db = new FileIODBProxy
    implicit val system = ActorSystem(Behaviors.empty, "my-system")
    implicit val executionContext = system.executionContext

    val fileIOPort = 8081
    val fileIOUri = "localhost"


    val route =
      concat (
        get {
          path("load") {
            complete(StatusCodes.Created, HttpEntity(ContentTypes.`application/json`, Await.result(fileIO.load, Duration.Inf)))
          }
        },
        get {
          path("loadDB") {
            complete(StatusCodes.Created, HttpEntity(ContentTypes.`application/json`, Await.result(db.load("1"), Duration.Inf)))
          }
        },
        post {
          path("save") {
            entity(as [String]) { game =>
              fileIO.save(game)
              complete(StatusCodes.Accepted,"game saved")
            }
          }
        },
        post {
          path("saveDB") {
            entity(as [String]) { game =>
              db.save(game)
              complete(StatusCodes.Accepted,"game saved")
            }
          }
        }
      )

    val bindingFuture = Http().newServerAt(fileIOUri, 8081).bind(route)

    bindingFuture.onComplete{
      case Success(binding) => {
        val address = binding.localAddress
        println(s"File IO Save: http://${address.getHostName}:${address.getPort}/${"save"}\n" +
          s"File IO Load: http://${address.getHostName}:${address.getPort}/${"load"} \n")
      }
      case Failure(exception) => {
        println("File IO REST service couldn't be started! Error: " + exception + "\n")
      }
    }


    def stop():Unit =
      bindingFuture
        .flatMap(_.unbind()) // trigger unbinding from the port
        .onComplete(_ => system.terminate()) // and shutdown when done
  }
}