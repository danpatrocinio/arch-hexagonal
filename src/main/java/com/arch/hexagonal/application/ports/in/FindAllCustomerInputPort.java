package com.arch.hexagonal.application.ports.in;

import com.arch.hexagonal.application.core.domain.Customer;

import java.util.List;

public interface FindAllCustomerInputPort {

    List<Customer> findAll();

}
