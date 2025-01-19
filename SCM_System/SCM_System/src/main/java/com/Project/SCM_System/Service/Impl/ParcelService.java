package com.Project.SCM_System.Service.Impl;

import java.time.LocalDateTime;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project.SCM_System.Model.Parcel;
import com.Project.SCM_System.Model.ParcelStatusUpdate;
import com.Project.SCM_System.Repository.ParcelRepository;
import com.Project.SCM_System.enums.ParcelStatus;

@Service

public class ParcelService {
     @Autowired
    private ParcelRepository parcelRepository;

    public Parcel createParcel(Parcel parcel) {
        // Generate tracking number
        parcel.setTrackingNumber(generateTrackingNumber());
        
        // Set estimated delivery date (3 days from now)
        parcel.setEstimatedDeliveryDate(LocalDateTime.now().plusDays(3));
        
        // Add initial status update
        parcel.getStatusUpdates().add(
            new ParcelStatusUpdate(
                ParcelStatus.CREATED,
                "Parcel created and ready for pickup",
                "Warehouse"
            )
        );

        return parcelRepository.save(parcel);
    }

    public Parcel updateParcelStatus(String trackingNumber, 
                                   ParcelStatus newStatus, 
                                   String description, 
                                   String location) {
        Parcel parcel = parcelRepository.findByTrackingNumber(trackingNumber)
            .orElseThrow(() -> new RuntimeException("Parcel not found"));

        parcel.setStatus(newStatus);
        parcel.getStatusUpdates().add(
            new ParcelStatusUpdate(newStatus, description, location)
        );

        return parcelRepository.save(parcel);
    }

    public Parcel getParcelStatus(String trackingNumber) {
        return parcelRepository.findByTrackingNumber(trackingNumber)
            .orElseThrow(() -> new RuntimeException("Parcel not found"));
    }

    private String generateTrackingNumber() {
        return "TRK" + System.currentTimeMillis() + 
               String.format("%04d", new Random().nextInt(10000));
    }
}
