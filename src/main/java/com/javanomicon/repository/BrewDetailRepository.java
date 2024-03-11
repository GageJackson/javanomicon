package com.javanomicon.repository;

import com.javanomicon.entity.BrewDetail;
import com.javanomicon.entity.Tasting;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;
public interface BrewDetailRepository extends JpaRepository<BrewDetail, Long> {
    BrewDetail findByTastingId(Long tastingId);
    BrewDetail findByTasting(Tasting tasting);

}