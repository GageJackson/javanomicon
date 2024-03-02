package com.javanomicon.repository;

import com.javanomicon.entity.ScoreBody;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;
public interface ScoreBodyRepository extends JpaRepository<ScoreBody, Long> {

}