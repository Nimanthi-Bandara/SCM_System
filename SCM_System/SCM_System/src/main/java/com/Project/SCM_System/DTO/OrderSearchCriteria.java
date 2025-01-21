package com.Project.SCM_System.DTO;

import com.Project.SCM_System.enums.orderStatus;

public class OrderSearchCriteria {
    private String custId;
    private orderStatus status;
    private String startDate;
    private String endDate;

    public String getcustId(){
        return custId;
    }

    public void setcustId(String custId){
        this.custId = custId;
    }

    public orderStatus getstatus(){
        return status;
    }

    public void setstatus(orderStatus status){
        this.status = status;
    }

    public String getstartDate(){
        return startDate;
    }

    public void setstartDate(String startDate){
        this.startDate = startDate;
    }

    public String getendDate(){
        return endDate;
    }

    public void setendDate(String endDate){
        this.endDate = endDate;
    }
}
