package com.javanomicon.dto;

import lombok.Data;

@Data
public class CoffeeDetailDto {
    private Long id;
    private Boolean isSingleOrigin;
    private Boolean isDecaf;
    private String coffeeCountry;
    private String coffeeRegion;
    private String coffeeProcess;
}
