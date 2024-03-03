package com.javanomicon.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "flavor_secondary")
@Data
public class FlavorSecondary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "flavor_primary_id")
    private Long flavorPrimaryId;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "flavor_primary_id", nullable = false)
    private FlavorPrimary flavorPrimary;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "flavorSecondary")
    List<FlavorTertiary> flavorTertiaryList;
}
