package com.javanomicon.repository;

import com.javanomicon.entity.ScoreFinish;
import com.javanomicon.entity.Tasting;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

public interface ScoreFinishRepository extends JpaRepository<ScoreFinish, Long> {
    ScoreFinish findByTastingId(Long tastingId);
    ScoreFinish findByTasting(Tasting tasting);


}