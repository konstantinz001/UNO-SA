package UnoFileIO.database.mongoDB

import UnoFileIO.database.DaoInterface
import org.mongodb.scala.model.Filters.equal
import org.mongodb.scala.{Document, MongoClient, MongoCollection, MongoDatabase}
import org.mongodb.scala.*
import org.mongodb.scala.bson.BsonDocument
import org.mongodb.scala.result.InsertOneResult
import play.api.libs.json.{JsArray, JsString, JsValue, Json}

import akka.actor.typed.ActorSystem
import akka.actor.typed.scaladsl.Behaviors
import scala.concurrent.{Await, ExecutionContextExecutor, Future}

import scala.concurrent.duration.Duration

class DaoMongoDB extends DaoInterface{
  implicit val system: ActorSystem[Nothing] = ActorSystem(Behaviors.empty, "SingleRequest")
  implicit val executionContext: ExecutionContextExecutor = system.executionContext

  val uri: String = "mongodb+srv://uno:uno123@unodb.f3zdh.mongodb.net/unodb?retryWrites=true&w=majority"
  System.setProperty("org.mongodb.async.type", "netty")
  val client: MongoClient = MongoClient(uri)
  val db: MongoDatabase = client.getDatabase("unodb")
  val collection: MongoCollection[Document] = db.getCollection("uno")

  override def load(gameid:String): Future[String] = {
    val collection = db.getCollection("uno")
    val result = Await.result(collection.find().first().head(), Duration.Inf)
    Future(result.toJson)
  }

  override def save(game: String) : Unit =
    val doc = Document(BsonDocument.apply(game))
    collection.countDocuments().subscribe(new Observer[Long] {
      override def onSubscribe(subscription: Subscription): Unit = subscription.request(1)
      override def onNext(result: Long): Unit = documentFound(doc)
      override def onError(e: Throwable): Unit = ???
      override def onComplete(): Unit = ???
    })

  def documentFound(doc: Document) = {
    collection.deleteMany(Document.empty).subscribe(new Observer[Any] {
      override def onSubscribe(subscription: Subscription): Unit = subscription.request(1)
      override def onNext(result: Any): Unit = ???
      override def onError(e: Throwable): Unit = ???
      override def onComplete(): Unit = ???
    })
    collection
      .insertOne(doc)
      .subscribe(new Observer[Any] {
        override def onSubscribe(subscription: Subscription): Unit = subscription.request(1)
        override def onNext(result: Any): Unit = ???
        override def onError(e: Throwable): Unit = ???
        override def onComplete(): Unit = ???
      })
  }
}



