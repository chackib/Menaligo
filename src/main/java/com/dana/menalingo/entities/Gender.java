package com.dana.menalingo.entities;

import jakarta.persistence.*;
import lombok.Data;



@Data
@Entity
@Table(name = "gender")
public class Gender {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "gender_name")
    private String genderName;
}
