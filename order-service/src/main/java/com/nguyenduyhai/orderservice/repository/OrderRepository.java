package com.nguyenduyhai.orderservice.repository;

import com.nguyenduyhai.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
