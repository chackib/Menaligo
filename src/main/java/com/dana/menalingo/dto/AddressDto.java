package com.dana.menalingo.dto;

import lombok.Data;

@Data
public class AddressDto {

    private Long id;
    private String street;
    private String city;
    private String postalCode;
    private String country;
}
