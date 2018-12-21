package com.activemq.consumer;

import org.springframework.jms.annotation.JmsListener;

public class Consumer {
    @JmsListener(destination = "xingchen.queue")
    public void receiveQueue(String text) {
        System.out.println("Consumer queue msg : "+text);
    }
}
