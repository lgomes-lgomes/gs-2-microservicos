
FROM openjdk:17
COPY target/gs-0.0.1-SNAPSHOT.jar gs-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/gs-0.0.1-SNAPSHOT.jar"]

EXPOSE 8080
