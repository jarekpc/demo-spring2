FROM openjdk:9-jdk-slim
COPY target/*.jar /opt/

EXPOSE 8080
CMD java -jar /opt/*.jar

#VOLUME /tmp
#ARG JAR_FILE
#ADD ${JAR_FILE} app.jar
