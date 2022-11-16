package com.example.airlinestickets;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import com.example.airlinestickets.model.Travel;
import com.example.airlinestickets.model.Traveller;
import com.example.airlinestickets.service.TravelService;
import com.example.airlinestickets.service.TravellerService;

import javax.annotation.PostConstruct;
import java.time.LocalDate;

@RequiredArgsConstructor
@Component
public class InitData {

    private final TravelService travelService;
    private final TravellerService travellerService;

    @PostConstruct
    public void initData() {

        Traveller traveller = Traveller.builder()
        .nameAndSurname("Pepe perez")
        .nationality("English")
        .identification("1234567D")
        .age(20)
        .build();

        travellerService.saveTraveller(traveller);


        Travel travel = Travel.builder()
        .airlineName("Iberia").
        departLocation("Sevilla")
        .destinyLocation("Madrid")
        .scales("dubai")
        .whether("rainy")
        .schedule("3:30-4:30")
        .build();
        
        travelService.saveTravel(travel);

        //INSERT INTO ESTACION(ID,FECHA_APERTURA,PRECIO_GASOIL95OCTANOS,PRECIO_GASOIL_ESPECIAL,PRECIO_GASOIL_NORMAL,PRECIO_GASOLINA98,SERVICIOS,TIENE_AUTOLAVADO,UBICACION)
        //       VALUES (1,null,5.0,null,3.0,null,null,null,null);
    }
}