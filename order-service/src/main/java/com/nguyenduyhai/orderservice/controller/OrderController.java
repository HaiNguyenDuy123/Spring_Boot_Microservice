package com.nguyenduyhai.orderservice.controller;

import com.nguyenduyhai.orderservice.dto.OrderRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class OrderController {
    @PostMapping
    public String placeOrder(@RequestBody OrderRequest oderRequest) {
        return "Order Placed Successfully";
    }
}
