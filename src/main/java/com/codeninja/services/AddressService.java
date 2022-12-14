package com.codeninja.services;

import com.codeninja.DTO.AddressDto;
import com.codeninja.models.Address;

import javax.enterprise.context.ApplicationScoped;
import javax.validation.constraints.NotNull;

@ApplicationScoped
public class AddressService {
    public static Address createFromDto( AddressDto addressDto) {
        return new Address(

                addressDto.getAddress1(),
                addressDto.getAddress2(),
                addressDto.getCity(),
                addressDto.getPostcode(),
                addressDto.getCountry()
        );
    }

    public static AddressDto mapToDto(@NotNull Address address) {
        return new AddressDto(
                address.getAddress1(),
                address.getAddress2(),
                address.getCity(),
                address.getPostcode(),
                address.getCountry()
        );
    }
}