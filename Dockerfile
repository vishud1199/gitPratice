FROM openjdk:8
EXPOSE 9090
ADD target/Spring-Docker.jar Spring-Docker.jar
ENTRYPOINT ["java","-jar","/Spring-Docker.jar"]