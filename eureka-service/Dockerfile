FROM maven

WORKDIR /app

COPY pom.xml ./
RUN mvn dependency:resolve

COPY src ./src

ENTRYPOINT ["mvn", "spring-boot:run"]