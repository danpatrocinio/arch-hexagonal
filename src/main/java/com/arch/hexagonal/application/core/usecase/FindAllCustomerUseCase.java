package com.arch.hexagonal.application.core.usecase;

import com.arch.hexagonal.application.core.domain.Customer;
import com.arch.hexagonal.application.ports.in.FindAllCustomerInputPort;
import com.arch.hexagonal.application.ports.out.FindAllCustomerOutputPort;

import java.util.List;

public class FindAllCustomerUseCase implements FindAllCustomerInputPort {

    private final FindAllCustomerOutputPort findAllCustomerOutputPort;

    public FindAllCustomerUseCase(FindAllCustomerOutputPort findAllCustomerOutputPort) {
        this.findAllCustomerOutputPort = findAllCustomerOutputPort;
    }

    @Override
    public List<Customer> findAll() {
        return findAllCustomerOutputPort.findAll();
    }
}
