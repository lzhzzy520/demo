package com.example.demo.service.serviceImpl;

import com.example.demo.mq.RabbitMQConfig;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Send {

    //消息生产者
    @Autowired
    private AmqpTemplate amqpTemplate;

    public  void send()
    {
        System.out.println("刘子豪 发送消息...");
        amqpTemplate.convertAndSend(RabbitMQConfig.QUEUE_NAME,"你好刘子豪");
    }

}
