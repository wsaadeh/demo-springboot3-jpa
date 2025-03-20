package com.saadehweb.springdemo.repositories;

import com.saadehweb.springdemo.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
