package com.codecool.flight_api_project.city;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/cities")
@CrossOrigin
@Service
public class CityController {

    @Autowired
    private final CityService cityService;

    public CityController(CityService cityService)
    {
        this.cityService = cityService;
    }

    @GetMapping
    public List<City> allCities(){
        return cityService.allCities();
    }

    @PostMapping
    public void addCity(@RequestBody City city)
    {
        cityService.addCity(city);
    }
}
