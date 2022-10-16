
FROM openjdk:8-jre

ENV APP_PATH=/java_docker

ADD myblog1.jar  $APP_PATH
ENTRYPOINT ["java","-jar"]
CMD ["myblog1.jar"]
