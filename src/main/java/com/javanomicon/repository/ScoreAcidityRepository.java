package com.javanomicon.repository;

import com.javanomicon.entity.ScoreAcidity;
import com.javanomicon.entity.ScoreAroma;
import com.javanomicon.entity.Tasting;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;
public interface ScoreAcidityRepository extends JpaRepository<ScoreAcidity, Long> {
    ScoreAcidity findByTastingId(Long tastingId);
    ScoreAcidity findByTasting(Tasting tasting);


}