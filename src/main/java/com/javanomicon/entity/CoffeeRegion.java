package com.javanomicon.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "coffee_regions")
@Data
public class CoffeeRegion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "coffeeRegion")
    List<CoffeeDetail> coffeeDetails;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "coffee_country_id", nullable = false)
    private CoffeeCountry coffeeCountry;
}
