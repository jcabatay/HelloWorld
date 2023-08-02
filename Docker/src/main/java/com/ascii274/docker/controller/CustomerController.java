package com.ascii274.docker.controller;

import com.ascii274.docker.application.CustomerApplicationImp;
import com.ascii274.docker.mapper.dto.CustomerDto;
import com.ascii274.docker.entity.Customer;
import com.ascii274.docker.repository.CustomerRepository;
import com.ascii274.docker.repository.CustomerRepositoryImp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/v1")
public class CustomerController {

    private static final Logger log = LoggerFactory.getLogger((CustomerController.class));
    @Autowired
    CustomerRepositoryImp customerRepositoryImp;

//    @Autowired
//    public CustomerController(final CustomerApplicationImp customerApplicationImp) {
//        this.customerApplicationImp = customerApplicationImp;
//    }


    @GetMapping(value = "/getall")
    public ResponseEntity<?> getAllCustomer() {
        List<Customer> customers = customerRepositoryImp.findAll();
        return ResponseEntity.status(200).body(customers);
    }


    @PostMapping("/add")
    public ResponseEntity<Customer> addCustomer(@RequestBody Customer newCustomer){
        customerRepositoryImp.save(newCustomer);
        return ResponseEntity.status(200).body(newCustomer);
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
