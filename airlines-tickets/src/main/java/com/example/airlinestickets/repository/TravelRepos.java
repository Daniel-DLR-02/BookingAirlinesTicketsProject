package com.example.airlinestickets.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.airlinestickets.model.Travel;

public interface TravelRepos extends JpaRepository<Travel,Long> {

    List<Travel> findByDepartLocation(String origin);
    
}
