package com.codecool.flight_api_project.airplane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/airplanes")
@CrossOrigin
@Service
public class AirplaneController {

    @Autowired
    private final AirplaneRepository airplaneRepository;

    public AirplaneController(AirplaneRepository airplaneRepository)
    {
        this.airplaneRepository = airplaneRepository;
    }

}
