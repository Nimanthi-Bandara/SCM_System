package com.Project.SCM_System.Service.Impl;

import com.Project.SCM_System.Model.Category;

import java.util.List;

public interface categoryService {
    Category createCategory(Category category);
    Category getCategoryById(String categoryId);
    List<Category> getAllCategories();
    Category updateCategory(String categoryId, Category category);
    void deleteCategory(String categoryId);
}
