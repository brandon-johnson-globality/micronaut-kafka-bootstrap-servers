FROM openjdk:14-alpine
COPY build/libs/bootstrap-servers-example-*-all.jar bootstrap-servers-example.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "bootstrap-servers-example.jar"]