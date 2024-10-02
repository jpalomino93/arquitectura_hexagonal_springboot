package com.jpalomino.sample.hexagonal.infra.inputport;

import java.util.List;

import com.jpalomino.sample.hexagonal.domain.Customer;

public interface CustomerInputPort {

    public Customer createCustomer(String name, String country);

    public Customer getById(String customerId);

    public List<Customer> getAll();
    
}
