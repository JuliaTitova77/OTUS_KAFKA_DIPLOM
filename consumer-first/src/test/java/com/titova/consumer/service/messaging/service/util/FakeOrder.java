package com.titova.consumer.service.messaging.service.util;

import com.titova.consumer.domain.Order;
import com.titova.consumer.domain.Status;
import com.titova.consumer.service.messaging.event.OrderEvent;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class FakeOrder {

    public static OrderEvent getOrderEvent(){
        return new OrderEvent(
                "pensil",
                "0000003",
                "Ermanno",
                "Ruddock",
                100,
                new BigDecimal(0.99)
        );
    }

    public static Order getOrder(){
        return new Order(
                1L,
                "pensil",
                "0000003",
                "Ermanno",
                "Ruddock",
                100,
                new BigDecimal(0.99),
                new BigDecimal(99.0),
                LocalDateTime.of(2023,06,16,15,56,00),
                Status.APPROVED
        );
    }
}
