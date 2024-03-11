package com.javanomicon.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "brew_details")
@Data
public class BrewDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "brew_location_id", nullable = false)
    private BrewLocation brewLocation;

    @ManyToOne
    @JoinColumn(name = "brew_process_id", nullable = false)
    private BrewProcess brewProcess;

    @ManyToOne
    @JoinColumn(name = "brew_type_id", nullable = false)
    private BrewType brewType;

    @OneToOne
    @JsonIgnore
    @JoinColumn(name = "tasting_id", nullable = false)
    private Tasting tasting;
}
