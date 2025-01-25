package com.Project.SCM_System.Service;

import com.Project.SCM_System.Model.Customer;

import java.util.List;

public interface customerService {
    Customer createCustomer(Customer customer);
    Customer getCustomerById(String custId);
    List<Customer> getAllCustomers();
    Customer updateCustomer(String custId, Customer customer);
    void deleteCustomer(String custId);
}