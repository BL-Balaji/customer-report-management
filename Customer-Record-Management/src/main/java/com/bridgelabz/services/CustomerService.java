package com.bridgelabz.services;

import com.bridgelabz.entity.Customer;
import com.bridgelabz.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public Customer saveDeatils(Customer customer)
    {
        return customerRepository.save(customer);
    }

    public List<Customer> listOfAllCustomer()
    {
        return customerRepository.findAll();
    }

    public void deleteCustomer(int id) {
        customerRepository.deleteById(id);
    }
}
