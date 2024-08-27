package com.rcm.sistemas.cleanarch.core.dataprovider;

import com.rcm.sistemas.cleanarch.core.domain.Address;

public interface    FindAddressByZipCode {
    Address find(final String zipcode);
}
