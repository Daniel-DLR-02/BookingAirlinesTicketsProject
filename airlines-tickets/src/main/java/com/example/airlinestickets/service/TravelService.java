package com.example.airlinestickets.service;

import java.util.List;

import com.example.airlinestickets.model.Travel;

public interface TravelService {

    List<String> getDestinations(List<String> origins);

    List<Travel> getAllTravels();

    Travel saveTravel(Travel travel);
    
}
