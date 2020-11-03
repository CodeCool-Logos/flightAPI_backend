package com.codecool.flight_api_project.airport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/airports")
@CrossOrigin
public class AirportController {

    @Autowired
    private final AirportRepository airportRepository;

    public AirportController(AirportRepository airportRepository)
    {
        this.airportRepository = airportRepository;
    }
}
