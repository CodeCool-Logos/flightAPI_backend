package com.codecool.flight_api_project;
import com.codecool.flight_api_project.airline.Airline;
import com.codecool.flight_api_project.airline.AirlineRepository;
//import com.codecool.flight_api_project.airplane.Airplane;
//import com.codecool.flight_api_project.airplane.AirplaneRepository;
//import com.codecool.flight_api_project.airport.Airport;
//import com.codecool.flight_api_project.airport.AirportRepository;
//import com.codecool.flight_api_project.city.City;
//import com.codecool.flight_api_project.city.CityRepository;
//import com.codecool.flight_api_project.flight.Flight;
//import com.codecool.flight_api_project.flight.FlightRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.test.context.jdbc.Sql;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@EnableSwagger2
@SpringBootApplication
//@Sql("/data.sql")
public class FlightApiProjectApplication{

    public static void main(String[] args) throws IOException {

//        ConfigurableApplicationContext configurableApplicationContext =
                SpringApplication.run(FlightApiProjectApplication.class, args);

//        AirplaneRepository airplaneRepository = configurableApplicationContext.getBean(AirplaneRepository.class);
//        AirportRepository airportRepository = configurableApplicationContext.getBean(AirportRepository.class);
//        CityRepository cityRepository = configurableApplicationContext.getBean(CityRepository.class);
//        AirlineRepository airlineRepository = configurableApplicationContext.getBean(AirlineRepository.class);
//        FlightRepository flightRepository= configurableApplicationContext.getBean(FlightRepository.class);
//
//
//
//
//
//
//
////         Create airports
//        Airport otopeni = Airport.builder().airportName("Henri Coanda International Airport").build();
//        Airport heathrow = Airport.builder().airportName("London Heathrow Airport").build();
//        Airport charlesDeGaulle = Airport.builder().airportName("Charles de Gaulle International Airport").build();
//        Airport traianVuia = Airport.builder().airportName("Timisoara Traian Vuia Airport").build();
//
//
//
//        // Create cities
//        City bucuresti = City.builder().cityName("Bucuresti").airport(otopeni).airport(traianVuia).build();
//        City london = City.builder().cityName("London").build();
//        City paris = City.builder().cityName("Paris").build();
//        City timisoara = City.builder().cityName("Timisoara").build();
//
////        City bucuresti = new City("Buc");
////        City ldn = new City("Buc");
////        City prs = new City("Buc");
////        City tms = new City("Buc");
////
////        Airport otopeni = new Airport("Otopeni", bucuresti);
////        Airport heathrow = new Airport("Heat", ldn);
////        Airport charlesDeGaulle = new Airport("Char",prs);
////        Airport traianVuia = new Airport("Tra Vuia",tms);
//
////        List<Airplane> airplaneListTarom = Arrays.asList(b737,a300,b373);
////        List<Airplane> airplaneListB = Arrays.asList(b373,a320,b373);
////        List<Airplane> airplaneListF= Arrays.asList(b747,a300,b373);
////        List<Airplane> airplaneListW = Arrays.asList(b737,a340,b373);
//
//
//        //Create airlines
//        Airline tarom = Airline.builder().name("Tarom").build();
//        Airline britishAirways = Airline.builder().name("British Airways").build();
//        Airline airFrance = Airline.builder().name("Air France").build();
//        Airline wizzAir = Airline.builder().name("Wizz Air")
////                airplaneList(airplaneListW)
//                .build();
//
//        //Create airplanes
//        Airplane b373 = Airplane.builder().manufacturer("Boeing").model("B373")
//                .numberOfSeats((long) 160).speed(800).airline(tarom).build();
//        Airplane b737 = Airplane.builder().manufacturer("Boeing").airline(airFrance).model("B737")
//                .numberOfSeats((long) 180).speed(700).build();
//        Airplane b747 = Airplane.builder().manufacturer("Boeing").airline(britishAirways).model("B747")
//                .numberOfSeats((long) 200).speed(900).build();
//        Airplane b777 = Airplane.builder().manufacturer("Boeing").model("B777")
//                .numberOfSeats((long) 190).speed(750).airline(wizzAir).build();
//        Airplane a320 = Airplane.builder().manufacturer("Airbus").model("A320")
//                .numberOfSeats((long) 150).speed(800).airline(tarom).build();
//        Airplane a300 = Airplane.builder().manufacturer("Airbus").model("A300")
//                .numberOfSeats((long) 160).speed(800).airline(britishAirways).build();
//        Airplane a340 = Airplane.builder().manufacturer("Airbus").model("A340")
//                .numberOfSeats((long) 180).speed(900).airline(airFrance).build();
//
//
//
//
//
//        Flight flightOtoHeat = Flight.builder().date(LocalDate.of(2020, 11, 1))
//                .price((long) 30).departureTime(LocalTime.of(6, 30)).arrivalTime(LocalTime.of(9, 30))
//                .departureAirport(otopeni).arrivalAirport(heathrow).airline(tarom).build();
//
//        Flight flightOtoHeat2 = Flight.builder().date(LocalDate.of(2020, 11, 1))
//                .price((long) 35).departureTime(LocalTime.of(8, 30)).arrivalTime(LocalTime.of(11, 30))
//                .departureAirport(otopeni).arrivalAirport(heathrow).airline(britishAirways).build();
//
//        Flight flightOtoPar = Flight.builder().date(LocalDate.of(2020, 11, 1))
//                .price((long) 95).departureTime(LocalTime.of(10, 00)).arrivalTime(LocalTime.of(12, 00))
//                .departureAirport(otopeni).arrivalAirport(charlesDeGaulle).airline(airFrance).build();
//
//        Flight flightTimHeat = Flight.builder().date(LocalDate.of(2020, 11, 1))
//                .price((long) 80).departureTime(LocalTime.of(3, 30)).arrivalTime(LocalTime.of(6, 00))
//                .departureAirport(traianVuia).arrivalAirport(heathrow).airline(tarom).build();
//
//        Flight flightOtoTim = Flight.builder().date(LocalDate.of(2020, 11, 1))
//                .price((long) 60).departureTime(LocalTime.of(13, 00)).arrivalTime(LocalTime.of(14, 00))
//                .departureAirport(otopeni).arrivalAirport(traianVuia).airline(wizzAir).build();
//
//
//
//
//
//
//
//
//
//
//
//        cityRepository.save(bucuresti);
//        cityRepository.save(paris);
//        cityRepository.save(london);
//        cityRepository.save(timisoara);
//
//        airportRepository.save(otopeni);
//        airportRepository.save(heathrow);
//        airportRepository.save(charlesDeGaulle);
//        airportRepository.save(traianVuia);
//
//        airlineRepository.save(tarom);
//        airlineRepository.save(britishAirways);
//        airlineRepository.save(airFrance);
//        airlineRepository.save(wizzAir);
//
//        airplaneRepository.save(b373);
//        airplaneRepository.save(b737);
//        airplaneRepository.save(b747);
//        airplaneRepository.save(b777);
//        airplaneRepository.save(a320);
//        airplaneRepository.save(a300);
//        airplaneRepository.save(a340);
//
//        flightRepository.save(flightOtoHeat);
//        flightRepository.save(flightOtoHeat2);
//        flightRepository.save(flightOtoPar);
//        flightRepository.save(flightTimHeat);
//        flightRepository.save(flightOtoTim);
    }

}
