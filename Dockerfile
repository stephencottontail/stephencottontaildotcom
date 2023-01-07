FROM openjdk:8-alpine

COPY target/uberjar/personal-site-2023.jar /personal-site-2023/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/personal-site-2023/app.jar"]
