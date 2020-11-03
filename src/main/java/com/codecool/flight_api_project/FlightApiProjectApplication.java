package com.codecool.flight_api_project;
import com.codecool.flight_api_project.airport.Airport;
import com.codecool.flight_api_project.airport.AirportRepository;
import com.codecool.flight_api_project.flight.Flight;
import com.codecool.flight_api_project.flight.FlightRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.context.ConfigurableApplicationContext;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@EnableSwagger2
@SpringBootApplication
public class FlightApiProjectApplication{

    public static void main(String[] args) throws IOException {

        ConfigurableApplicationContext configurableApplicationContext =
                SpringApplication.run(FlightApiProjectApplication.class, args);

        FlightRepository flightRepository= configurableApplicationContext.getBean(FlightRepository.class);
        AirportRepository airportRepository = configurableApplicationContext.getBean(AirportRepository.class);

        Airport otopeni = new Airport("Otopeni");
        Airport timisoara = new Airport("Timisoara");
        Airport heathrow = new Airport("Heathrow");
        Airport paris = new Airport("Charles de Gaulle");


        Flight flightOtoHeat = new Flight(
                LocalDate.of(2020,11, 1),
                LocalTime.of(6, 30),
                LocalTime.of(8, 30),
                (long) 625,
                otopeni,
                heathrow
        );


        Flight flightOtoPar = new Flight(
                LocalDate.of(2020,11, 1),
                LocalTime.of(6, 30),
                LocalTime.of(8, 30),
                (long) 625,
                otopeni,
                paris
        );

        Flight flightTimHeat = new Flight(
                LocalDate.of(2020,11, 1),
                LocalTime.of(6, 30),
                LocalTime.of(8, 30),
                (long) 625,
                timisoara,
                heathrow
        );

        Flight flightOtopTim = new Flight(
                LocalDate.of(2020,11, 1),
                LocalTime.of(6, 30),
                LocalTime.of(8, 30),
                (long) 625,
                otopeni,
                timisoara
        );




//        plecari.addOutgoingFlights(flightOne);
//        sosiri.addIncomingFlights(flightOne);
        airportRepository.save(otopeni);
        airportRepository.save(heathrow);
        airportRepository.save(paris);
        airportRepository.save(timisoara);

        flightRepository.save(flightOtoHeat);
        flightRepository.save(flightOtoPar);
        flightRepository.save(flightTimHeat);
        flightRepository.save(flightOtopTim);

    }

}
