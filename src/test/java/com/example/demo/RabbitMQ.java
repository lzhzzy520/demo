package com.example.demo;

import com.example.demo.service.serviceImpl.Send;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class RabbitMQ {

    @Autowired
    private Send send;

    @Test
    public  void sender()
    {
        send.send();
    }
}
