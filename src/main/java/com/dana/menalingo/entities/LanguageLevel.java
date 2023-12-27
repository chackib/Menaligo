package com.dana.menalingo.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "language_level")
public class LanguageLevel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "level_name")
    private String levelName;

    // Other attributes, getters, setters, and methods can be added as needed

}
