package com.Project.SCM_System.Repository;

import com.Project.SCM_System.Model.User;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface userRepository extends MongoRepository<User, String>{
    User findByEmail(String email);
}
