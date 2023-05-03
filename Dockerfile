FROM openjdk:17

ARG PATH=build/libs/spring_docker_template-0.0.1-SNAPSHOT.jar

COPY ${PATH} app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]