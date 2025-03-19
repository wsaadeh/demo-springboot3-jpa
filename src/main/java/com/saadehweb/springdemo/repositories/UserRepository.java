package com.saadehweb.springdemo.repositories;

import com.saadehweb.springdemo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
