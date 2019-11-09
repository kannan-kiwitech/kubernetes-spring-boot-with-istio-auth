FROM openjdk:8 AS BUILD_IMAGE
ENV APP_HOME=/root/dev/myapp/
RUN mkdir -p $APP_HOME/src/main/java
WORKDIR $APP_HOME
COPY . $APP_HOME
COPY . .
RUN ./gradlew build -x test --continue

FROM openjdk:8-jre
WORKDIR /root/
COPY ./src/main/resources/application.properties .
COPY --from=BUILD_IMAGE /root/dev/myapp/build/libs/userservice-0.0.1-SNAPSHOT.jar .
CMD ["java", "-jar", "userservice-0.0.1-SNAPSHOT.jar"]
