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
import com.Project.SCM_System.Model.Supplier;

@RestController
@RequestMapping({ "/api/Production_Plan" })
public class Production_PlanController {
    @Autowired
    private Production_PlanController Production_PlanService;

    public Production_PlanController() {
    }

    @PostMapping
    public ResponseEntity<ResponseEntity<ResponseEntity<Production_Plan>>> createProduction_Plan(
            @RequestBody Production_Plan production_plan) {
        ResponseEntity<ResponseEntity<ResponseEntity<Production_Plan>>> creatProduction_Plan = this.Production_PlanService
                .createProduction_Plan(production_plan);
        return ResponseEntity.ok(createProduction_Plan);
    }

    @GetMapping({ "/{OrderId}" })
    public ResponseEntity<Production_Plan> getProduction_PlanById(@PathVariable String suppId) {
        Production_Plan production_plan = this.Production_PlanService.getProduction_PlanById(OrderId);
        return production_plan != null ? ResponseEntity.ok(production_plan) : ResponseEntity.notFound().build();
    }

    @GetMapping
    public ResponseEntity<List<Production_Plan>> getAllProduction_Plan() {
        List<Production_Plan> production_plan = (List<Production_Plan>) this.Production_PlanService
                .getAllProduction_Plan();
        return ResponseEntity.ok(production_plan);
    }

    @PutMapping({ "/{OrderId}" })
    public ResponseEntity<Production_Plan> updateProduction_Plan(@PathVariable String OrderId,
            @RequestBody Production_Plan production_plan) {
        ResponseEntity<Production_Plan> updateProduction_Plan = this.Production_PlanService
                .updateProduction_Plan(OrderId, production_plan);
        return updateProduction_Plan != null ? ResponseEntity.ok(updateProduction_Plan)
                : ResponseEntity.notFound().build();
    }

    @DeleteMapping({ "/{OrderId}" })
    public ResponseEntity<Production_Plan> deleteProduction_Plan(@PathVariable String suppId) {
        this.Production_PlanService.deleteProduction_Plan(OrderId);
        return ResponseEntity.noContent().build();
    }
}