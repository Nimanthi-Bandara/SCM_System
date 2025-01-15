package com.Project.SCM_System.Repository;

import java.util.Locale.Category;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface categoryRepository extends MongoRepository<Category , String>{

    com.Project.SCM_System.Model.Category save(com.Project.SCM_System.Model.Category category);
    
}
