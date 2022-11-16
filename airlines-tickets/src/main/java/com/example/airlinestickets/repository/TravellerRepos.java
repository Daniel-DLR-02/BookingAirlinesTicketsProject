package com.example.airlinestickets.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.airlinestickets.model.Traveller;

public interface TravellerRepos extends JpaRepository<Traveller,Long>{
    
}
