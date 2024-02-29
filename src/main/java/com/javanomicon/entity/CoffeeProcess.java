package com.javanomicon.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "processes")
@Data
public class CoffeeProcess {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
}
