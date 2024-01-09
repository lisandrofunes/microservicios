package com.example.servicecustomer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.servicecustomer.entity.Customer;
import com.example.servicecustomer.entity.Region;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
    public Customer findByNumberID(String numberID);
    public List<Customer> findByLastName(String lastName);
    public List<Customer> findByRegion(Region region);
} 
