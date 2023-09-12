# Spring Boot Demo Project

This is a demo project built with Spring Boot showcasing JWT (JSON Web Tokens) authentication, Lombok, H2 in-memory database, Spring Security, and JPA. It provides a simple example of securing RESTful endpoints with JWT authentication.

## Getting Started

These instructions will help you set up and run the project on your local machine for development and testing purposes.

### Prerequisites

To run this project, you need:

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html) installed
- [Maven](https://maven.apache.org/download.cgi) installed (for building and managing dependencies)

### Installation

1. Clone the repository:
   git clone https://github.com/09btmhabib/secure-spring-app.git
   cd secure-spring-app
   
2. Build the project using Maven:
   mvn clean install
3. Run the application:
   mvn spring-boot:run
##  Usage
  ### Authentication
   To access the protected endpoints, you need to obtain a JWT token by sending a POST request to /login with the basic auth  using username as "coder" and password as
   "temp/12345"

   The response will contain a JWT token.

### API Endpoints
GET /hello - Private endpoint requiring a valid JWT token.
Include the JWT token in the Authorization header of your requests with the "Bearer" prefix, like this:

JSON Web Tokens (JWT) - Used for user authentication and authorization.










