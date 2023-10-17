package com.myapp.controller;


import com.myapp.model.Address;
import com.myapp.model.AddressDto;
import com.myapp.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    AddressService addressService;

    @GetMapping("/empId/{id}")
    public AddressDto getByEmployeeId(@PathVariable("id") int id){

        return addressService.getByEmployeeId(id);
    }
    @GetMapping("getAll")
    public List<AddressDto> getAllAddress(){

        return addressService.getAllAddress();
    }

    @PostMapping("/add")
    public String addAddress(@RequestBody  AddressDto addressDto){

        return addressService.addAddress(addressDto);
    }
    @PutMapping("/update")
    public String updateAddress(@RequestBody  AddressDto addressDto){

        return addressService.updateAddress(addressDto);
    }

}
