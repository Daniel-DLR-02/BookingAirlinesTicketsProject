package com.example.airlinestickets;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.example.airlinestickets.exeptions.NotEnoughtDestinationsException;
import com.example.airlinestickets.model.Travel;
import com.example.airlinestickets.repository.TravelRepos;
import com.example.airlinestickets.service.TravelService;
import com.example.airlinestickets.service.impl.TravelServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class TravelServiceTest {


    static ArrayList<String> destinos5 = new ArrayList<>();
    static ArrayList<String> destinos4 = new ArrayList<>();


    @Mock
    private TravelRepos travelRepos;


    @Autowired
    @InjectMocks
    private TravelServiceImpl travelService;

    @BeforeEach
    void init() {
        MockitoAnnotations.initMocks(this);
        destinos4.add("Sevilla");
        destinos4.add("Malaga");
        destinos4.add("Cordoba");
        destinos4.add("Jaen");
        destinos5.add("Sevilla");
        destinos5.add("Malaga");
        destinos5.add("Cordoba");
        destinos5.add("Jaen");
        destinos5.add("Almeria");
        Travel travelPrueba = Travel.builder()
                .airlineName("iberia")
                .departLocation("Sevilla")
                .travelDate(new Date(2022,10,22))
                .schedule("3:30-4:30")
                .scales("323")
                .whether("rainy")
                .destinyLocation("Madrid")
                .build();

        travelRepos.save(travelPrueba);

    }
    @Test
    void reciveFiveOrigins_ThrowsFiveDestination(){

        assertEquals( List.of("Madrid"),travelService.getDestinations(destinos5));

    }

    @Test
    void reciveLessFiveOrigins_ThrowsMessageError(){
        Assertions.assertThrows(NotEnoughtDestinationsException.class, () -> {
            travelService.getDestinations(destinos4);
        });
    }

    /*
    @Test
    void whenQueryOfDayIsDone_ReturnTravelsWithThreedaysOfDifference(){
        // Date date = 19022002 16-20 todos los vuelos posibles
        //Borrar vuelos de dias antes de hoy
        String selectedDate = "2022-11-19";
        SimpleDateFormat date = new SimpleDateFormat(selectedDate);
        List<String> dates = List.of("2022-11-16","2022-11-17","2022-11-18","2022-11-20","2022-11-21","2022-11-22");

        assertEquals(travelService.selectDate(date), date, "Tiene que salir 3 dias por delante y por detras del dia seleccionado");
    }

    @Test
    void filterTheFlightByParameters() {
        List<String> filterByOptions = List.of("airLine","scalse","luggage","schedule");

        assertEquals(travelService.selectFilterOption(filterByOptions), "Tiene que salir por lo menos 1 opción");
    }*/

    
    
}
