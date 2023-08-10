package com.ascii274.docker.repository;

import com.ascii274.docker.entity.Customer;
import io.micrometer.common.lang.NonNullApi;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
@NonNullApi
public interface CustomerRepository extends JpaRepository<Customer,Long> {

    public Customer findByCustomerId(Long customerId);

    public Customer findByCustomerName(String customerName);

    public List<Customer> findAll();

//    public Customer getCustomer(Long customerId);
//    Customer findByCustomerId(Long customerId);
//    List<Customer> findAll();
//    Customer save(Customer newCustomer);
}
