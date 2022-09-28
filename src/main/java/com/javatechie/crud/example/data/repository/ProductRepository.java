package com.javatechie.crud.example.data.repository;

import com.javatechie.crud.example.data.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {


    Product findByName(String name);
}
