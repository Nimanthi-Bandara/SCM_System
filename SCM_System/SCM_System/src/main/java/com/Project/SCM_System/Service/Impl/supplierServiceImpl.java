package com.Project.SCM_System.Service.Impl;

import com.Project.SCM_System.Model.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project.SCM_System.Repository.supplierRepository;
import com.Project.SCM_System.Service.supplierService;

import java.util.Optional;
import java.util.List;

@Service

public class supplierServiceImpl implements supplierService{
    @Autowired
    private supplierRepository supplierRepository;
    @Override
    public Supplier createSupplier(Supplier supplier){
        return supplierRepository.save(supplier);
    }

    @Override
    public Supplier getSupplierById(String suppId){
        Optional<Supplier> supplier = supplierRepository.findById(suppId);
        return supplier.orElse(null);
    }

    @Override
    public List<Supplier> getAllSuppliers(){
        return supplierRepository.findAll();
    }

    @Override
    public Supplier updateSupplier(String suppId, Supplier supplier){
        if (supplierRepository.existsById(suppId)){
            supplier.setsuppId(suppId);
            return supplierRepository.save(supplier);
        }
            return null; // throw exception
    }

    @Override
    public void deleteSupplier(String suppId){
        supplierRepository.deleteById(suppId);
    }
}
