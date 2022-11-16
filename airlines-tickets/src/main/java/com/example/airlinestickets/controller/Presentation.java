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
public class Presentation {
    
    private final TravelService travelService;

    @PostMapping("/getDestinations")
    public ResponseEntity<List<String>> getDestinations(@RequestBody List<String> origins){
        return ResponseEntity.ok(travelService.getDestinations(origins));
    }


}
