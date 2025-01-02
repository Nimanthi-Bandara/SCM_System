package com.Project.SCM_System.Service;

import java.util.List;

import com.Project.SCM_System.Model.Supplier;

public interface supplierService {
    Supplier createSupplier(Supplier supplier);
    Supplier getSupplierById(String suppId);
    List<Supplier> getAllSuppliers();
    Supplier updateSupplier(String suppId,Supplier supplier);
    void deleteSupplier(String suppId);
}