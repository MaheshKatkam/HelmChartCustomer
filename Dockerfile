FROM  openjdk:24-ea-17-jdk-slim-bullseye

COPY target/helmchart-customer.jar helmchart-customer.jar

EXPOSE 8888

ENTRYPOINT ["java","-jar","/helmchart-customer.jar"]