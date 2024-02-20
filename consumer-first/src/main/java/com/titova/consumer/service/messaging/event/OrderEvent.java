package com.titova.consumer.service.messaging.event;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderEvent {

    private String productName;
    private String barCode;
    private String firstName;
    private String lastName;
    private int quantity;
    private BigDecimal price;

}
