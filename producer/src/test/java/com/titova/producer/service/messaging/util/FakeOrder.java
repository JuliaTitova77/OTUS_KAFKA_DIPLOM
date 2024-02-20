package com.titova.producer.service.messaging.util;

import com.titova.producer.service.messaging.event.OrderSendEvent;

import java.math.BigDecimal;

public class FakeOrder {

    public static OrderSendEvent getOrderSendEvent(){
        return new OrderSendEvent(
                "pensil",
                "0000003",
                "Ermanno",
                "Ruddock",
                100,
                new BigDecimal(0.99)
        );
    }
}
