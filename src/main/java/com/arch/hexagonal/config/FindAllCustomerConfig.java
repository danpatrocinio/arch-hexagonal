package com.arch.hexagonal.config;

import com.arch.hexagonal.adapters.out.FindAllCustomerAdapter;
import com.arch.hexagonal.application.core.usecase.FindAllCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindAllCustomerConfig {

    @Bean
    public FindAllCustomerUseCase findAllCustomerUseCase(FindAllCustomerAdapter findAllCustomerAdapter) {
        return new FindAllCustomerUseCase(findAllCustomerAdapter);
    }

}
