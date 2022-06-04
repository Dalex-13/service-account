
FROM adoptopenjdk/openjdk11:alpine-jre

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} serviceAccount.jar
ENTRYPOINT ["java","-jar","/serviceAccount.jar"]
