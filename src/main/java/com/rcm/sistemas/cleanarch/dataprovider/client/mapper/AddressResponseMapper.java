package com.rcm.sistemas.cleanarch.dataprovider.client.mapper;

import com.rcm.sistemas.cleanarch.core.domain.Address;
import com.rcm.sistemas.cleanarch.dataprovider.client.response.Addressresponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(Addressresponse addressresponse);

}
