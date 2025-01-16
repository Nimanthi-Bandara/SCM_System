package com.Project.SCM_System.DTO;

import java.util.List;

import com.Project.SCM_System.Model.ProductionUpdate;
import com.Project.SCM_System.enums.orderStatus;

public class OrderTrackingInfo {
    private String orderId;
    private String orderNumber;
    private orderStatus status;
    private String orderDate;
    private List<ProductionUpdate> productionUpdates;
    private ParcelStatus parcelStatus;
    private String trackingNumber;

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
    
    public orderStatus getstatus(){
        return status;
    }

    public void setstatus (orderStatus status){
        this.status = status;
    }

    public String getorderDate(){
        return orderDate;
    }

    public void setorderDate(String orderDate){
        this.orderDate = orderDate;
    }

    public List<ProductionUpdate> getproductionUpdates(){
        return productionUpdates;
    }

    public void setproductionUpdates(List<ProductionUpdate> productionUpdates){
        this.productionUpdates = productionUpdates;
    }

    public ParcelStatus getparcelStatus(){
        return parcelStatus;
    }

    public void setparcelStatus(ParcelStatus parcelStatus){
        this.parcelStatus = parcelStatus;
    }

    public String gettrackingNumber(){
        return trackingNumber;
    }

    public void settrackingNumber(String trackingNumber){
        this.trackingNumber = trackingNumber;
    }
}
