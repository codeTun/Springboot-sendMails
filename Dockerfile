FROM openjdk:17-jdk-alpine3.13

COPY target/*.jar mail-service.jar

EXPOSE 8085

ENV MAIL_HOST=smtp.gmail.com
ENV MAIL_PORT=587
ENV MAIL_USERNAME=iheblazhary@gmail.com
ENV MAIL_PASSWORD=dtpwjacvgseytoek

ENTRYPOINT ["java", "-jar", "mail-service.jar"]

# Build the image
# docker run -e MAIL_HOST=smtp.gmail.com -e MAIL_PORT=587 -e MAIL_USERNAME=iheblazhary@gmail.com -e MAIL_PASSWORD=dtpwjacvgseytoek -p 8085:8085 -d your_image