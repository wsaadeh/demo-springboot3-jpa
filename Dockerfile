FROM openjdk:17-jdk-alpine

WORKDIR /app

COPY target/springdemo-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

# Add this line before the CMD instruction
COPY src/main/resources/application-prod.properties /app/config/
ENV SPRING_CONFIG_LOCATION=classpath:/,file:/app/config/

CMD [ "java","-jar","app.jar" ]