package com.activemq.Config;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.jms.Queue;
import javax.jms.Topic;
import java.util.concurrent.locks.ReentrantLock;


@Configuration
public class MqConfig {
    @Bean
    public Queue queue() {
        return new ActiveMQQueue("xingchen.queue");
    }

    @Bean
    public Topic topic() {
        ReentrantLock
        return new ActiveMQTopic("xingchen.topic");
    }
}
