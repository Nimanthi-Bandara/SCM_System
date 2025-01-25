package com.Project.SCM_System.Repository;

import com.Project.SCM_System.Model.Customer;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface customerRepository extends MongoRepository<Customer,String>{
    
}
