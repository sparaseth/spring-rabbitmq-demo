package com.skptech.rabbitmq.demo.consumer;

import com.skptech.rabbitmq.demo.model.User;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RabbitMqReceiver {

    @Autowired
    private Queue queue;

    @RabbitListener(queues = "#{queue.getName()}")
    public void receivedMessage(User user) {
        System.out.println("User Details Received is.. " + user);
    }

}
