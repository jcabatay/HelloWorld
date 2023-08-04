package com.ascii274.docker.controller;

import com.ascii274.docker.entity.Customer;
import com.ascii274.docker.repository.CustomerRepositoryImp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/v1")
public class CustomerController {

    private static final Logger log = LoggerFactory.getLogger((CustomerController.class));

    @Autowired
    CustomerRepositoryImp customerRepositoryImp;

     //Functional
    @GetMapping("/search/{id}")
    public ResponseEntity<Customer> search(@PathVariable("id") Long  id){
        Customer newCustomer = new Customer();
        newCustomer = customerRepositoryImp.findByCustomerId(id);
        return ResponseEntity.status(200).body(newCustomer);
    }

    // Functional
    @GetMapping(value = "/getall")
    public ResponseEntity<?> getAllCustomer() {
        List<Customer> customers = customerRepositoryImp.findAll();
        return ResponseEntity.status(200).body(customers);
    }


    // Functional
    @PostMapping("/add")
    public ResponseEntity<Customer> addCustomer(@RequestBody Customer newCustomer){
        customerRepositoryImp.save(newCustomer);
        return ResponseEntity.status(200).body(newCustomer);
    }

    // Functional
    @GetMapping(value = "/hello")
    @ResponseBody
    public String helloDocker(){
        return "Hello Docker";
    }


    // Functional
    @GetMapping(value = "/hello/{name}")
    public ResponseEntity<String> greet(@PathVariable("name") String  name){
        return new ResponseEntity<>("Hello " + name, HttpStatus.OK);
    }


}
