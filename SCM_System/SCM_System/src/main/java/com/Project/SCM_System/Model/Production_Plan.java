package com.Project.SCM_System.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Production_Plan")
public class Production_Plan {
    @Id
    private String OrderId;
    private String OrderName;
    private String Quantity;
    private String EstimatedEndDate;
    private String ActualEndDate;

    public String getOrderId() {
        return OrderId;
    }

    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    public String getOrderName() {
        return OrderName;
    }

    public void setOrderName(String OrderName) {
        this.OrderName = OrderName;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String Quantity) {
        this.Quantity = Quantity;
    }

    public String getEstimatedEndDate() {
        return EstimatedEndDate;
    }

    public void setEstimatedEndDate(String EstimatedEndDate) {
        this.EstimatedEndDate = EstimatedEndDate;

    }

    public String getActualEndDate() {
        return ActualEndDate;
    }

    public void setActualEndDate(String ActualEndDate) {
        this.ActualEndDate = ActualEndDate;
    }
}