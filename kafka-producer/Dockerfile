FROM openjdk:11-slim

WORKDIR /tmp/service/

EXPOSE 8080

ADD target/*.jar service.jar

CMD java -jar service.jar