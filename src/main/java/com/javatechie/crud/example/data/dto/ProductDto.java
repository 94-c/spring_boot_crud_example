package com.javatechie.crud.example.data.dto;

import com.javatechie.crud.example.data.entity.Product;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ProductDto {

    private final Integer id;
    private final String name;
    private final Integer quantity;
    private final double price;

    public Product toCreateEntity(){
        Product product = new Product();
        product.setName(name);
        product.setQuantity(quantity);
        product.setPrice(price);
        return product;
    }
}
