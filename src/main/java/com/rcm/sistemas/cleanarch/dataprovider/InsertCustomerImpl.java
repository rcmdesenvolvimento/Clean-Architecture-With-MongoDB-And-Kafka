package com.rcm.sistemas.cleanarch.dataprovider;

import com.rcm.sistemas.cleanarch.core.dataprovider.InsertCustomer;
import com.rcm.sistemas.cleanarch.core.domain.Customer;
import com.rcm.sistemas.cleanarch.dataprovider.repository.CustomerRepository;
import com.rcm.sistemas.cleanarch.dataprovider.repository.mapper.CustomerEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertCustomerImpl implements InsertCustomer {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void insert(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        this.customerRepository.save(customerEntity);
    }
}
