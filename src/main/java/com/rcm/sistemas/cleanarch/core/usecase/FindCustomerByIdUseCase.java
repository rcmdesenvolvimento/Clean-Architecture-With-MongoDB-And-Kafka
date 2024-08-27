package com.rcm.sistemas.cleanarch.core.usecase;

import com.rcm.sistemas.cleanarch.core.domain.Customer;

public interface FindCustomerByIdUseCase {

    Customer find(final String id);

}
