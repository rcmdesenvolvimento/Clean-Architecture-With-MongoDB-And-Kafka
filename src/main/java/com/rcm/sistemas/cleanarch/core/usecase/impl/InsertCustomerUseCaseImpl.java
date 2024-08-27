package com.rcm.sistemas.cleanarch.core.usecase.impl;

import com.rcm.sistemas.cleanarch.core.dataprovider.FindAddressByZipCode;
import com.rcm.sistemas.cleanarch.core.dataprovider.InsertCustomer;
import com.rcm.sistemas.cleanarch.core.domain.Customer;
import com.rcm.sistemas.cleanarch.core.usecase.InsertCustomerUseCase;

public class InsertCustomerUseCaseImpl implements InsertCustomerUseCase {

    private final FindAddressByZipCode findAddressByZipCode; // interface
    private final InsertCustomer insertCustomer; // interface

    public InsertCustomerUseCaseImpl(FindAddressByZipCode findAddressByZipCode,
                                     InsertCustomer insertCustomer ) {
        this.findAddressByZipCode = findAddressByZipCode;
        this.insertCustomer = insertCustomer;
    }

    @Override
    public void insert(Customer customer, String zipCode) {
        var address = findAddressByZipCode.find(zipCode);
        customer.setAddress(address);
        insertCustomer.insert(customer);
    }

}
