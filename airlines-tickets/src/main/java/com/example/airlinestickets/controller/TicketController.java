package com.example.airlinestickets.controller;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.airlinestickets.service.TravelService;

import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("/ticket")
@RequiredArgsConstructor
public class TicketController {
    
    private final TravelService travelService;



}
