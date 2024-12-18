FROM openjdk:8
EXPOSE 9595
ADD target/file-reader-docker.jar file-reader-docker.jar
ENTRYPOINT [ "java","-jar","/file-reader-docker.jar" ]
