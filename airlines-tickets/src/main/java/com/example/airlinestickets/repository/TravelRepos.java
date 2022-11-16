package com.example.airlinestickets.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.airlinestickets.model.Travel;
import org.springframework.data.jpa.repository.Query;

public interface TravelRepos extends JpaRepository<Travel,Long> {

    List<Travel> findByDepartLocation(String origin);

    @Query(
            value = "SELECT depart_location FROM travel t GROUP BY depart_location",
            nativeQuery = true)
    List<String> getAllOrigins();
    
}
