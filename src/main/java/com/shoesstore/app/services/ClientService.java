package com.shoesstore.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoesstore.app.models.Product;

import com.shoesstore.app.repository.ProductRepository;

@Service
public class ClientService {
    
    @Autowired
    private ProductRepository productRepository;

    public List<Product> viewProducts() {
        return (List<Product>) productRepository.findAll();
    }

    public void purchaseProduct(Product product, int user) {
        // Lógica para realizar la compra
    }
}
