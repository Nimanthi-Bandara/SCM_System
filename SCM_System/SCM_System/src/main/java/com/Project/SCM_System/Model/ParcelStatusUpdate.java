package com.Project.SCM_System.Model;

import java.time.LocalDateTime;

import com.Project.SCM_System.enums.ParcelStatus;

public class ParcelStatusUpdate {
    private ParcelStatus status;
    private String description;
    private String location;
    private LocalDateTime timestamp;

    public ParcelStatusUpdate(ParcelStatus status, String description, String location) {
        this.status = status;
        this.description = description;
        this.location = location;
        this.timestamp = LocalDateTime.now();
    }

    public ParcelStatus getStatus() { 
        return status; 
    }

    public void setStatus(ParcelStatus status) { 
        this.status = status; 
    }

    public String getDescription() { 
        return description; 
    }

    public void setDescription(String description) { 
        this.description = description; 
    }

    public String getLocation() { 
        return location; 
    }

    public void setLocation(String location) { 
        this.location = location; 
    }

    public LocalDateTime getTimestamp() { 
        return timestamp; 
    }

    public void setTimestamp(LocalDateTime timestamp) { 
        this.timestamp = timestamp; 
    }
}
