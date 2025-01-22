package com.arch.hexagonal.application.ports.out;

import com.arch.hexagonal.application.core.domain.Customer;

import java.util.List;

public interface FindAllCustomerOutputPort {

    List<Customer> findAll();

}
