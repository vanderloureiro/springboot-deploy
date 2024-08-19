FROM eclipse-temurin:21
# RUN mkdir /opt/app
# COPY japp.jar /opt/app
COPY target/*.jar app.jar
# uso do $JAVA_OPTIONS
# ENTRYPOINT java $JAVA_OPTIONS -jar /opt/app/japp.jar
ENTRYPOINT java -jar app.jar
# CMD ["java", "-jar", "/opt/app/japp.jar"]
# EXPOSE 8080