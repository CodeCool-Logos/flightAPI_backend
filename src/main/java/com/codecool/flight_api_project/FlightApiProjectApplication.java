package com.codecool.flight_api_project;
import com.codecool.flight_api_project.airport.AirportModel;
import com.codecool.flight_api_project.airport.AirportRepository;
import com.codecool.flight_api_project.city.CityModel;
import com.codecool.flight_api_project.city.CityRepository;
import com.codecool.flight_api_project.flight.FlightModel;
import com.codecool.flight_api_project.flight.FlightRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication
public class FlightApiProjectApplication
{

    public static FlightModel flightModel = new FlightModel("btf1308", "buc", "arad",
            new Date(120 , Calendar.OCTOBER, 10),new Date(120, Calendar.NOVEMBER, 11),
            45, 564);

    public static AirportModel airportModel = new AirportModel("Otopeni","OTP","Bucuresti",Arrays.asList(flightModel));

    public static CityModel cityModel = new CityModel("Rome", Arrays.asList(airportModel), "Italy");

    public static void main(String[] args)
    {


        FlightRepository fr = new FlightRepository();
        fr.insertFlight(flightModel);
        AirportRepository ar =  new AirportRepository();
        ar.insertAirport(airportModel);
        CityRepository cr = new CityRepository();
        cr.insertCity(cityModel);
        SpringApplication.run(FlightApiProjectApplication.class, args);
    }

}
