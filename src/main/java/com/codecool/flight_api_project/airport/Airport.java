package com.codecool.flight_api_project.airport;

import com.codecool.flight_api_project.city.City;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="Airport")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Airport {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long airportIataCode;
    private String airportName;

//    @ManyToOne
//    @JoinColumn(name = "city_id")
//    private City city;

//    public Airport(String airportName, City city) {
//        this.airportName = airportName;
//        this.city = city;
//    }
//
//    public Airport() {
//    }
//
//    public Long getAirportIataCode() {
//        return airportIataCode;
//    }
//
//    public String getAirportName() {
//        return airportName;
//    }
//
//    public City getCity() {
//        return city;
//    }
}
