package com.ascii274.docker.controller;

import com.ascii274.docker.repository.CustomerRepository;
import com.ascii274.docker.entity.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/v1")
public class CustomerController {
    private static final Logger log = LoggerFactory.getLogger((CustomerController.class));
    private final CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    @GetMapping(value = "/list-all")
    @ResponseBody
    public List<Customer> listAllCustomer(){
        List<Customer> customers = new ArrayList<>();
        customerRepository.findAll().forEach(customers::add);
        return customers;
    }


    @GetMapping(value = "/hello")
    @ResponseBody
    public String helloDocker(){
        return "Hello Docker";
    }

    @GetMapping(value = "/hello/{name}")
    public ResponseEntity<String> greet(@PathVariable("name") String  name){
        return new ResponseEntity<>("Hello " + name, HttpStatus.OK);
    }


}
