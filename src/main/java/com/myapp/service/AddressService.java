package com.myapp.service;

import com.myapp.model.Address;
import com.myapp.model.AddressDto;
import com.myapp.repository.AddressRepository;
import com.myapp.util.Utill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressService {
    @Autowired
    AddressRepository addressRepository;
    @Autowired
    Utill utill;


    public AddressDto getByEmployeeId(int id){

        return utill.addressToAddressDto(addressRepository.getByEmpId(id));
    }
    public List<AddressDto> getAllAddress(){
        List<Address> addressList=addressRepository.findAll();
        List<AddressDto> addressDtoList=new ArrayList<>();
        addressList.stream().forEach(address -> addressDtoList.add(utill.addressToAddressDto(address)));
        return  addressDtoList;
    }
    public String updateAddress(AddressDto addressDto){

        return  "Address Updated";
    }
    public String addAddress(AddressDto addressDto){
        addressRepository.save(utill.addressDtoToAddress(addressDto));
        return  "Address added";
    }

}
