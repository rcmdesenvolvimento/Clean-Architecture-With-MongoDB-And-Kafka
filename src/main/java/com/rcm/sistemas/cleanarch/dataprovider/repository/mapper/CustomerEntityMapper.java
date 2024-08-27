package com.rcm.sistemas.cleanarch.dataprovider.repository.mapper;

import com.rcm.sistemas.cleanarch.core.domain.Customer;
import com.rcm.sistemas.cleanarch.dataprovider.repository.entity.CustomerEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);

    Customer toCustomer(CustomerEntity customerEntity);

}
