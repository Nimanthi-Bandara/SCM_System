package com.Project.SCM_System.Repository;

import java.util.Locale.Category;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface categoryRepository extends MongoRepository<String , Category>{

    Optional<com.Project.SCM_System.Model.Category> findById(String categoryId);

    boolean existsById(String categoryId);

    com.Project.SCM_System.Model.Category save(com.Project.SCM_System.Model.Category category);

    void deleteById(String categoryId);
    
}
