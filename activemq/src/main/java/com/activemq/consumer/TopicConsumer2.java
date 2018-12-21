package com.activemq.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class TopicConsumer2 {
    @JmsListener(destination = "xingchen.topic")
    public void receiveTopic(String text) {
        System.out.println("Consumer2 topic msg : "+text);
    }
}
