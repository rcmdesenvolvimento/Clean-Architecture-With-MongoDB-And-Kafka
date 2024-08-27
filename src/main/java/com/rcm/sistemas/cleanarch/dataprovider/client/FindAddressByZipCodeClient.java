package com.rcm.sistemas.cleanarch.dataprovider.client;

import com.rcm.sistemas.cleanarch.dataprovider.client.response.Addressresponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name = "FindAddressByZipCodeClient",
        url = "${api.client.address.url}"
)
public interface FindAddressByZipCodeClient {

    @GetMapping("/{zipCode}")
    Addressresponse find(@PathVariable("zipCode") String zipCode);

}
 