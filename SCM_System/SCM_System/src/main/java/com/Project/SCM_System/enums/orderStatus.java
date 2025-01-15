package com.Project.SCM_System.enums;

public enum orderStatus {
    ORDER_RECEIVED("Order Received"),
    IN_PRODUCTION("In Production"),
    PRODUCTION_COMPLETED("Production Completed"),
    QUALITY_CHECK("Quality Check"),
    READY_FOR_SHIPPING("Ready For Shipping"),
    SHIPPED("Shipped"),
    DELIVERED("Delivered"),
    CANCELLED("Cancelled");

    private final String description;

    orderStatus(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
}
