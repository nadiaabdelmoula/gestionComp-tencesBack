FROM openjdk:8
ADD target/supportportal-0.0.1-SNAPSHOT.jar supportportal-0.0.1-SNAPSHOT.jar
EXPOSE 5000
ENTRYPOINT ["java", "-jar", "supportportal-0.0.1-SNAPSHOT.jar"]
