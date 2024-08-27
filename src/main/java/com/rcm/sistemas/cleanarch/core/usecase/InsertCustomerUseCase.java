package com.rcm.sistemas.cleanarch.core.usecase;

import com.rcm.sistemas.cleanarch.core.domain.Customer;

public interface InsertCustomerUseCase {
    void insert(Customer customer, String zipCode);
}
