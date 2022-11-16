package com.example.airlinestickets.service;

import java.util.List;

import com.example.airlinestickets.model.Dto.TravelFilterQuery;
import com.example.airlinestickets.model.Travel;

public interface TravelService {

    List<String> getDestinations(List<String> origins);

    List<Travel> getAllTravels();

    List<String> getPosibleOrigins();

    List<Travel> filterTravels(TravelFilterQuery travelQuery);

    Travel saveTravel(Travel travel);
    
}
