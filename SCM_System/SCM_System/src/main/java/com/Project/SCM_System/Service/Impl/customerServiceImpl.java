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

    
}

