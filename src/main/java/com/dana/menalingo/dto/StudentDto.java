package com.dana.menalingo.dto;

import lombok.Data;

import java.util.List;

@Data
public class StudentDto {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private PersonalInfoDto personalInfo;
    private AddressDto address;
    private List<LanguageDto> languages;
}
