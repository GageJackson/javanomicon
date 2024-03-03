package com.javanomicon.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "coffees")
@Data
public class Coffee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;

    @OneToOne
    @JoinColumn(name = "tasting_id", nullable = false)
    private Tasting tasting;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "coffee")
    List<CoffeeDetail> coffeeDetails;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "coffee_roaster_id", nullable = false)
    private CoffeeRoaster coffeeRoaster;
}