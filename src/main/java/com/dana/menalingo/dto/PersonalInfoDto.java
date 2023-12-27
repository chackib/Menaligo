package com.dana.menalingo.dto;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class PersonalInfoDto {

    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String gender;
    private List<String> nationalities;
}
