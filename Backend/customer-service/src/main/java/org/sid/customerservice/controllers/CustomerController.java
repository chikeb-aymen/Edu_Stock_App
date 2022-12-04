package org.sid.customerservice.controllers;

import lombok.AllArgsConstructor;
import org.sid.customerservice.entities.Customer;
import org.sid.customerservice.repository.CustomerRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customers")
@AllArgsConstructor
public class CustomerController {

    private CustomerRepository customerRepository;

    @GetMapping
    public List<Customer> getAllCustomer(){
        return customerRepository.findAll();
    }

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable("id") Long id){
        return customerRepository.findById(id).get();
    }
}
