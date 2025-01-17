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

@RestController
@RequestMapping({ "/api/Production_Plan" })
public class Production_PlanController {
    @Autowired
    private Production_PlanService Production_PlanService;

    public Production_PlanController() {
    }

    @PostMapping
    public ResponseEntity<Production_Plan> createProduction_Plan(@RequestBody Production_Plan production_plan) {
        Production_Plan creatSupplier = this.Production_PlanService.createProduction_Plan(production_plan);
        return ResponseEntity.ok(creatSupplier);
    }

    @GetMapping({ "/{suppId}" })
    public ResponseEntity<Supplier> getSupplierById(@PathVariable String suppId) {
        Supplier supplier = this.supplierService.getSupplierById(suppId);
        return supplier != null ? ResponseEntity.ok(supplier) : ResponseEntity.notFound().build();
    }

    @GetMapping
    public ResponseEntity<List<Supplier>> getAllSupplier() {
        List<Supplier> supplier = this.supplierService.getAllSuppliers();
        return ResponseEntity.ok(supplier);
    }

    @PutMapping({ "/suppId" })
    public ResponseEntity<Supplier> updateSupplier(@PathVariable String suppId, @RequestBody Supplier supplier) {
        Supplier updateSupplier = this.supplierService.updateSupplier(suppId, supplier);
        return updateSupplier != null ? ResponseEntity.ok(updateSupplier) : ResponseEntity.notFound().build();
    }

    @DeleteMapping({ "/{suppId}" })
    public ResponseEntity<Supplier> deleteSupplier(@PathVariable String suppId) {
        this.supplierService.deleteSupplier(suppId);
        return ResponseEntity.noContent().build();
    }
}