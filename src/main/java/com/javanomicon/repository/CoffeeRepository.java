package com.javanomicon.repository;

import com.javanomicon.entity.Coffee;
import com.javanomicon.entity.Tasting;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;
public interface CoffeeRepository extends JpaRepository<Coffee, Long> {
    Coffee findByTastingId(Long tastingId);
    Coffee findByTasting(Tasting tasting);

}