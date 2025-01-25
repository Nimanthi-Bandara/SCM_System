package com.Project.SCM_System.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Project.SCM_System.Model.Parcel;
import com.Project.SCM_System.Service.Impl.ParcelService;
import com.Project.SCM_System.enums.ParcelStatus;

@RestController
@RequestMapping("/api/parcels")
public class ParcelController {
    @Autowired
    private ParcelService parcelService;

    @PostMapping
    public ResponseEntity<Parcel> createParcel(@RequestBody Parcel parcel) {
        return ResponseEntity.ok(parcelService.createParcel(parcel));
    }

    @PutMapping("/{trackingNumber}/status")
    public ResponseEntity<Parcel> updateStatus(
            @PathVariable String trackingNumber,
            @RequestParam ParcelStatus status,
            @RequestParam String description,
            @RequestParam String location) {
        return ResponseEntity.ok(
            parcelService.updateParcelStatus(trackingNumber, status, description, location)
        );
    }

    @GetMapping("/{trackingNumber}")
    public ResponseEntity<Parcel> getParcelStatus(@PathVariable String trackingNumber) {
        return ResponseEntity.ok(parcelService.getParcelStatus(trackingNumber));
    }
}
