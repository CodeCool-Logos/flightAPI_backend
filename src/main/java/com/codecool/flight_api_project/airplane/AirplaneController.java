package com.codecool.flight_api_project.airplane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/airplanes")
@CrossOrigin
@Service
public class AirplaneController {

    @Autowired
    private final AirplaneService airplaneService;

    public AirplaneController(AirplaneService airplaneService)
    {
        this.airplaneService = airplaneService;
    }

    @GetMapping
    public List<Airplane> allAirplanes(){
        return airplaneService.allAirplanes();
    }

    @PostMapping
    public void addAirplane(@RequestBody Airplane airplane)
    {
        airplaneService.addAirplane(airplane);
    }
}
