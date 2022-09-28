package com.javatechie.crud.example.controller;

import com.javatechie.crud.example.data.entity.Product;
import com.javatechie.crud.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping("/createProduct")
    public Product createProduct(@RequestBody Product product) {
        return service.saveProduct(product);
    }

    @PostMapping("/createProducts")
    public List<Product> createProducts(@RequestBody List<Product> products) {
        return service.saveProducts(products);
    }

    @GetMapping("/products")
    public List<Product> findAllProducts() {
        return service.findAllProduct();
    }

    @GetMapping("/productById/{id}")
    public Product findByProductId(@PathVariable int id) {
        return service.findByProductId(id);
    }

    @GetMapping("/product/{name}")
    public Product findByProductName(@PathVariable String name) {
        return service.findByProductName(name);
    }

    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product) {
        return service.updateProduct(product);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        return service.deleteProduct(id);
    }


}
