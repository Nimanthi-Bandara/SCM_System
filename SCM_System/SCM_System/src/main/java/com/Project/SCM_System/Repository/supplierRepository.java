package com.Project.SCM_System.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Project.SCM_System.Model.Supplier;

public interface supplierRepository extends MongoRepository<Supplier ,String>{
    
}
