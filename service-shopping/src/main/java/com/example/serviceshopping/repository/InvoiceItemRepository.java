package com.example.serviceshopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.serviceshopping.entity.InvoiceItem;

public interface InvoiceItemRepository extends JpaRepository<InvoiceItem, Long>{
    
}
