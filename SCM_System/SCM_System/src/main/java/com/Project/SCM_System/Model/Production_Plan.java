package com.Project.SCM_System.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Production_Plan")
public class Production_Plan {
    @Id
    private String PlanId;
    private String TargetQuantity;
    private String StartDate;
    private String EndDate;
    private String ProductId;

    public String getPlanId() {
        return PlanId;
    }

    public void setPlanId(String PlanId) {
        this.PlanId = PlanId;
    }

    public String getTargetQuantity() {
        return TargetQuantity;
    }

    public void setTargetQuantity(String TargetQuantity) {
        this.TargetQuantity = TargetQuantity;
    }

    public String getStartDate() {
        return StartDate;
    }

    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    public String getEndDate() {
        return EndDate;
    }

    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;

    }

    public String getProductId() {
        return ProductId;
    }

    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }
}