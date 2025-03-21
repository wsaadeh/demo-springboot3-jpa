package com.saadehweb.springdemo.repositories;

import com.saadehweb.springdemo.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {
}
