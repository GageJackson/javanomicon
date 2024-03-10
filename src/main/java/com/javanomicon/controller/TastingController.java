package com.javanomicon.controller;
import com.javanomicon.dto.TastingDto;
import com.javanomicon.service.TastingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/api/tastings")
public class TastingController {

    private TastingService tastingService;

    @Autowired
    public TastingController(TastingService tastingService){
        this.tastingService = tastingService;
    }

    @GetMapping("/all")
    public List<TastingDto> getAllTastings (){
        List<TastingDto> allTastings = new ArrayList<>();

        return allTastings;
    }

}