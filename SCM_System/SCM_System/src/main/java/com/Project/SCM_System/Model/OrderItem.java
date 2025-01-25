package com.Project.SCM_System.Model;

public class OrderItem {
    private String productId;
    private String productName;
    private int quantity;
    private int unitPrice;

    public String getproductId(){
        return productId;
    }

    public void setproductId(String productId){
        this.productId = productId;
    }

    public String getproductName(){
        return productName;
    }

    public void setproductName(String productName){
        this.productName = productName;
    }


    public int getquantity(){
        return quantity;
    }

    public void setquantity(int quantity){
        this.quantity = quantity;
    }

    public int getunitPrice(){
        return unitPrice;
    }

    public void setunitPrice(int unitPrice){
        this.unitPrice = unitPrice;
    }

}
