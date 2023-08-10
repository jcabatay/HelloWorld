package com.ascii274.docker.repository;

import com.ascii274.docker.entity.Customer;

import java.util.List;

public interface CustomerService {

    public Customer getCustomerById(Long customerId);

    public Customer getCustomerByName(String customerName);

    public List<Customer> getAllCustomer();

    public boolean exists (String email);

    public Customer save (Customer customer);
}
