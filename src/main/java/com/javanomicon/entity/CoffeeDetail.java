package com.javanomicon.entity;

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
    @Column(name = "region_id")
    private Long regionId;
    @Column(name = "process_id")
    private Long processId;
    @Column(name = "coffee_id")
    private Long coffeeId;
}