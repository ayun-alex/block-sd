FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_EXPOSE=8082
EXPOSE $JAR_EXPOSE
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","-Duser.timezone=GMT+08","/app.jar"]