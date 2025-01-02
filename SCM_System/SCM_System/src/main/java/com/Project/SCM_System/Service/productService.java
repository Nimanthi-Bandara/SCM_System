package com.Project.SCM_System.Service;

import com.Project.SCM_System.Model.Product;

import java.util.List;

public interface productService {
    Product createProduct(Product product);
    Product getProductById(String productId);
    List<Product> getAllProducts();
    Product updateProduct(String productId, Product product);
    void deleteProduct(String productId);
}
