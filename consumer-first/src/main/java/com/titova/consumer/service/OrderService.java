package com.titova.consumer.service;


import com.titova.consumer.domain.Order;
import com.titova.consumer.service.dto.OrderDto;

public interface OrderService {
    Order save(OrderDto clientDto);
}
