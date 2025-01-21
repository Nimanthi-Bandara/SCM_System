package com.Project.SCM_System.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Project.SCM_System.Model.Production_Plan;
import com.Project.SCM_System.Service.Production_PlanService;

@RestController
@RequestMapping({ "/api/Production_Plan" })
public class Production_PlanController {
    @Autowired
    private Production_PlanService Production_PlanService;

    public Production_PlanController() {
    }

    @PostMapping
    public ResponseEntity<Production_Plan> createProduction_Plan(@RequestBody Production_Plan production_plan) {
        Production_Plan createproduction_plan = this.Production_PlanService.createProduction_Plan(production_plan);
        return ResponseEntity.ok(createproduction_plan);
    }

    @GetMapping({ "/{orderId}" })
    public ResponseEntity<Production_Plan> getProduction_PlanById(@PathVariable String orderId) {
        Production_Plan production_plan = this.Production_PlanService.getProduction_PlanById(orderId);
        return production_plan != null ? ResponseEntity.ok(production_plan) : ResponseEntity.notFound().build();
    }

    @GetMapping
    public ResponseEntity<List<Production_Plan>> getAllProduction_Plan() {
        List<Production_Plan> production_plan = (List<Production_Plan>) this.Production_PlanService
                .getAllProduction_Plan();
        return ResponseEntity.ok(production_plan);
    }

    @PutMapping({ "/{orderId}" })
    public ResponseEntity<Production_Plan> updateProduction_Plan(@PathVariable String orderId,
            @RequestBody Production_Plan production_plan) {
        Production_Plan updateProduction_Plan = this.Production_PlanService.updateProduction_Plan(orderId,
                production_plan);
        return updateProduction_Plan != null ? ResponseEntity.ok(updateProduction_Plan)
                : ResponseEntity.notFound().build();
    }

    @DeleteMapping({ "/{orderId}" })
    public ResponseEntity<Production_Plan> deleteProduction_Plan(@PathVariable String orderId) {
        this.Production_PlanService.deleteProduction_Plan(orderId);
        return ResponseEntity.noContent().build();
    }
}