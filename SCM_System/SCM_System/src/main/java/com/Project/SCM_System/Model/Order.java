package com.Project.SCM_System.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Orders")

public class Order {
   @Id
   private String orderId;
   private String custId;
   private String orderDate;
   private int totalAmount;
   private int unitPrice;
   private int quantity;

   public String getorderId(){
    return orderId;
   }

   public void setorderId(String orderId){
    this.orderId = orderId;
   }

   public String getcustId(){
    return custId;
   }

   public void setcustId(String custId){
    this.custId = custId;
   }

   public String getorderDate(){
    return orderDate;
   }

   public void setorderDate(String orderDate){
    this.orderDate = orderDate;
   }

   public int gettotalAmount(){
    return totalAmount;
   }

   public void settotalAmount(int totalAmount){
    this.totalAmount = totalAmount;
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
}
