package org.example.springintro.controller;

import org.example.springintro.model.Product;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductsController {
    List<Product> products = new ArrayList<>();

    public ProductsController() {
        products.add(new Product(1, "Laptop", 1000));
        products.add(new Product(2, "Phone", 500));
    }


    @GetMapping
    public List<Product> getProducts() {
        return products;
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable int id){
        for(Product p : products){
            if(p.getId() == id){
                return p;
            }
        }
        return null;
    }

    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        products.add(product);
        return product;
    }
}
