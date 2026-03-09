package org.example.springjpa.service;

import org.example.springjpa.entity.Product;
import org.example.springjpa.repository.ProductRepository;
import org.springframework.stereotype.*;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;


    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAll(){
        return productRepository.findAll();
    }

    public Product getProduct(Long id){
        return productRepository.findById(id).orElseThrow();
    }

    public Product createProduct(Product product){
        return productRepository.save(product);
    }

    public Product updateProduct(Long id, Product product) {

        Product existing = productRepository.findById(id).orElseThrow();

        existing.setName(product.getName());
        existing.setPrice(product.getPrice());
        existing.setCategory(product.getCategory());

        return productRepository.save(existing);
    }

    public void deleteProduct(Long id){
        productRepository.deleteById(id);
    }
}
