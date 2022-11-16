package com.example.airlinestickets.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.example.airlinestickets.exeptions.NotEnoughtDestinationsException;
import org.springframework.stereotype.Service;

import com.example.airlinestickets.model.Travel;
import com.example.airlinestickets.repository.TravelRepos;
import com.example.airlinestickets.service.TravelService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class TravelServiceImpl implements TravelService {

    private final TravelRepos travelRepos;

    @Override
    public List<String> getDestinations(List<String> origins) {
        if(origins.size()>=5){
            List<String> travels = new ArrayList<>();

            for (String origin : origins) {
                List<Travel> travelsWithOrigin = travelRepos.findByDepartLocation(origin);
                for (Travel travel : travelsWithOrigin)
                    travels.add(travel.getDestinyLocation());
            }

            return travels;
        }
        else{
            throw new NotEnoughtDestinationsException("Debe haber seleccionado al menos 5 destinos.");
        }
    }

    @Override
    public Travel saveTravel(Travel travel) {
        return travelRepos.save(travel);
    }

    @Override
    public List<Travel> getAllTravels() {
        return travelRepos.findAll();
    }

    @Override
    public List<String> getPosibleOrigins() {
        return travelRepos.getAllOrigins();
    }

}
