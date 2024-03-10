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
        CoffeeDetailRepository coffeeDetailRepository
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
            Long tastingId = tasting.getId();
            tastingDto.setId(tastingId);
            tastingDto.setTastingDate(tasting.getTastingDate());
            tastingDto.setDescription(tasting.getDescription());
            tastingDto.setOverallScore(tasting.getOverallScore());

            ScoreAcidity scoreAcidity = scoreAcidityRepository.findByTastingId(tastingId);
            tastingDto.setScoreAcidity(scoreAcidity);

            ScoreAroma scoreAroma = scoreAromaRepository.findByTastingId(tastingId);
            tastingDto.setScoreAroma(scoreAroma);

            ScoreBalance scoreBalance = scoreBalanceRepository.findByTastingId(tastingId);
            tastingDto.setScoreBalance(scoreBalance);

            ScoreBody scoreBody = scoreBodyRepository.findByTastingId(tastingId);
            tastingDto.setScoreBody(scoreBody);

            ScoreFinish scoreFinish = scoreFinishRepository.findByTastingId(tastingId);
            tastingDto.setScoreFinish(scoreFinish);

            ScoreFlavor scoreFlavor = scoreFlavorRepository.findByTastingId(tastingId);
            tastingDto.setScoreFlavor(scoreFlavor);

            ScoreRoast scoreRoast = scoreRoastRepository.findByTastingId(tastingId);
            tastingDto.setScoreRoast(scoreRoast);

            ScoreSweetness scoreSweetness = scoreSweetnessRepository.findByTastingId(tastingId);
            tastingDto.setScoreSweetness(scoreSweetness);
        }



        return allTastingDtos;
    }

}
