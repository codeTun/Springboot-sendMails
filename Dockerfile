FROM openjdk:17-jdk-alpine3.13

COPY target/*.jar mail-service.jar

EXPOSE 8085

ENTRYPOINT ["java", "-jar", "mail-service.jar"]