package com.ascii274.docker.repository;

import com.ascii274.docker.entity.Customer;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepository customerRepository;


    @Override
    public Customer getCustomerById(Long customerId) {
        return customerRepository.findByCustomerId(customerId);
    }

    @Override
    public Customer getCustomerByName(String customerName) {
        return customerRepository.findByCustomerName(customerName);
    }

    @Override
    public List<Customer> getAllCustomer() {
        return customerRepository.findAll();
    }

    @Override
    public boolean exists(String name) {
        customerRepository.findByCustomerName(name);
        return true;
    }

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }
}
