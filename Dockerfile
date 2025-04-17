FROM eclipse-temurin:21-jdk-alpine

WORKDIR /app

COPY target/cicdtest.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]