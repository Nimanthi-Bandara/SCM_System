package com.Project.SCM_System.Service.Impl;

import com.Project.SCM_System.Model.Customer;
import com.Project.SCM_System.Repository.customerRepository;
import com.Project.SCM_System.Service.customerService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class customerServiceImpl implements customerService{
    @Autowired
    private customerRepository customerRepository;
    @Override
    public Customer createCustomer(Customer customer){
        return customerRepository.save(customer);
    }

    @Override
    public Customer getCustomerById(String custId){
        Optional<Customer> customer = customerRepository.findById(custId);
        return customer.orElse(null);
    }

    @Override
    public List<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }

    @Override
    public Customer updateCustomer(String custId, Customer customer){
        if(customerRepository.existsById(custId)){
            customer.setcustId(custId);
            return customerRepository.save(customer);
        }
        return null;
    }

    @Override
    public void deleteCustomer(String custId){
        customerRepository.deleteById(custId);
    }
}

