FROM openjdk:8
COPY ./target/calculator_devops-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-cp", "calculator_devops-1.0-SNAPSHOT.jar", "Calculator"]