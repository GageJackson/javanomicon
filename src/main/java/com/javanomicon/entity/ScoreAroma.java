package com.javanomicon.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "score_aroma")
@Data
public class ScoreAroma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "quality")
    private Double quality;
    @Column(name = "quantity")
    private Double quantity;

    @OneToOne
    @JoinColumn(name = "tasting_id", nullable = false)
    private Tasting tasting;
}
