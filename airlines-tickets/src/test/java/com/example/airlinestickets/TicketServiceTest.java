package com.example.airlinestickets;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.airlinestickets.model.Travel;
import com.example.airlinestickets.model.Traveller;
import com.example.airlinestickets.model.Dto.TicketDto;
import com.example.airlinestickets.service.TicketService;

@SpringBootTest
public class TicketServiceTest {   

    TicketService ticketService;

    @BeforeAll
    void init(){
        Traveller traveller = Traveller.builder()
        .nameAndSurname("Pepe perez")
        .nationality("English")
        .identification("1234567D")
        .age(20)
        .build();

        Travel travel = Travel.builder()
        .airlineName("Iberia")
        .scales("Madrid")
        .departLocation("Sevilla")
        .destinyLocation("Barcelona")
        .whether("rainy")
        .schedule("2:30-4:30")
        .build();
    }
    /*
    @Test
    void givingPlaceDataAndTravelerData_throwsNewTicket(){
        assertEquals(ticketService.createTicket(traveller,travel),new TicketDto("Pepe perez","Sevilla","Barcelona","Iberia","2:30-4:30"));
    }*/
}
