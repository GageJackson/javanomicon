package com.javanomicon.repository;

import com.javanomicon.entity.ScoreRoast;
import com.javanomicon.entity.ScoreSweetness;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

public interface ScoreSweetnessRepository extends JpaRepository<ScoreSweetness, Long> {
    ScoreSweetness findByTastingId(Long tastingId);

}