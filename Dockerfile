FROM openjdk:11-jre-slim
ADD target/*.jar app.jar
ENTRYPOINT [ "sh", "-c", "java -jar /app.jar" ]
EXPOSE 8080