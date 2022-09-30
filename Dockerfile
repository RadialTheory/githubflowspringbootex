FROM openjdk:17.0.2-jdk
COPY docker/entrypoint.sh .
COPY build/libs/*-SNAPSHOT.jar app.jar
ENTRYPOINT ["entrypoint.sh"]