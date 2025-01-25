package com.Project.SCM_System.Model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.Project.SCM_System.enums.orderStatus;

@Document(collection = "orders")

public class Order {
   @Id
   private String orderId;
   private String orderNumber;
   private String orderName;
   private String custId;
   private String customerName;
   private String customerEmail;
   private String deliveryAddress;
   private LocalDateTime orderDate;
   private int totalAmount;
   private int unitPrice;
   private int quantity;
   private orderStatus status; //orderStatus enum class
   private String trackingNumber;
   private LocalDateTime estimatedCompletionDate;
   private LocalDateTime actualCompletionDate;
   private List<ProductionUpdate> productionUpdates;
   private List<OrderItem> items;

   public Order() {
        this.orderDate = LocalDateTime.now();
        this.status = orderStatus.ORDER_RECEIVED;
        this.productionUpdates = new ArrayList<>();
        this.items = new ArrayList<>();
    }

   public String getorderId(){
    return orderId;
   }

   public void setorderId(String orderId){
    this.orderId = orderId;
   }

   public String getorderNumber(){
      return orderNumber;
  }

  public void setorderNumber(String orderNumber){
      this.orderNumber = orderNumber;
  }

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

   public LocalDateTime getorderDate(){
      return orderDate;
   }

   public void setorderDate(LocalDateTime orderDate){
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

   public orderStatus getstatus(){
      return status;
   }

   public void setstatus(orderStatus status){
      this.status = status;
   }

   public String gettrackingNumber(){
      return trackingNumber;
   }

   public void settrackingNumber(String trackingNumber){
      this.trackingNumber = trackingNumber;
   }

   public LocalDateTime getestimatedCompletionDate(){
      return estimatedCompletionDate;
   }

   public void setestimatedCompletionDate(LocalDateTime estimatedCompletionDate){
      this.estimatedCompletionDate = estimatedCompletionDate;
   }

   public LocalDateTime actualCompletionDate(){
      return actualCompletionDate;
   }

   public void setactualCompletionDate(LocalDateTime actualCompletionDate){
      this.actualCompletionDate = actualCompletionDate;
   }

   public List<ProductionUpdate> productionUpdates(){
      return productionUpdates;
   }

   public void setproductionUpdates(List<ProductionUpdate> productionUpdates){
      this.productionUpdates = productionUpdates;
   }

   public List<OrderItem> getOrderItems(){
      return items;
   }   

   public void setOrderItems(List<OrderItem> items){
      this.items = items;
   }


   public void addProductionUpdate(ProductionUpdate update) {
      if (this.productionUpdates == null) {
       this.productionUpdates = new ArrayList<>();
   }
      this.productionUpdates.add(update);
   }

   public void calculateTotalAmount() {
      this.totalAmount = this.unitPrice * this.quantity;
   }

}
