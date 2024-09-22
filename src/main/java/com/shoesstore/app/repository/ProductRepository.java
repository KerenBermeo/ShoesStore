package com.shoesstore.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.shoesstore.app.models.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {
    
}
