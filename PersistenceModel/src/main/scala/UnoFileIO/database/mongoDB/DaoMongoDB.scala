package UnoFileIO.database.mongoDB

import UnoFileIO.database.DaoInterface
import org.mongodb.scala.model.Filters.equal
import org.mongodb.scala.{Document, MongoClient, MongoCollection, MongoDatabase}
import org.mongodb.scala.*
import org.mongodb.scala.bson.BsonDocument
import org.mongodb.scala.result.InsertOneResult
import play.api.libs.json.{JsArray, JsString, JsValue, Json}

import scala.concurrent.{Await, Future}
import scala.concurrent.duration.Duration

class DaoMongoDB extends DaoInterface{


  val uri: String = "mongodb+srv://uno:uno123@unodb.f3zdh.mongodb.net/unodb?retryWrites=true&w=majority"
  System.setProperty("org.mongodb.async.type", "netty")
  val client: MongoClient = MongoClient(uri)
  val db: MongoDatabase = client.getDatabase("unodb")
  val collection: MongoCollection[Document] = db.getCollection("uno")

  override def load(gameid:String): String = {
    val result = Await.result(collection.find().first().head(), Duration.Inf)
    result.toJson
  }

  override def save(game: String) : Unit =
    val doc = Document(BsonDocument.apply(game))
    collection.deleteMany(Document.empty)
    collection.insertOne(doc)
}


