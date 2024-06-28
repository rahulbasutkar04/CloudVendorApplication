# Use an official Maven image with OpenJDK 17 as a parent image
FROM maven:3.8.5-openjdk-17

# Set the working directory inside the container
WORKDIR /CloudVendorAPI

# Copy the current directory contents into the container at /CloudVendorAPI
COPY . .

# Run the build using Gradle wrapper
RUN ./gradlew clean build

# Run the application
CMD ./gradlew bootRun



