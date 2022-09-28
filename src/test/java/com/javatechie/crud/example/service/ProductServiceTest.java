package com.javatechie.crud.example.service;

import com.javatechie.crud.example.data.entity.Product;
import com.javatechie.crud.example.data.repository.ProductRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.*;

@SpringBootTest
public class ProductServiceTest {

    @Autowired
    ProductService productService;

    @Test
    public void createProduct() {
        Product product = new Product();
        product.setName("1111");
        product.setPrice(1234);
        product.setQuantity(1);

        productService.saveProduct(product);
    }
}