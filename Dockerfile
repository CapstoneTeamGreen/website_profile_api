FROM openjdk:17-alpine

WORKDIR /app

COPY target/website_profile_api-1.0-SNAPSHOT.jar application.jar

ENV JAVA_OPTS="-Xmx128 -Xms64m -Djava.security.egd=file:/dev/./urandom"

ENV SERVICE_NAME="website_profile_api"

ENV SPRING_PROFILES_ACTIVE="docker"

ENTRYPOINT [ "java", "-jar", "application.jar"]