FROM openjdk:17-alpine

WORKDIR /app

COPY target/* .

ENTRYPOINT ["java", "-jar", "java_web_final_project-0.0.1-SNAPSHOT.jar"]