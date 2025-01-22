package com.arch.hexagonal.adapters.out;

import com.arch.hexagonal.adapters.out.repository.CustomerRepository;
import com.arch.hexagonal.adapters.out.repository.entity.CustomerEntity;
import com.arch.hexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import com.arch.hexagonal.application.core.domain.Customer;
import com.arch.hexagonal.application.ports.out.FindAllCustomerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class FindAllCustomerAdapter implements FindAllCustomerOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public List<Customer> findAll() {
        List<CustomerEntity> list = customerRepository.findAll();
        return list.stream()
                .map(entity -> customerEntityMapper.toCustomer(entity))
                .collect(Collectors.toList());
    }

}
