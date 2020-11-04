package com.codecool.flight_api_project.flight;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.standard.Media;
import java.awt.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/flights")
@CrossOrigin
public class FlightController
{
    @Autowired
    private final FlightRepository flightRepository;

    public FlightController(FlightRepository flightRepository)
    {
        this.flightRepository = flightRepository;
    }


    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Flight> getAllFlights(){
//        List<Flight> flights = flightRepository.getAllFlightsFromDb();
//        Hibernate.initialize(flights);
        return flightRepository.getAllFlightsFromDb();
    }

    @GetMapping(path = "/{id}",
                produces = MediaType.APPLICATION_JSON_VALUE)
    public Flight getFlightBy(@PathVariable Long id){
//        Flight flight = flightRepository.getFlightById(id);
//        Hibernate.initialize(flight);
        return flightRepository.getFlightById(id);
    }
}
