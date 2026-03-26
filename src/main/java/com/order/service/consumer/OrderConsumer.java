package com.order.service.consumer;

import com.order.service.model.OrderEvent;
import org.springframework.stereotype.Service;
import org.springframework.kafka.annotation.KafkaListener;

@Service
public class OrderConsumer {

    @KafkaListener(topics = "orders", groupId = "my-app-group")
    public void consume(OrderEvent event) {
        System.out.println("Received: " + event);
        // Todo
        // process the event — save to DB, trigger business logic
    }
}