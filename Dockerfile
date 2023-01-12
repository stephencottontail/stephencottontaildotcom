FROM openjdk:8-alpine

COPY target/uberjar/stephencottontaildotcom.jar /stephencottontaildotcom/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/stephencottontaildotcom/app.jar"]
