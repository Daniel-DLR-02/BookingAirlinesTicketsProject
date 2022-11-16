package com.example.airlinestickets.model;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Table(name="travel")
public class Travel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "airline_name")
    private String airlineName;

    @Column(name = "depart_location")
    private String departLocation;

    @Column(name = "destiny_location")
    private String destinyLocation;

    @Column(name = "scales")
    private String scales;

    @Column(name = "travel_type")
    private String travelType;

    @Column(name = "whether")
    private String whether;

    @Column(name = "schedule")
    private String schedule;

    @Column(name = "travel_date")
    private LocalDate travelDate;
}