package com.Project.SCM_System.Model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.Project.SCM_System.enums.ParcelStatus;

@Document(collection = "parcels")

public class Parcel {
    @Id
    private String id;
    private String trackingNumber;
    private String receiverName;
    private String deliveryAddress;
    private String recipientEmail;
    private ParcelStatus status;
    private List<ParcelStatusUpdate> statusUpdates;
    private LocalDateTime createdAt;
    private LocalDateTime estimatedDeliveryDate;

    public Parcel() {
        this.createdAt = LocalDateTime.now();
        this.status = ParcelStatus.CREATED;
        this.statusUpdates = new ArrayList<>();
    }

    public String getId() { 
        return id; 
    }
    
    public void setId(String id) { 
        this.id = id; 
    }

    public String getTrackingNumber() { 
        return trackingNumber; 
    }

    public void setTrackingNumber(String trackingNumber) { 
        this.trackingNumber = trackingNumber; 
    }

    public String getReceiverName() { 
        return receiverName; 
    }

    public void setReceiverName(String receiverName) { 
        this.receiverName = receiverName; 
    }

    public String getDeliveryAddress() { 
        return deliveryAddress; 
    }

    public void setDeliveryAddress(String deliveryAddress) { 
        this.deliveryAddress = deliveryAddress; 
    }

    public String getRecipientEmail() { 
        return recipientEmail; 
    }

    public void setRecipientEmail(String recipientEmail) { 
        this.recipientEmail = recipientEmail; 
    }

    public ParcelStatus getStatus() { 
        return status; 
    }

    public void setStatus(ParcelStatus status) { 
        this.status = status; 
    }

    public List<ParcelStatusUpdate> getStatusUpdates() { 
        return statusUpdates; 
    }

    public void setStatusUpdates(List<ParcelStatusUpdate> statusUpdates) { 
        this.statusUpdates = statusUpdates; 
    }

    public LocalDateTime getCreatedAt() { 
        return createdAt; 
    }

    public void setCreatedAt(LocalDateTime createdAt) { 
        this.createdAt = createdAt; 
    }

    public LocalDateTime getEstimatedDeliveryDate() { 
        return estimatedDeliveryDate; 
    }

    public void setEstimatedDeliveryDate(LocalDateTime estimatedDeliveryDate) { 
        this.estimatedDeliveryDate = estimatedDeliveryDate; 
    }


}
