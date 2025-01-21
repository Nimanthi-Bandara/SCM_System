package com.Project.SCM_System.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection= "category")

public class Category {
    @Id
    private String categoryId;
    private String Name;
    private String parentId;
    private String parentCode;
    private String level;
    private String listOfCategory;

    public String getcategoryId(){
        return categoryId;
    }

    public void setcategoryId(String categoryId){
        this.categoryId = categoryId;
    }

    public String getName(){
        return Name;
    }

    public void setName(String Name){
        this.Name = Name;
    }

    public String getparentId(){
        return parentId;
    }

    public void setparentId(String parentId){
        this.parentId = parentId;
    }

    public String getparentCode(){
        return parentCode;
    }

    public void setparentCode(String parentCode){
        this.parentCode = parentCode;
    }

    public String getlevel(){
        return level;
    }

    public void setlevel(String level){
        this.level = level;
    }

    public String getlistOfCategory(){
        return listOfCategory;
    }

    public void setlistOfCategory(String listOfCategory){
        this.listOfCategory = listOfCategory;
    }
}
