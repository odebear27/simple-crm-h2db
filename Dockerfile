# Use the latest OpenJDK 17 image from Docker Hub
FROM eclipse-temurin:17.0.7_7-jdk

# Set the working directory to /app
WORKDIR /app

# Copy the current directory contents into the container at /app
COPY target/simple-crm-0.0.1-SNAPSHOT.jar crm-app.jar

CMD ["java", "-jar", "crm-app.jar"]