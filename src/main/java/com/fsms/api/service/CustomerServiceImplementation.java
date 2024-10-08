package com.fsms.api.service;

import com.fsms.api.model.Customer;
import com.fsms.api.repositary.CustomerRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImplementation implements CustomerService {

    @Autowired
    private CustomerRepositary customerRepositary;

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepositary.save(customer);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepositary.findAll();
    }
}
