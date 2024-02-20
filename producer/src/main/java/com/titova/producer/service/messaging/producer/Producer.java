package com.titova.producer.service.messaging.producer;

import com.titova.producer.model.Order;
import com.titova.producer.service.messaging.event.OrderSendEvent;
import com.titova.producer.service.messaging.service.KafkaMessagingService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class Producer {

    private final KafkaMessagingService kafkaMessagingService;
    private final ModelMapper modelMapper;


    public Order sendOrderEvent(Order order) {
        kafkaMessagingService.sendOrder(modelMapper.map(order, OrderSendEvent.class));
        log.info("Send order from producer {}", order);
        return order;
    }
}
