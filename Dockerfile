FROM openjdk:11
ADD ./target/springMuzix-0.0.1-SNAPSHOT.jar springMuzix-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","springMuzix-0.0.1-SNAPSHOT.jar"]