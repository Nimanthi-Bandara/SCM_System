package com.Project.SCM_System.Model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.Project.SCM_System.enums.orderStatus;

@Document(collection = "production_orders")

public class productionOrder {
    @Id
    private String id;
    private String orderNumber;
    private String customerId;
    private String customerName;
    private String customerEmail;
    private String deliveryAddress;
    private List<Order> items; //item class
    private orderStatus status; //enum class
    private String trackingNumber;
    private LocalDateTime orderDate;
    private LocalDateTime estimatedCompletionDate;
    private LocalDateTime actualCompletionDate;
    private List<ProductionUpdate> productionUpdates;

    public productionOrder() {
        this.orderDate = LocalDateTime.now();
        this.status = orderStatus.ORDER_RECEIVED;
        this.productionUpdates = new ArrayList<>();
    }

    public String getid(){
        return id;
    }

    public void setid(String id){
        this.id = id;
    }

    public String getorderNumber(){
        return orderNumber;
    }

    public void setorderNumber(String orderNumber){
        this.orderNumber = orderNumber;
    }

    public String getcustomerId(){
        return customerId;
    }

    public void setcustomerId(String customerId){
        this.customerId = customerId;
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

    public List<Order> getitems(){
        return items;
    }

    public void setItems(List<Order> items){
        this.items = items;
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

    public LocalDateTime getorderdate(){
        return orderDate;
    }

    public void setorderDate(LocalDateTime orderDate){
        this.orderDate = orderDate;
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

    public void setproductionUpdates(List<ProductionUpdates> productionUpdates){
        this.productionUpdates = productionUpdates;
    }

}
