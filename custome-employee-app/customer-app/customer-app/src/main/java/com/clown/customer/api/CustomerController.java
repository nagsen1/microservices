package com.clown.customer.api;

import com.clown.customer.model.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;

public class CustomerController {

    @GetMapping("/customers")
    public List<Customer> getAllCustomers(){

        return Arrays.asList(new Customer(1, "Prince", "Nagsen"));

    }

    @GetMapping("/customers/{id}")
    public Customer getCustomer(int empId){
        return new Customer(empId, "Sonal", "Nagsen");
    }

    @PostMapping("/customers")
    public void createCustomer(){

    }
}
