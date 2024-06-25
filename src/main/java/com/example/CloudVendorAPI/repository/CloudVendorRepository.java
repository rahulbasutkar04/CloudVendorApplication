package com.example.CloudVendorAPI.repository;

import com.example.CloudVendorAPI.model.CloudVendor;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CloudVendorRepository  extends MongoRepository<CloudVendor,String> {

}
