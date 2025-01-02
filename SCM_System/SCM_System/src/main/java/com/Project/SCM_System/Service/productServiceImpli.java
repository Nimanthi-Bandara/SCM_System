package com.Project.SCM_System.Service;

import com.Project.SCM_System.Model.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project.SCM_System.Repository.productRepository;

import java.util.Optional;
import java.util.function.Function;
import java.util.List;

@Service

public class productService implements productRepository {
    @Autowired
    private productRepository productRepository;
    @Override
    public Product createProduct(Product product){
        return productRepository.save(product);
    }

    @Override
    public Product getProductById(String productId){
        Optional<Product> supplier = productRepository.findById(productId);
        return supplier.orElse(null);
    }

    @Override
    public List<Product> getAllProduct(){
        return productRepository.findAll();
    }

    @Override
    public Product updateProduct(String productId, Product product){
        if (productRepository.existsById(productId)){
            product.setproductId(productId);
            return productRepository.save(product);
        }
            return null; // throw exception
    }

    @Override
    public void deleteProduct(String productId){
        productRepository.deleteById(productId);
    }


}
