package com.springcrud.springcrud.repository;

import com.springcrud.springcrud.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
