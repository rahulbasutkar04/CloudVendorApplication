package com.example.CloudVendorAPI.controller;


import com.example.CloudVendorAPI.model.CloudVendor;
import com.example.CloudVendorAPI.service.CloudVendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {

    CloudVendorService cloudVendorService;

    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(@PathVariable("vendorId") String vendorId)
    {
         return  cloudVendorService.getCloudVendor(vendorId);
    }
    // read all vendor data
    @GetMapping()
    public List<CloudVendor> getCloudVendorDetails()
    {
         return  cloudVendorService.getAllCloudVendors();
    }

    @PostMapping("")
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        return  cloudVendorService.createCloudVendor(cloudVendor);

    }

    @PutMapping()
    public String  updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){

      return  cloudVendorService.updateCloudVendor(cloudVendor);
    }

    @DeleteMapping("/{vendorId}")
    public  String deleteVendorDetails(@PathVariable("vendorId") String vendorId)
    {

        return cloudVendorService.deleteCloudVendor(vendorId);

    }
}
