package com.Project.SCM_System.Repository;

import com.Project.SCM_System.Model.Product;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface productRepository extends MongoRepository<Product, String>{
    
}
