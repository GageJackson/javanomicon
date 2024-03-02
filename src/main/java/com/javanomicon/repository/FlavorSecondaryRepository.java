package com.javanomicon.repository;

import com.javanomicon.entity.FlavorSecondary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;
public interface FlavorSecondaryRepository extends JpaRepository<FlavorSecondary, Long> {

}