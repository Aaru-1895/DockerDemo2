FROM openjdk:19
COPY target/docker-demo.jar /usr/app/
WORKDIR /usr/app
#ADD target/docker-demo.jar docker-demo.jar
EXPOSE 8088
ENTRYPOINT ["java", "-jar", "docker-demo.jar"]