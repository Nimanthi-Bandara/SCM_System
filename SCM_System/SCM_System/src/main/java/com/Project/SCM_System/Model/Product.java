package com.Project.SCM_System.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "products")

public class Product {
    @Id
    private String productId;
    private String name;
    private String category;
    private String description;
    private int price;
    private int quantityInStock;

    public String getproductId(){
        return productId;
    }

    public void setproductId(String productId){
        this.productId = productId;
    }

    public String getname(){
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getcategory(){
        return category;
    }

    public void setcategory(String category){
        this.category= category;
    }

    public String getdescription(){
        return description;
    }

    public void setdescription(String description){
        this.description = description;
    }

    public int getprice(){
        return price;
    }

    public void setprice(int price){
        this.price = price;
    }

    public int getquantityInStock(){
        return quantityInStock;
    }

    public void setquantityInStock(int quantityInStock){
        this.quantityInStock = quantityInStock;
    }
}
