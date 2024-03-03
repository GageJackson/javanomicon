package com.javanomicon.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "coffee_details")
@Data
public class CoffeeDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "is_single_origin")
    private Boolean isSingleOrigin;
    @Column(name = "is_decaf")
    private Boolean isDecaf;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "coffee_region_id", nullable = false)
    private CoffeeRegion coffeeRegion;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "coffee_process_id", nullable = false)
    private CoffeeProcess coffeeProcess;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "coffee_id", nullable = false)
    private Coffee coffee;
}