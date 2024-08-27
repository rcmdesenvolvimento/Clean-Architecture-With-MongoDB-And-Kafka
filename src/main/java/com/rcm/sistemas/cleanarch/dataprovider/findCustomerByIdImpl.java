package com.rcm.sistemas.cleanarch.dataprovider;

import com.rcm.sistemas.cleanarch.core.dataprovider.FindCustomerById;
import com.rcm.sistemas.cleanarch.core.domain.Customer;
import com.rcm.sistemas.cleanarch.dataprovider.repository.CustomerRepository;
import com.rcm.sistemas.cleanarch.dataprovider.repository.mapper.CustomerEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class findCustomerByIdImpl implements FindCustomerById {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public Optional<Customer> find(String id) {

        var customerEntity = this.customerRepository.findById(id);

        return customerEntity.map(entity -> this.customerEntityMapper.toCustomer(entity));
    }
}
