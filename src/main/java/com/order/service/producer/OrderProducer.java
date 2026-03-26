package com.order.service.producer;

import com.order.service.model.OrderEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.kafka.core.KafkaTemplate;

@Service
public class OrderProducer {

    private static final String TOPIC = "orders";

    @Autowired
    private KafkaTemplate<String, OrderEvent> kafkaTemplate;

    public void sendOrder(OrderEvent event) {
        kafkaTemplate.send(TOPIC, event.getOrderId(), event);
        System.out.println("Sent: " + event);
    }
}