package com.javanomicon.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "score_sweetness")
@Data
public class ScoreSweetness {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "quality")
    private Double quality;
    @Column(name = "quantity")
    private Double quantity;

    @OneToOne
    @JsonIgnore
    @JoinColumn(name = "tasting_id", nullable = false)
    private Tasting tasting;
}
