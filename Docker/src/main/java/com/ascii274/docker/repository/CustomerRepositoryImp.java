package com.ascii274.docker.repository;

import com.ascii274.docker.entity.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerRepositoryImp {

    private final CustomerRepository customerRepository;

    public CustomerRepositoryImp(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer findByCustomerId(Long customerId){
        return this.customerRepository.findByCustomerId(customerId);
    }

    public List<Customer> findAll(){
//        customerRepository.findAll().forEach(customers::add);
        return new ArrayList<>(customerRepository.findAll());
    }

    public Customer save(Customer newCustomer){
        return this.customerRepository.save(newCustomer);
    }

}
