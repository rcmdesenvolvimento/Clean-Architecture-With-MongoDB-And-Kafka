package com.rcm.sistemas.cleanarch.core.usecase.impl;

import com.rcm.sistemas.cleanarch.core.dataprovider.FindAddressByZipCode;
import com.rcm.sistemas.cleanarch.core.dataprovider.UpdateCustomer;
import com.rcm.sistemas.cleanarch.core.domain.Customer;
import com.rcm.sistemas.cleanarch.core.usecase.FindCustomerByIdUseCase;
import com.rcm.sistemas.cleanarch.core.usecase.UpdateCustomerUseCase;

public class UpdateCustomerUseCaseImpl implements UpdateCustomerUseCase{

    private final FindCustomerByIdUseCase findCustomerByIdUseCase;

    private final FindAddressByZipCode findAddressByZipCode;

    private final UpdateCustomer updateCustomer;

    public UpdateCustomerUseCaseImpl(FindCustomerByIdUseCase findCustomerByIdUseCase,
                                     FindAddressByZipCode findAddressByZipCode,
                                     UpdateCustomer updateCustomer) {
        this.findCustomerByIdUseCase = findCustomerByIdUseCase;
        this.findAddressByZipCode = findAddressByZipCode;
        this.updateCustomer = updateCustomer;
    }


    @Override
    public void update(Customer customer, String zipCode) {
        findCustomerByIdUseCase.find(customer.getId());
        var address = findAddressByZipCode.find(zipCode);
        customer.setAddress(address);
        updateCustomer.update(customer);
    }
}
