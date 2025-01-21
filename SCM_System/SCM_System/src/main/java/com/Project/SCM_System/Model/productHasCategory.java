package com.Project.SCM_System.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "productHasCategory")

public class productHasCategory {
    @Id
    private String productId;
    private String productName;
    private String categoryId;

    public String getproductId(){
        return productId;
    }

    public void setproductId(String productId){
        this.productId = productId;
    }

    public String getprodctName(){
        return productName;
    }

    public void setproductName(String productName){
        this.productName = productName;
    }
    
    public String getcategoryId(){
        return categoryId;
    }

    public void setcategoryId(String categoryId){
        this.categoryId = categoryId;
    }
}