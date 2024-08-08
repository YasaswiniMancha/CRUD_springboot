package com.crud.example.product.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.example.product.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);
}

