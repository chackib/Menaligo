package com.dana.menalingo.entities;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "addresses")
@Data
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String street;
    private String city;
    private String zipCode;

    // Add any additional attributes, getters, setters, and methods if needed
}
