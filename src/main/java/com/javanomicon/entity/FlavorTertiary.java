package com.javanomicon.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "flavor_tertiary")
@Data
public class FlavorTertiary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "flavor_secondary_id", nullable = false)
    private FlavorSecondary flavorSecondary;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "flavorTertiary")
    List<TastingFlavor> tastingFlavors;
}
