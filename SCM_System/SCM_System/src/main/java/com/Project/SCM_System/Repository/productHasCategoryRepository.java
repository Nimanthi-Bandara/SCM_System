package com.Project.SCM_System.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Project.SCM_System.Model.productHasCategory;

public interface productHasCategoryRepository extends MongoRepository<productHasCategory, String>{

}