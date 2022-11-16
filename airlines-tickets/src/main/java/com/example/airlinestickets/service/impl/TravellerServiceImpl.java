package com.example.airlinestickets.service.impl;

import org.springframework.stereotype.Service;

import com.example.airlinestickets.model.Traveller;
import com.example.airlinestickets.repository.TravellerRepos;
import com.example.airlinestickets.service.TravellerService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TravellerServiceImpl implements TravellerService {

    private final TravellerRepos travellerRepos;
    @Override
    public Traveller saveTraveller(Traveller traveller) {
        return travellerRepos.save(traveller);
    }
    
    
}
