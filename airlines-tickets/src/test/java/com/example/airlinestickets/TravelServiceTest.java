package com.example.airlinestickets;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TravelServiceTest {

    static TravelService travelService;

    @Test
    void reciveFiveOrigins_ThrowsFiveDestination(){
        List<String> destinos = List.of("Sevilla","Malaga","Cordoba","Jaen","Almeria");
        assertEquals(travelService.searchTravelDestination(destinos), List.of("Barcelona","Berlin","Oporto","Atenas","Londres");
    }
    
    @Test
    void reciveLessFiveOrigins_ThrowsMessageError(){
        List<String> destinos = List.of("Sevilla","Malaga","Cordoba","Jaen");
        assertEquals(travelService.searchTravelDestination(destinos),"Al menos debes seleccionar 5 origenes.";
    }

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
    }

    
    
}
