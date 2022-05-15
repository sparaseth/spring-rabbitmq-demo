# spring-rabbitmq-demo

## enable rabbitmq plugin:

navigate to {rabbitmq.home}\sbin and run
`rabbitmq-plugins.bat enable rabbitmq_management`

## start rabbitmq server

navigate to {rabbitmq.home}\sbin and run
`rabbitmq-server start`

## access rabbitmq server

`http://localhost:15672/`

## Requirements

For building and running the application you need:

- [JDK 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- [Maven 3](https://maven.apache.org)

## Running the application locally

1. Start rabbitmq server
2. Build the project using `mvn clean install`
3. Run using `mvn spring-boot:run`
4. This will star sending `User` json message 10-times on startup
5. `User` json message can also send using the api(i.e. `http://localhost:8080/api/v1/user`)
    Request Body :- `{
   "userId": "1",
   "userName": "Hello World"
   }`
