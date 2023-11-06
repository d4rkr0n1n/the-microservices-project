FROM maven

WORKDIR /app

COPY pom.xml ./
COPY src ./src
RUN mvn dependency:resolve

ENTRYPOINT ["mvn", "spring-boot:run"]