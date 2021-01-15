FROM hseeberger/scala-sbt
WORKDIR /UNO
ADD . /UNO
CMD sbt test
