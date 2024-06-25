package com.example.CloudVendorAPI.repository;

import com.example.CloudVendorAPI.CloudVendorApiApplication;
import com.example.CloudVendorAPI.model.CloudVendor;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@DataMongoTest
@ContextConfiguration(classes = CloudVendorApiApplication.class)
@TestPropertySource(locations = "classpath:D:\\CloudVendorAPI\\src\\test\\resources\\application.yaml")
class CloudVendorRepositoryTest {

//    @Autowired
//    private CloudVendorRepository cloudVendorRepository;
//
//    private CloudVendor cloudVendor;
//
//    @BeforeEach
//    void setUp() {
//        cloudVendor = new CloudVendor("1", "Amazon", "ISA", "xxx");
//        cloudVendorRepository.save(cloudVendor);
//    }
//
//    @AfterEach
//    void tearDown() {
//        cloudVendorRepository.deleteAll();
//    }
//
//    @Test
//    void shouldBeAbleToGetDataById() {
//        Optional<CloudVendor> foundCloudVendor = cloudVendorRepository.findById("1");
//        assertThat(foundCloudVendor).isPresent();
//        assertThat(foundCloudVendor.get().getVendorId()).isEqualTo(cloudVendor.getVendorId());
//        assertThat(foundCloudVendor.get().getVendorAddress()).isEqualTo(cloudVendor.getVendorAddress());
//    }
}
