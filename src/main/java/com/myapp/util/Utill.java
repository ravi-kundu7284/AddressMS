package com.myapp.util;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.myapp.model.Address;
import com.myapp.model.AddressDto;

public class Utill {
    public Address addressDtoToAddress(AddressDto addressDto){
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        Address address = mapper.convertValue( addressDto, Address.class);
        return address;
    }
    public AddressDto addressToAddressDto(Address address){
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        AddressDto addressDto = mapper.convertValue(address, AddressDto.class);
        return addressDto;
    }
}
