package com.javanomicon.dto;

import java.util.Date;
import java.util.List;

public class TastingDto {
    private Long id;
    private Date tastingDate;
    private Double overallScore;
    private String description;
    private List<FlavorDto> flavors;
    private BrewDetailDto brewDetail;
    private ScoreDto scoreAcidity;
    private ScoreDto scoreAroma;
    private ScoreDto scoreBalance;
    private ScoreDto scoreBody;
    private ScoreDto scoreFinish;
    private ScoreDto scoreFlavor;
    private ScoreDto scoreRoast;
    private ScoreDto scoreSweetness;
    private List<CoffeeDetailDto> coffeeDetails;

}
