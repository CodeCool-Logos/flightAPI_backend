package com.codecool.flight_api_project.airline;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/airlines")
@CrossOrigin
public class AirlineController {

    @Autowired
    private final AirlineRepository airlineRepository ;

    public AirlineController(AirlineRepository airlineRepository) {
        this.airlineRepository = airlineRepository;
    }
}
