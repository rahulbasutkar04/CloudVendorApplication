package com.example.CloudVendorAPI.service.impl;

import com.example.CloudVendorAPI.exception.CloudVendorNotFoundException;
import com.example.CloudVendorAPI.model.CloudVendor;
import com.example.CloudVendorAPI.repository.CloudVendorRepository;
import com.example.CloudVendorAPI.service.CloudVendorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloudVendorServiceImpl implements CloudVendorService {

    CloudVendorRepository cloudVendorRepository;

    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String deleteCloudVendor(String vendorId) {
        cloudVendorRepository.deleteById(vendorId);
        return "Deleted Successfully";
    }

    @Override
    public CloudVendor getCloudVendor(String vendorId) {
        // exception handing
        if(cloudVendorRepository.findById(vendorId).isEmpty())
            throw new CloudVendorNotFoundException("Requested Cloud Vendor Not Exist");
        return  cloudVendorRepository.findById(vendorId).get();

    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        return  cloudVendorRepository.findAll();

    }
}
