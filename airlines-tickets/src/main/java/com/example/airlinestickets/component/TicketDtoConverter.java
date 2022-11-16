package com.example.airlinestickets.component;

import org.springframework.stereotype.Component;

import com.example.airlinestickets.model.Ticket;
import com.example.airlinestickets.model.Travel;
import com.example.airlinestickets.model.Traveller;
import com.example.airlinestickets.model.Dto.TicketDto;

@Component
public class TicketDtoConverter {
    
    public TicketDto TicketToTicketDto(Ticket ticket){
        return TicketDto.builder()
        .user(ticket.getTraveller().getNameAndSurname())
        .origin(ticket.getOrigin())
        .destination(ticket.getDestination())
        .airlineName(ticket.getTravel().getAirlineName())
        .schedule(ticket.getTravel().getSchedule())
        .travelDate(ticket.getTravel().getTravelDate())
        .build();
    }

    public Ticket TicketDtoToTicket(TicketDto ticket,Travel travel,Traveller traveller){
        return Ticket.builder()
        .destination(ticket.getDestination())
        .origin(ticket.getOrigin())
        .destination(ticket.getDestination())
        .traveller(traveller)
        .travel(travel)
        .build();
    }
}
