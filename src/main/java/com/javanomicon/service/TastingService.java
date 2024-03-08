package com.javanomicon.service;

import com.javanomicon.entity.Tasting;
import com.javanomicon.repository.TastingRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class TastingService {
    private TastingRepository tastingRepository;

    public TastingService(TastingRepository tastingRepository){
        this.tastingRepository = tastingRepository;
    }

    public Tasting getTasting (Long tastingId) throws Exception {
        Optional<Tasting> tasting = tastingRepository.findById(tastingId);



        return tasting.get();
    }

}
