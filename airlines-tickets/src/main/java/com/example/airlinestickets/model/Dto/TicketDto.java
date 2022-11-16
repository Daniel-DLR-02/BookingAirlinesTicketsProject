package com.example.airlinestickets.model.Dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TicketDto {

    String user;
    String origin;
    String destination;
    String airlineName;
    String schedule;
    Date travelDate;
}
