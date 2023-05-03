FROM openjdk:17

ARG PATH=build/libs/spring_docker_template-0.0.1-SNAPSHOT.jar

COPY ${PATH} app.jar

ENV app.home.title="my value from docker file"

EXPOSE 8080 8087

ENTRYPOINT ["java", "-jar","-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:8087", "app.jar"]