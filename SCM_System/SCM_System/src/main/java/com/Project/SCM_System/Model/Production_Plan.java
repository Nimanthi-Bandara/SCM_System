package com.Project.SCM_System.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Production_Plan")
public class Production_Plan {
    @Id
    private String orderId;
    private String orderName;
    private String quantity;
    private String estimatedCompletionDate;
    private String actualCompletionDate;

    public String getorderId() {
        return orderId;
    }

    public void setorderId(String orderId) {
        this.orderId = orderId;
    }

    public String getorderName() {
        return orderName;
    }

    public void setorderName(String orderName) {
        this.orderName = orderName;
    }

    public String getquantity() {
        return quantity;
    }

    public void setquantity(String quantity) {
        this.quantity = quantity;
    }

    public String getestimatedCompletionDate() {
        return estimatedCompletionDate;
    }

    public void setestimatedCompletionDate(String estimatedCompletionDate) {
        this.estimatedCompletionDate = estimatedCompletionDate;

    }

    public String getactualCompletionDate() {
        return actualCompletionDate;
    }

    public void setactualCompletionDate(String actualCompletionDate) {
        this.actualCompletionDate = actualCompletionDate;
    }
}