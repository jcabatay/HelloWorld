package com.ascii274.docker.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name="customers")
public class Customer {
    @Id
    private Long customer_id;
    @Column(name="customer_name")
    private String customer_name;
    @Column(name="contact_name")
    private String contact_name;
    @Column(name="address")
    private String address;
    @Column(name="city")
    private String city;
    @Column(name="postal_code")
    private int postal_code;
    //    @Column(name="country")
    private  String country;

    public Long getCustomer_id() {
        return customer_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getContact_name() {
        return contact_name;
    }

    public void setContact_name(String contact_name) {
        this.contact_name = contact_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(int postal_code) {
        this.postal_code = postal_code;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customer_id=" + customer_id +
                ", customer_name='" + customer_name + '\'' +
                ", contact_name='" + contact_name + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", postal_code=" + postal_code +
                ", country='" + country + '\'' +
                '}';
    }
}
