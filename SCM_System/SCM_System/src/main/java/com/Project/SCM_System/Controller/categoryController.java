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

import com.Project.SCM_System.Model.Category;
import com.Project.SCM_System.Service.categoryService;


@RestController
@RequestMapping({"/api/category"})
public class categoryController {
    @Autowired
    private categoryService categoryService;
    public categoryController(){
    }

    @PostMapping
    public ResponseEntity<Category> createCategory(@RequestBody Category category){
        Category createCategory = this.categoryService.createCategory(category);
        return ResponseEntity.ok(createCategory);
    }

    @GetMapping({"/{categoryId}"})
    public ResponseEntity<Category> getCategoryById(@PathVariable String categoryId){
        Category category = this.categoryService.getCategoryById(categoryId);
        return category != null? ResponseEntity.ok(category) : ResponseEntity.notFound().build();
    }

    @GetMapping
    public ResponseEntity<List<Category>> getAllcategories(){
        List<Category> Category = this.categoryService.getAllCategories();
        return ResponseEntity.ok(Category);
    }
 
    @PutMapping({"/{categoryId}"})
    public ResponseEntity<Category> updateCustomer(@PathVariable String categoryId,@RequestBody Category category){
        Category updateCategory = this.categoryService.updateCategory(categoryId, category);
        return updateCategory != null? ResponseEntity.ok(updateCategory) : ResponseEntity.notFound().build();
    }

    @DeleteMapping({"/{categoryId}"})
    public ResponseEntity<Category> deleteCategory(@PathVariable String categoryId){
        this.categoryService.deleteCategory(categoryId);
        return ResponseEntity.noContent().build();
    }
}
