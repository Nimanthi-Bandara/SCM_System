package com.Project.SCM_System.enums;

public enum orderStatus {
    ORDER_RECEIVED("Order Received"), //Initial Status
    IN_PRODUCTION("In Production"), //Manufacturing Started
    PRODUCTION_COMPLETED("Production Completed"), //Manufacturing done
    QUALITY_CHECK("Quality Check"), //QA Checking
    READY_FOR_SHIPPING("Ready For Shipping"), //Ready to ship
    SHIPPED("Shipped"), //In transit
    DELIVERED("Delivered"), //Completed
    CANCELLED("Cancelled"); //Cancelled Order

    private final String description;

    orderStatus(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
}
