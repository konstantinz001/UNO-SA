FROM mongo:latest
EXPOSE 27017
ENV MONGO_INITDB_DATABASE: unodb
ENV MONGO_INITDB_ROOT_USERNAME: uno
ENV MONGO_INITDB_ROOT_PASSWORD: uno123

ENV TZ=Europe/Berlin

RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && \
	echo $TZ > /etc/timezone