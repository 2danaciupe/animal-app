package com.sda.project.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

// lombok annotations
@Getter
@Setter
@Entity
@Table(name = "pet")
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Category category;
    private String description;

}
