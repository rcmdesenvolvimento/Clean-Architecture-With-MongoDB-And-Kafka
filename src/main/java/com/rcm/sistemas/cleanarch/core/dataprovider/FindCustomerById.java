package com.rcm.sistemas.cleanarch.core.dataprovider;

import com.rcm.sistemas.cleanarch.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerById {

    Optional<Customer> find(final String id);
}
