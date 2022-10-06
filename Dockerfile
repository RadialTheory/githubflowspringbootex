FROM eclipse-temurin:17-jre-alpine
COPY docker/entrypoint.sh .
COPY build/libs/*-SNAPSHOT.jar app.jar
ENTRYPOINT ["entrypoint.sh"]
