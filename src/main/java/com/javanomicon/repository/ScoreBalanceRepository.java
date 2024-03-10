package com.javanomicon.repository;

import com.javanomicon.entity.ScoreAroma;
import com.javanomicon.entity.ScoreBalance;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;
public interface ScoreBalanceRepository extends JpaRepository<ScoreBalance, Long> {
    ScoreBalance findByTastingId(Long tastingId);

}