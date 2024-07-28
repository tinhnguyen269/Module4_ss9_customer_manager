package com.example.customer_manager.services;

import com.example.customer_manager.models.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();

    void save(Customer customer);

    Customer findById(int id);

    void remove(int id);
}
