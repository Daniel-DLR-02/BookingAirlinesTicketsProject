package com.example.airlinestickets;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import com.example.airlinestickets.model.Travel;
import com.example.airlinestickets.model.Traveller;
import com.example.airlinestickets.service.TravelService;
import com.example.airlinestickets.service.TravellerService;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.Date;

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



        Travel travel = Travel.builder()
        .airlineName("Iberia").
        departLocation("Sevilla")
        .destinyLocation("Madrid")
        .scales("dubai")
        .whether("rainy")
        .schedule("3:30-4:30")
        .travelDate(LocalDate.of(2022,12,16))
        .build();
        
        travelService.saveTravel(travel);
        Travel travel1 = Travel.builder()
                .airlineName("Iberia").
                departLocation("Madrid")
                .destinyLocation("Barcelona")
                .travelType("return")
                .scales("dubai")
                .whether("rainy")
                .schedule("3:30-4:30")
                .travelDate(LocalDate.of(2022,12,16))
                .build();

        travelService.saveTravel(travel);

        Travel travel2 = Travel.builder()
                .airlineName("Iberia").
                departLocation("Berlin")
                .destinyLocation("Atenas")
                .scales("dubai")
                .whether("rainy")
                .schedule("3:30-4:30")
                .travelDate(LocalDate.of(2022,12,16))
                .build();

        travelService.saveTravel(travel);

        Travel travel3 = Travel.builder()
                .airlineName("Iberia").
                departLocation("Oporto")
                .destinyLocation("Malaga")
                .scales("dubai")
                .whether("rainy")
                .travelType("return")
                .schedule("3:30-4:30")
                .travelDate(LocalDate.of(2022,12,16))
                .build();

        travelService.saveTravel(travel);
        travelService.saveTravel(travel1);
        travelService.saveTravel(travel2);
        travelService.saveTravel(travel3);





        //INSERT INTO ESTACION(ID,FECHA_APERTURA,PRECIO_GASOIL95OCTANOS,PRECIO_GASOIL_ESPECIAL,PRECIO_GASOIL_NORMAL,PRECIO_GASOLINA98,SERVICIOS,TIENE_AUTOLAVADO,UBICACION)
        //       VALUES (1,null,5.0,null,3.0,null,null,null,null);
    }
}