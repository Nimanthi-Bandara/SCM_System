package com.Project.SCM_System.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Shipments")
public class Shipments {
    @Id
    private String OrderId;
    private String ProductId;
    private String ShipmentId;
    private String Status;
    private String TrackingNumber;
    private String ShipmentDate;
    private String AddressLine;
    private String City;
    private String country;
    private String postalCode;

}
