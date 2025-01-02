package com.Project.SCM_System.Service;

import java.util.List;

import com.Project.SCM_System.Model.Production_Plan;

public interface ProductionPlanService {
    Production_Plan createProductionPlan(Production_Plan productionPlan);

    Production_Plan getProductionPlanById(String productId);

    List<Production_Plan> getAllProductionPlan();

    Production_Plan updateProductinoPlan(String productId, Production_Plan productionPlan);

    void deleteProductionPlan(String productId);
}
