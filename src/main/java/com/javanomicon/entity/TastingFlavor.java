package com.javanomicon.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "tasting_flavors")
@Data
public class TastingFlavor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "flavor_tertiary_id", nullable = false)
    private FlavorTertiary flavorTertiary;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "tasting_id", nullable = false)
    private Tasting tasting;
}