package com.Project.SCM_System.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project.SCM_System.Model.Production_Plan;
import com.Project.SCM_System.Repository.Production_PlanRepository;

@Service

public class Production_PlanServiceImpl implements Production_PlanService {
    @Autowired
    private Production_PlanRepository production_planRepository;

    @Override
    public Production_Plan createProduction_Plan(Production_Plan production_plan) {
        return production_planRepository.save(production_plan);
    }

    @Override
    public Production_Plan getProduction_PlanById(String OrderId) {
        Optional<Production_Plan> production_plan = production_planRepository.findById(OrderId);
        return production_plan.orElse(null);
    }

    @Override
    public List<Production_Plan> getAllProduction_Plan() {
        return production_planRepository.findAll();
    }

    @Override
    public Production_Plan updateProduction_Plan(String OrderId, Production_Plan production_plan) {
        if (production_planRepository.existsById(OrderId)) {
            production_plan.setOrderId(OrderId);
            return production_planRepository.save(production_plan);
        }
        return null; // throw exception
    }

    @Override
    public void deleteProduction_Plan(String OrderId) {
        production_planRepository.deleteById(OrderId);
    }
}