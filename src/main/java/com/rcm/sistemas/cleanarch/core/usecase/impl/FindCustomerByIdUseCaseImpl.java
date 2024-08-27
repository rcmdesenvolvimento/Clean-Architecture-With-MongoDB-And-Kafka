package com.rcm.sistemas.cleanarch.core.usecase.impl;

import com.rcm.sistemas.cleanarch.core.dataprovider.FindCustomerById;
import com.rcm.sistemas.cleanarch.core.domain.Customer;
import com.rcm.sistemas.cleanarch.core.usecase.FindCustomerByIdUseCase;

public class FindCustomerByIdUseCaseImpl implements FindCustomerByIdUseCase {

    private final FindCustomerById findCustomerById;

    public FindCustomerByIdUseCaseImpl(FindCustomerById findCustomerById) {
        this.findCustomerById = findCustomerById;
    }

    @Override
    public Customer find(String id) {
        return this.findCustomerById.find(id).orElseThrow(() -> new RuntimeException("Customer not found"));
    }
}
