package com.activemq.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class TopicConsumer {
    @JmsListener(destination = "xingchen.topic")
    public void receiveTopic(String text) {
        System.out.println("Consumer topic msg : "+text);
    }
}
