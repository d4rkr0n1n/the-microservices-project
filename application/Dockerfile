FROM maven

WORKDIR /app

COPY pom.xml ./
RUN mvn dependency:resolve
COPY src ./src
ENV ENV_VALUE="TestDocker"
RUN mvn test

ENTRYPOINT ["mvn", "spring-boot:test-run"]