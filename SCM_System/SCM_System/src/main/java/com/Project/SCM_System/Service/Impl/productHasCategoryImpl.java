package com.Project.SCM_System.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project.SCM_System.Model.productHasCategory;
import com.Project.SCM_System.Repository.productHasCategoryRepository;
import com.Project.SCM_System.Service.productHasCategoryService;

@Service

public class productHasCategoryImpl implements productHasCategoryService{
    @Autowired
    private productHasCategoryRepository productHasCategoryRepository;

    @Override
    public productHasCategory createproductHasCategory(productHasCategory producthascategory){
        return productHasCategoryRepository.save(producthascategory);
    }
}
