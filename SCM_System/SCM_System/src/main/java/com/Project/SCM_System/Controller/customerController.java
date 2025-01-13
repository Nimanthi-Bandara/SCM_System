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

import com.Project.SCM_System.Model.Customer;
import com.Project.SCM_System.Service.customerService;

@RestController
@RequestMapping({"/api/customer"})
public class customerController {
    @Autowired
    private customerService customerService;
    public customerController(){
    }

     @PostMapping
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer){
        Customer createCustomer = this.customerService.createCustomer(customer);
        return ResponseEntity.ok(createCustomer);
    }

    @GetMapping({"/{custId}"})
    public ResponseEntity<Customer> getCustomerById(@PathVariable String custId){
        Customer customer = this.customerService.getCustomerById(custId);
        return customer != null? ResponseEntity.ok(customer) : ResponseEntity.notFound().build();
    }

    @GetMapping
    public ResponseEntity<List<Customer>> getAllCustomer(){
        List<Customer> Customer = this.customerService.getAllCustomers();
        return ResponseEntity.ok(Customer);
    }

    @PutMapping({"/custId"})
    public ResponseEntity<Customer> updateCustomer(@PathVariable String custId,@RequestBody Customer customer){
        Customer updateCustomer = this.customerService.updateCustomer(custId, customer);
        return updateCustomer != null? ResponseEntity.ok(updateCustomer) : ResponseEntity.notFound().build();
    }

    @DeleteMapping({"/{custId}"})
    public ResponseEntity<Customer> deleteProduct(@PathVariable String custId){
        this.customerService.deleteCustomer(custId);
        return ResponseEntity.noContent().build();
    }
}
