# spring-rabbitmq-demo

## enable rabbitmq plugin:

navigate to {rabbitmq.home}\sbin and run
`rabbitmq-plugins.bat enable rabbitmq_management`

## start rabbitmq server

navigate to {rabbitmq.home}\sbin and run
`rabbitmq-server start`

## Requirements

For building and running the application you need:

- [JDK 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- [Maven 3](https://maven.apache.org)

## Running the application locally

1. Enable zookeeper
2. Start rabbitmq server
3. Build the project using `mvn clean install`
4. Run using `mvn spring-boot:run`
5. This will star sending `User` json message 10-times on startup
6. `User` json message can also send using the api(i.e. `http://localhost:8080/api/v1/user`)
    Request Body :- `{
   "userId": "1",
   "userName": "Hello World"
   }`
