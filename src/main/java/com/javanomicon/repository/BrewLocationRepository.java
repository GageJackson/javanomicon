package com.javanomicon.repository;

import com.javanomicon.entity.BrewLocation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;
public interface BrewLocationRepository extends JpaRepository<BrewLocation, Long> {

}