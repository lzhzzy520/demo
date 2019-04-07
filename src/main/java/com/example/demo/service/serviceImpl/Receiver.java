package com.example.demo.service.serviceImpl;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Receiver {

      //消费者
    @Autowired
    private AmqpTemplate amqpTemplate;

    @RabbitListener(queues = "MQ")
    public  void receiverMessage(String  message)
    {
        System.out.println("消费者接受消息"+message);
    }
}
