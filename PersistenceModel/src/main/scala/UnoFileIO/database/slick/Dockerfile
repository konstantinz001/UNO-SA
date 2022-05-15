FROM mysql:5.7
EXPOSE 3306

ENV MYSQL_ROOT_PASSWORD=uno123
ENV MYSQL_DATABASE=unodb
ENV MYSQL_USER=uno
ENV MYSQL_PASSWORD=uno123

ENV TZ=Europe/Berlin

RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && \
	echo $TZ > /etc/timezone