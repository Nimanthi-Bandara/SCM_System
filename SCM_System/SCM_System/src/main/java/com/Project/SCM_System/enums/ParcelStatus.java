package com.Project.SCM_System.enums;

public enum ParcelStatus {
    CREATED("Parcel Created"),
    PICKUP_SCHEDULED("Pickup Scheduled"),
    PICKED_UP("Picked Up"),
    IN_TRANSIT("In Transit"),
    OUT_FOR_DELIVERY("Out for Delivery"),
    DELIVERED("Delivered"),
    FAILED_DELIVERY("Failed Delivery");

    private final String description;

    ParcelStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
