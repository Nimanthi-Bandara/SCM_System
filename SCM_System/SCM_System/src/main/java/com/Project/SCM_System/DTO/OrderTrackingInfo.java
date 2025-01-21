package com.Project.SCM_System.DTO;

import java.time.LocalDateTime;
import java.util.List;

import com.Project.SCM_System.Model.Parcel;
import com.Project.SCM_System.Model.ProductionUpdate;
import com.Project.SCM_System.enums.ParcelStatus;
import com.Project.SCM_System.enums.orderStatus;

public class OrderTrackingInfo {
    private String orderId;
    private String orderNumber;
    private orderStatus status;
    private LocalDateTime orderDate;
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

    public LocalDateTime getorderDate(){
        return orderDate;
    }

    public void setorderDate(LocalDateTime orderDate){
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

    public void setParcelStatus(Parcel parcelStatus2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setParcelStatus'");
    }
}
