package com.rcm.sistemas.cleanarch.dataprovider;

import com.rcm.sistemas.cleanarch.core.dataprovider.FindAddressByZipCode;
import com.rcm.sistemas.cleanarch.core.domain.Address;
import com.rcm.sistemas.cleanarch.dataprovider.client.FindAddressByZipCodeClient;
import com.rcm.sistemas.cleanarch.dataprovider.client.mapper.AddressResponseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeImpl implements FindAddressByZipCode {

    @Autowired
    private FindAddressByZipCodeClient findAddressByZipCodeClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipcode) {
        var AddressResponse = this.findAddressByZipCodeClient.find(zipcode);
        return addressResponseMapper.toAddress(AddressResponse);
    }
}
