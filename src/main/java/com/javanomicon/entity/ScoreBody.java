package com.javanomicon.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "score_body")
@Data
public class ScoreBody {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "quality")
    private Double quality;
    @Column(name = "quantity")
    private Double quantity;
    @Column(name = "tasting_id")
    private Long tastingId;
}
