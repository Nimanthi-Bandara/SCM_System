package com.Project.SCM_System.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Project.SCM_System.Model.Order;

public interface orderRepository extends MongoRepository<Order, String>{
    
}
