package com.ascii274.docker;

import com.ascii274.docker.entity.Customer;
import com.ascii274.docker.repository.CustomerRepository;
import com.ascii274.docker.repository.CustomerService;
import com.ascii274.docker.repository.CustomerServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
public class CustomerRepositoryIntegrationTest {

    @TestConfiguration
    static class CustomerRepositoryIntegrationTestContextConfiguration{

        @Bean
        public CustomerService customerService(){
            return new CustomerServiceImpl();
        }
    }

    @Autowired
    private CustomerService customerService;

    @MockBean
    private  CustomerRepository customerRepository;

    @Before
    public void setUp(){
        Customer customer = new Customer(2000L,
                "Joel",
                "JCS",
                "Gran Via",
                "Barcelona",
                "08036",
                "Spain");
        Mockito.when(customerRepository.findByCustomerId(customer.getCustomerId()))
                .thenReturn(customer);
    }

    @Test
    public void whenValidCustomerId_thenCustomerShouldBeFound(){

        Long customerId = 2000L;
        Customer found = customerService.getCustomerByCustomerId(customerId);
        assertThat(found.getCustomerId())
                .isEqualTo(customerId);
    }

    @Test
    public void whenValidCustomerName_thenCustomerShouldBeFound(){
        Long customerId = 2000L;
        String name = "Joel";
        Customer found = customerService.getCustomerByCustomerId(customerId);
        assertThat(found.getCustomerName())
                .isEqualTo(name);
    }

    @Test
    public void whenValidAddress_thenCustomerShouldBeFound(){
        Long customerId = 2000L;
        String address = "Gran Via";
        Customer found = customerService.getCustomerByCustomerId(customerId);
        assertThat(found.getAddress())
                .isEqualTo(address);
    }

}
