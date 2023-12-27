package com.dana.menalingo.entities;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "languages")
@Data
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // Add any additional attributes, getters, setters, and methods if needed
}
