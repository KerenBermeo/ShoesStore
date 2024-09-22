package com.shoesstore.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.shoesstore.app.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    
}
