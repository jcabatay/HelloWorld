package com.ascii274.docker.entity;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
//@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Builder
@Table(name="customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("customer_id")
    @Column(name="customer_id",nullable = false)
    private Long customerId;

    @JsonProperty("customer_name")
    @Column(name="customer_name")
    private String customerName;

    @JsonProperty("contact_name")
    @Column(name="contact_name")
    private String contactName;

    @JsonProperty("address")
    @Column(name="address")
    private String address;

    @JsonProperty("city")
    @Column(name="city")
    private String city;

    @JsonProperty("postal_code")
    @Column(name="postal_code")
    private String postalCode;

    @JsonProperty("country")
    @Column(name="country")
    private  String country;

    public Customer(String customerName){
        this.customerName = customerName;
    }

    public Customer(Long customerId, String customerName){
        this.customerId = customerId;
        this.customerName = customerName;
    }


    public Customer(){
        super();
    }


}
