package com.Project.SCM_System.Repository;

import com.Project.SCM_System.Model.Category;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface categoryRepository extends MongoRepository<Category , String>{

}
