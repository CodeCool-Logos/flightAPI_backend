package com.codecool.flight_api_project.flight;

import com.codecool.flight_api_project.airline.Airline;
import com.codecool.flight_api_project.airport.Airport;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;


@Entity
@Table(name = "Flight")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Flight
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDate date;
    private Long price;
    private LocalTime departureTime;
    private LocalTime arrivalTime;

    @ManyToOne
    @JoinColumn(name = "departure_airport_id")
    private Airport departureAirport;

    @ManyToOne
    @JoinColumn(name = "arrival_airport_id")
    private Airport arrivalAirport;

    @ManyToOne
    @JoinColumn(name = "airline_id")
    private Airline airline;

}
