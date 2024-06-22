package com.example.CloudVendorAPI.repository;

import com.example.CloudVendorAPI.model.CloudVendor;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CloudVendorRepository  extends MongoRepository<CloudVendor,String> {
}
