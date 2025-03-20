package com.saadehweb.springdemo.repositories;

import com.saadehweb.springdemo.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
