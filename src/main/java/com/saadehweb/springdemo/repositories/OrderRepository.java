package com.saadehweb.springdemo.repositories;

import com.saadehweb.springdemo.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
