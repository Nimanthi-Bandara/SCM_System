package com.Project.SCM_System.Service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project.SCM_System.Repository.categoryRepository;
import com.Project.SCM_System.Model.Category;


@Service
public class categoryServiceImpl implements categoryService{
    @Autowired
    private categoryRepository categoryRepository;
    @Override
    public Category createCategory(Category category){
        return categoryRepository.save(category);
    }
    
    @Override
    public Category getCategoryById(String categoryId){
        Optional<Category> category = categoryRepository.findById(categoryId);
        return category.orElse(null);
    }

    @Override
    public List<Category> getAllCategories(){
        return categoryRepository.findAll();
    }

    @Override
    public Category updateCategory(String categoryId, Category category){
        if (categoryRepository.existsById(categoryId)){
            category.setcategoryId(categoryId);
            return categoryRepository.save(category);
        }
        return null; // throw exception
    }

    @Override
    public void deleteCategory(String categoryId){
        categoryRepository.deleteById(categoryId);
    }

}
