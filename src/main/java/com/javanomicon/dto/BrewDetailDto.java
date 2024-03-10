package com.javanomicon.dto;

import lombok.Data;

@Data
public class BrewDetailDto {
    private Long id;
    private String brewLocation;
    private String brewProcess;
    private String brewType;
}
