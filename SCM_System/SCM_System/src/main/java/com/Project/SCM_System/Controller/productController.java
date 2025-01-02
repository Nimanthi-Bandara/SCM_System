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

import com.Project.SCM_System.Model.Product;
import com.Project.SCM_System.Service.productService;

@RestController
@RequestMapping({"/api/products"})
    public class productController {
    @Autowired
    private productService productService;
    public productController(){
    }

    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product product){
        Product createProduct = this.productService.createProduct(product);
        return ResponseEntity.ok(createProduct);
    }

    @GetMapping({"/{productId}"})
    public ResponseEntity<Product> getProductById(@PathVariable String productId){
        Product product = this.productService.getProductById(productId);
        return product != null? ResponseEntity.ok(product) : ResponseEntity.notFound().build();
    }

    @GetMapping
    public ResponseEntity<List<Product>> getAllProduct(){
        List<Product> Product = this.productService.getAllProducts();
        return ResponseEntity.ok(Product);
    }

    @PutMapping({"/suppId"})
    public ResponseEntity<Product> updateProduct(@PathVariable String suppId,@RequestBody Product Product){
        Product updateProduct = this.productService.updateProduct(suppId, Product);
        return updateProduct != null? ResponseEntity.ok(updateProduct) : ResponseEntity.notFound().build();
    }

    @DeleteMapping({"/{suppId}"})
    public ResponseEntity<Product> deleteProduct(@PathVariable String suppId){
        this.productService.deleteProduct(suppId);
        return ResponseEntity.noContent().build();
    }
    }
