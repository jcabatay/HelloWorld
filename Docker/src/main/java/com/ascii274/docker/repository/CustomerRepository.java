package com.ascii274.docker.repository;

import com.ascii274.docker.entity.Customer;
import io.micrometer.common.lang.NonNullApi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

//@NonNullApi
@Service
public interface CustomerRepository extends JpaRepository<Customer,Long> {
//    Customer findByCustomerId(Long customerId);
    List<Customer> findAll();
    Customer save(Customer newCustomer);
}
