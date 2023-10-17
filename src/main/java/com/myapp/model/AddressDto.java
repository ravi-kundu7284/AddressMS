package com.myapp.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressDto {

    private int addressId;
    private int empId;
    private String Street;
    private String Locality;
    private String city;
    private String state;
    private int postalCode;



}
