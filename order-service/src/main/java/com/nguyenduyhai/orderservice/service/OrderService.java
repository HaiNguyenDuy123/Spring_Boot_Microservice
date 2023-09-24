package com.nguyenduyhai.orderservice.service;

import com.nguyenduyhai.orderservice.dto.OrderRequest;
import com.nguyenduyhai.orderservice.model.Order;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class OrderService {
    public void placeOrder(OrderRequest orderRequest) {
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());
    }
}
