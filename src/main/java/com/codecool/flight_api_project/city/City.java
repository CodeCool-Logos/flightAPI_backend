package com.codecool.flight_api_project.city;

import com.codecool.flight_api_project.airport.Airport;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="City")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class City
{
//    @Id
//    private String cityIataCode;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
//    private String countryIsoCode;
    private String cityName;

    @Singular("airport")
    @OneToMany(
            fetch = FetchType.EAGER,
               cascade = CascadeType.ALL,
               orphanRemoval = true,
               mappedBy = "city")
    private List<Airport> airportList =new ArrayList<>();

//    public City(String cityName) {
//        this.cityName = cityName;
//    }
//
//    public City() {
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public String getCityName() {
//        return cityName;
//    }
//
//    public List<Airport> getAirportList() {
//        return airportList;
//    }
}
