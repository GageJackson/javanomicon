package com.javanomicon.dto;

import com.javanomicon.entity.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class TastingDto {
    private Long id;
    private Date tastingDate;
    private Double overallScore;
    private String description;
    private List<FlavorDto> flavors;
    private BrewDetail brewDetail;
    private ScoreAcidity scoreAcidity;
    private ScoreAroma scoreAroma;
    private ScoreBalance scoreBalance;
    private ScoreBody scoreBody;
    private ScoreFinish scoreFinish;
    private ScoreFlavor scoreFlavor;
    private ScoreRoast scoreRoast;
    private ScoreSweetness scoreSweetness;
    private List<CoffeeDetail> coffeeDetails;

}
