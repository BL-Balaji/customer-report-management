package com.bridgelabz.controllers;

import com.bridgelabz.entity.Customer;
import com.bridgelabz.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @PostMapping("/add")
    public Customer createUser(@RequestBody Customer customer)
    {
        return customerService.saveDeatils(customer);
    }

    @GetMapping("/getAll")
    public List<Customer> searchAllCustomerDetails()
    {
        return customerService.listOfAllCustomer();
    }

}
