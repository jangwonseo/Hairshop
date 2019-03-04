package com.example.jangwonseo.repository;

import com.example.jangwonseo.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}