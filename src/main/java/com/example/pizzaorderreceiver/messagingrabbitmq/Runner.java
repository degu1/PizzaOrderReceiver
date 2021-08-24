package com.example.pizzaorderreceiver.messagingrabbitmq;


import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {

    private RabbitTemplate rabbitTemplate;

    public Runner(RabbitTemplate rabbitTemplate) {

        this.rabbitTemplate = rabbitTemplate;
    }


    @Override
    public void run(String... args) throws Exception {
        //      System.out.println("Sending message...");
        //      rabbitTemplate.convertAndSend(RabbitMQConfiguration.topicExchangeName, "foo.bar.baz", "One Margherita with no cheese.");
    }
}
