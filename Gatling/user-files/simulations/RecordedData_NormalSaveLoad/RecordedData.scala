
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class RecordedData extends Simulation {

  private val httpProtocol = http
    .baseUrl("http://kubernetes.docker.internal:8081")
    .inferHtmlResources(AllowList(), DenyList())
    .acceptHeader("*/*")
    .acceptEncodingHeader("gzip, deflate")
    .userAgentHeader("PostmanRuntime/7.29.0")
  
  private val headers_0 = Map(
  		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
  		"Accept-Language" -> "de,de-DE;q=0.9,en;q=0.8,en-GB;q=0.7,en-US;q=0.6",
  		"Cache-Control" -> "max-age=0",
  		"Proxy-Connection" -> "keep-alive",
  		"Upgrade-Insecure-Requests" -> "1",
  		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/101.0.4951.54 Safari/537.36 Edg/101.0.1210.39"
  )
  
  private val headers_1 = Map(
  		"Accept-Encoding" -> "gzip, deflate, br",
  		"Cache-Control" -> "no-cache",
  		"Content-Type" -> "application/json",
  		"Postman-Token" -> "07f3f37e-aaa9-4fac-ac25-4605f449dd64"
  )

	private val spikeTest = scenario("SPIKE - Simulation")
		.exec(
			http("load")
				.get("/load")
				.headers(headers_0)
		)
		.pause(3)
		.exec(
			http("save")
				.post("/save")
				.headers(headers_1)
				.body(RawFileBody("recordeddata/0001_request.txt"))
		)

	private val enduranceTest = scenario("ENDURANCE - Simulation")
		.exec(
			http("load")
				.get("/load")
				.headers(headers_0)
		)
		.pause(3)
		.exec(
			http("save")
				.post("/save")
				.headers(headers_1)
				.body(RawFileBody("recordeddata/0001_request.txt"))
		)

	private val stressTest = scenario("STRESS - Simulation")
		.exec(
			http("load")
				.get("/load")
				.headers(headers_0)
		)
		.pause(3)
		.exec(
			http("save")
				.post("/save")
				.headers(headers_1)
				.body(RawFileBody("recordeddata/0001_request.txt"))
		)

	private val loadTest = scenario("LOAD - Simulation")
		.exec(
			http("load")
				.get("/load")
				.headers(headers_0)
		)
		.pause(3)
		.exec(
			http("save")
				.post("/save")
				.headers(headers_1)
				.body(RawFileBody("recordeddata/0001_request.txt"))
		)

	private val volumeTest = scenario("VOLUME - Simulation")
		.exec(
			http("load")
				.get("/load")
				.headers(headers_0)
		)
		.pause(3)
		.exec(
			http("save")
				.post("/save")
				.headers(headers_1)
				.body(RawFileBody("recordeddata/0001_request.txt"))
		)


	setUp(
		spikeTest.inject(nothingFor(5.seconds), atOnceUsers(1000))
		.andThen(
			enduranceTest.inject(constantUsersPerSec(10).during(5.minute))
			.andThen(
				stressTest.inject(rampUsersPerSec(1).to(500).during(1.minutes))
				.andThen(
					loadTest.inject(atOnceUsers(2))
					.andThen(
						volumeTest.inject(atOnceUsers(1000)))))))
						.protocols(httpProtocol)
}
