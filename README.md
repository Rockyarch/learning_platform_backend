# Learning Platform Backend

This is a Spring Boot backend for the Learning Platform project. Follow the instructions below to set up the project on your local machine.

## Prerequisites

Before you start, make sure you have the following installed on your machine:

- [Java Development Kit (JDK) 17 or later](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html)
- [Maven](https://maven.apache.org/install.html)
- [Git](https://git-scm.com/)

## Cloning the Repository

To clone the repository, follow these steps:

1. Open a terminal (or Git Bash on Windows).
2. Run the following command to clone the repository:
  ```bash
   git clone https://github.com/Rockyarch/learning_platform_backend.git
  ```
3. Navigate to the project directory:

   ```bash
   cd learning_platform_backend
   ```
## Running the Spring Boot Application

Once you’ve cloned the repository, follow these steps to start the Spring Boot application:

1. **Build the project** using Maven:

   ```bash
   ./mvnw clean install
   ```
2. **Run the Application** using spring boot

  ```bash
  ./mvnw spring-boot:run
  ```


3. **Spring Boot Server Running**:
 The Spring Boot server should now be running locally on:

   ```bash
   http://localhost:8080
   ```


## Additional Information

- This project uses MySQL as the database. Make sure to update the database credentials in `application.properties` or `application.yml` before running the project.
- Default configurations can be found in the `src/main/resources` directory.

