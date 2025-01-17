package com.Project.SCM_System.Service;

import java.util.List;

import com.Project.SCM_System.Model.Production_Plan;

public interface Production_PlanService {
    Production_Plan createProduction_Plan(Production_Plan production_plan);

    Production_Plan getProduction_PlanById(String OrderId);

    List<Production_Plan> getAllProduction_Plan();

    Production_Plan updateProduction_Plan(String OrderId, Production_Plan production_plan);

    void deleteProduction_Plan(String OrderId);
}
