package com.Project.SCM_System.Controller;

import com.Project.SCM_System.Model.Supplier;
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

import com.Project.SCM_System.Service.supplierService;

import java.util.List;

@RestController
@RequestMapping({"/api/suppliers"})
public class supplierController {
    @Autowired
    private supplierService supplierService;
    public supplierController(){
    }

    @PostMapping
    public ResponseEntity<Supplier> createSupplier(@RequestBody Supplier supplier){
        Supplier creatSupplier = this.supplierService.createSupplier(supplier);
        return ResponseEntity.ok(creatSupplier);
    }

    @GetMapping({"/{suppId}"})
    public ResponseEntity<Supplier> getSupplierById(@PathVariable String suppId){
        Supplier supplier = this.supplierService.getSupplierById(suppId);
        return supplier != null? ResponseEntity.ok(supplier) : ResponseEntity.notFound().build();
    }

    @GetMapping
    public ResponseEntity<List<Supplier>> getAllSupplier(){
        List<Supplier> supplier = this.supplierService.getAllSuppliers();
        return ResponseEntity.ok(supplier);
    }

    @PutMapping({"/suppId"})
    public ResponseEntity<Supplier> updateSupplier(@PathVariable String suppId,@RequestBody Supplier supplier){
        Supplier updateSupplier = this.supplierService.updateSupplier(suppId, supplier);
        return updateSupplier != null? ResponseEntity.ok(updateSupplier) : ResponseEntity.notFound().build();
    }

    @DeleteMapping({"/{suppId}"})
    public ResponseEntity<Supplier> deleteSupplier(@PathVariable String suppId){
        this.supplierService.deleteSupplier(suppId);
        return ResponseEntity.noContent().build();
    }
}
