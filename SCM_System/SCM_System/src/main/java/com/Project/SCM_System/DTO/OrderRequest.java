package com.Project.SCM_System.DTO;

import java.util.List;

import com.Project.SCM_System.Model.OrderItem;

public class OrderRequest {
    private String orderName;
    private String custId;
    private String customerName;
    private String customerEmail;
    private String deliveryAddress;
    private int unitPrice;
    private int quantity;
    private List<OrderItem> items;

    public String getorderName(){
        return orderName;
    }
  
    public void setordername(String orderName){
        this.orderName = orderName;
    }

    public String getcustId(){
        return custId;
    }
    
    public void setcustId(String custId){
        this.custId = custId;
    }
    
    public String getcustomerName(){
        return customerName;
    }
    
    public void setcustomerName(String customerName){
        this.customerName = customerName;
    }
    
    public String getcustomerEmail(){
        return customerEmail;
    }
    
    public void setcustomerEmail(String customerEmail){
        this.customerEmail = customerEmail;
    }
    
    public String getdeliveryAddress(){
        return deliveryAddress;
    }
    
    public void setdeliveryAddress(String deliveryAddress){
        this.deliveryAddress = deliveryAddress;
    }

    public int getunitPrice(){
        return unitPrice;
    }
    
    public void setunitPrice(int unitPrice){
        this.unitPrice = unitPrice;
    }
    
    public int getquantity(){
        return quantity;
    }
    
    public void setquantity(int quantity){
        this.quantity = quantity;
    }

    public List<OrderItem> getOrderItems(){
        return items;
    }   
  
    public void setOrderItems(List<OrderItem> items){
        this.items = items;
    }
}
