package com.shoesstore.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoesstore.app.models.Product;
import com.shoesstore.app.repository.ProductRepository;

@Service
public class AdminService {

    @Autowired
    private ProductRepository productRepository;

    public Product createProduct(Product product){
        return productRepository.save(product);
    }

    public List<Product> viewProducts() {
        return (List<Product>) productRepository.findAll();
    }

}
