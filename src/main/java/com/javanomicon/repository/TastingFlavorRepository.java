package com.javanomicon.repository;

import com.javanomicon.entity.ScoreBody;
import com.javanomicon.entity.Tasting;
import com.javanomicon.entity.TastingFlavor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;
public interface TastingFlavorRepository extends JpaRepository<TastingFlavor, Long> {
    List<TastingFlavor> findByTastingId(Long tastingId);
    List<TastingFlavor> findByTasting(Tasting tasting);

}