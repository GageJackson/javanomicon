package com.javanomicon.service;

import com.javanomicon.dto.TastingDto;
import com.javanomicon.entity.*;
import com.javanomicon.repository.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class TastingService {
    private TastingRepository tastingRepository;
    private BrewDetailRepository brewDetailRepository;
    private ScoreAcidityRepository scoreAcidityRepository;
    private ScoreAromaRepository scoreAromaRepository;
    private ScoreBalanceRepository scoreBalanceRepository;
    private ScoreBodyRepository scoreBodyRepository;
    private ScoreFinishRepository scoreFinishRepository;
    private ScoreFlavorRepository scoreFlavorRepository;
    private ScoreRoastRepository scoreRoastRepository;
    private ScoreSweetnessRepository scoreSweetnessRepository;
    private CoffeeDetailRepository coffeeDetailRepository;
    private CoffeeRepository coffeeRepository;
    private TastingFlavorRepository tastingFlavorRepository;
    private FlavorTertiaryRepository flavorTertiaryRepository;

    public TastingService(
        TastingRepository tastingRepository,
        BrewDetailRepository brewDetailRepository,
        ScoreAcidityRepository scoreAcidityRepository,
        ScoreAromaRepository scoreAromaRepository,
        ScoreBalanceRepository scoreBalanceRepository,
        ScoreBodyRepository scoreBodyRepository,
        ScoreFinishRepository scoreFinishRepository,
        ScoreFlavorRepository scoreFlavorRepository,
        ScoreRoastRepository scoreRoastRepository,
        ScoreSweetnessRepository scoreSweetnessRepository,
        CoffeeDetailRepository coffeeDetailRepository,
        CoffeeRepository coffeeRepository,
        TastingFlavorRepository tastingFlavorRepository,
        FlavorTertiaryRepository flavorTertiaryRepository
    ) {
        this.tastingRepository = tastingRepository;
        this.brewDetailRepository = brewDetailRepository;
        this.scoreAcidityRepository = scoreAcidityRepository;
        this.scoreAromaRepository = scoreAromaRepository;
        this.scoreBalanceRepository = scoreBalanceRepository;
        this.scoreBodyRepository = scoreBodyRepository;
        this.scoreFinishRepository = scoreFinishRepository;
        this.scoreFlavorRepository = scoreFlavorRepository;
        this.scoreRoastRepository = scoreRoastRepository;
        this.scoreSweetnessRepository = scoreSweetnessRepository;
        this.coffeeDetailRepository = coffeeDetailRepository;
        this.coffeeRepository = coffeeRepository;
        this.tastingFlavorRepository = tastingFlavorRepository;
        this.flavorTertiaryRepository = flavorTertiaryRepository;
    }

    public Tasting getTasting (Long tastingId) throws Exception {
        Optional<Tasting> tasting = tastingRepository.findById(tastingId);



        return tasting.get();
    }

    public List<TastingDto> getAllTastings (Long userId) throws Exception {
        List<TastingDto> allTastingDtos = new ArrayList<>();
        List<Tasting> allTastings = tastingRepository.findByUserId(userId);

        for (Tasting tasting : allTastings) {
            TastingDto tastingDto = new TastingDto();
            tastingDto.setId(tasting.getId());
            tastingDto.setTastingDate(tasting.getTastingDate());
            tastingDto.setDescription(tasting.getDescription());
            tastingDto.setOverallScore(tasting.getOverallScore());

            ScoreAcidity scoreAcidity = scoreAcidityRepository.findByTasting(tasting);
            tastingDto.setScoreAcidity(scoreAcidity);

            ScoreAroma scoreAroma = scoreAromaRepository.findByTasting(tasting);
            tastingDto.setScoreAroma(scoreAroma);

            ScoreBalance scoreBalance = scoreBalanceRepository.findByTasting(tasting);
            tastingDto.setScoreBalance(scoreBalance);

            ScoreBody scoreBody = scoreBodyRepository.findByTasting(tasting);
            tastingDto.setScoreBody(scoreBody);

            ScoreFinish scoreFinish = scoreFinishRepository.findByTasting(tasting);
            tastingDto.setScoreFinish(scoreFinish);

            ScoreFlavor scoreFlavor = scoreFlavorRepository.findByTasting(tasting);
            tastingDto.setScoreFlavor(scoreFlavor);

            ScoreRoast scoreRoast = scoreRoastRepository.findByTasting(tasting);
            tastingDto.setScoreRoast(scoreRoast);

            ScoreSweetness scoreSweetness = scoreSweetnessRepository.findByTasting(tasting);
            tastingDto.setScoreSweetness(scoreSweetness);

            BrewDetail brewDetail = brewDetailRepository.findByTasting(tasting);
            tastingDto.setBrewDetail(brewDetail);

            Coffee coffee = coffeeRepository.findByTasting(tasting);
            tastingDto.setCoffee(coffee);

            List<TastingFlavor> tastingFlavors = tastingFlavorRepository.findByTasting(tasting);
            List<FlavorTertiary> flavors = new ArrayList<>();
            for (TastingFlavor tastingFlavor : tastingFlavors) {
                flavors.add(tastingFlavor.getFlavorTertiary());
            }
            tastingDto.setFlavors(flavors);
            allTastingDtos.add(tastingDto);
        }
        return allTastingDtos;
    }
}
