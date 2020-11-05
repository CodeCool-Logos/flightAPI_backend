package com.codecool.flight_api_project.airport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/airports")
@CrossOrigin
public class AirportController {

    @Autowired
    private final AirportRepository airportRepository;

    public AirportController(AirportRepository airportRepository){this.airportRepository = airportRepository; }


    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    List<Airport> getAirports(){
        System.out.println(airportRepository.findAll());
        return airportRepository.findAll();
    }
}
