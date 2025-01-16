package com.Project.SCM_System.Model;

import java.time.LocalDateTime;

import com.Project.SCM_System.enums.orderStatus;

public class ProductionUpdate {
    private orderStatus status;
    private String description;
    private LocalDateTime timestamp;
    private String updatedBy;

    public ProductionUpdate(orderStatus status, String description, String updatedBy){
        this.status = status;
        this.description = description;
        this.updatedBy = updatedBy;
        this.timestamp = LocalDateTime.now();
    }

    public orderStatus getstatus(){
        return status;
    }

    public void setstatus(orderStatus status){
        this.status = status;
    }

    public String getdescription(){
        return description;
    }

    public void setdescription(String description){
        this.description = description;
    }

    public LocalDateTime gettimeStamp(){
        return timestamp;
    }

    public void settimeStamp(LocalDateTime timestamp){
        this.timestamp = timestamp;
    }

    public String getupdatedBy(){
        return updatedBy;
    }

    public void setupdatedBy(String updatedBy){
        this.updatedBy = updatedBy;
    }
}
