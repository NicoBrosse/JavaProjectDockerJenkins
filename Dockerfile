FROM maven

WORKDIR /srv

COPY .  .

RUN mvn install

RUN ls -la target

CMD ["java", "-jar", "target/javaprojetdocker-0.0.1-SNAPSHOT.jar"]
