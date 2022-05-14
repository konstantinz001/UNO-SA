
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class RecordedDataMongoDbSTRESS extends Simulation {

  private val httpProtocol = http
    .baseUrl("http://kubernetes.docker.internal:8080")
    .inferHtmlResources(AllowList(), DenyList())
    .acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9")
    .acceptEncodingHeader("gzip, deflate")
    .acceptLanguageHeader("de,de-DE;q=0.9,en;q=0.8,en-GB;q=0.7,en-US;q=0.6")
    .upgradeInsecureRequestsHeader("1")
    .userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/101.0.4951.64 Safari/537.36 Edg/101.0.1210.47")
  
  private val headers_0 = Map("Proxy-Connection" -> "keep-alive")


  private val loadandsaveData = scenario("Load and Save Data")
    .exec(
      http("load")
        .get("/tui/loadDB")
        .headers(headers_0)
    )
    .pause(2)
    .exec(
      http("save")
        .get("/tui/saveDB")
        .headers(headers_0)
    )

  setUp(loadandsaveData.inject(nothingFor(5.seconds), atOnceUsers(1000))).protocols(httpProtocol)
}
