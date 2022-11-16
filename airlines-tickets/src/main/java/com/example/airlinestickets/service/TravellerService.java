package com.example.airlinestickets.service;

import org.springframework.stereotype.Service;

import com.example.airlinestickets.model.Traveller;

@Service
public interface TravellerService {
    public Traveller saveTraveller(Traveller traveller);
}
