package com.Project.SCM_System.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Project.SCM_System.Model.Production_Plan;

public interface Production_PlanRepository extends MongoRepository<Production_Plan, String> {

}
