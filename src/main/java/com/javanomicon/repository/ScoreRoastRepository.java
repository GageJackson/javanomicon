package com.javanomicon.repository;

import com.javanomicon.entity.ScoreFlavor;
import com.javanomicon.entity.ScoreRoast;
import com.javanomicon.entity.Tasting;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

public interface ScoreRoastRepository extends JpaRepository<ScoreRoast, Long> {
    ScoreRoast findByTastingId(Long tastingId);
    ScoreRoast findByTasting(Tasting tasting);


}