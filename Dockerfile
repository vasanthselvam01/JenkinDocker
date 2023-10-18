FROM openjdk
COPY target/*.jar /
EXPOSE 8282
ENTRYPOINT ["java","-jar","/JenkinDocker-1.0.0.jar"]