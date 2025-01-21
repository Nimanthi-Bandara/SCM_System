package com.Project.SCM_System.Repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Project.SCM_System.Model.Parcel;

public interface ParcelRepository extends MongoRepository<Parcel, String>{
    Optional<Parcel> findByTrackingNumber(String trackingNumber);
}
