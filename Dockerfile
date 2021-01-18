FROM hseeberger/scala-sbt:graalvm-ce-20.0.0-java11_1.4.3_2.13.3
WORKDIR /UNO
ADD . /UNO
CMD sbt test
