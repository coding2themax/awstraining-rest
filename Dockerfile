FROM openjdk:21-ea-jdk
VOLUME /tmp
COPY target/spring-sample-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
