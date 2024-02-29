package com.javanomicon.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "tastings")
@Data
public class Tasting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "tasting_date")
    private Date tastingDate;
    @Column(name = "overall_score")
    private Double overallScore;
    @Column(name = "description")
    private String description;
    @Column(name = "user_id")
    private Long userId;
}