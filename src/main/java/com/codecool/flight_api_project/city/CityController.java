package com.codecool.flight_api_project.city;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/cities")
@CrossOrigin
@Service
public class CityController {

    @Autowired
    private final CityRepository cityRepository;

    public CityController(CityRepository cityRepository)
    {
        this.cityRepository = cityRepository;
    }

}
