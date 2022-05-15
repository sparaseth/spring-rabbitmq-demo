package com.skptech.rabbitmq.demo;

import com.skptech.rabbitmq.demo.model.User;
import com.skptech.rabbitmq.demo.sender.RabbitMqSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RabbitMqDemoApplication {

    @Autowired
    private RabbitMqSender rabbitMqSender;

    public static void main(String[] args) {
        SpringApplication.run(RabbitMqDemoApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner() {
        String message = "Hello RabbitMQ ";
        return args -> {
            for (int i = 0; i < 10; i++) {
                User user = new User(Integer.toString(i), message + Integer.toString(i));
                rabbitMqSender.send(user);
            }
        };
    }

}
