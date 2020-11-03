package com.codecool.flight_api_project.city;

import com.codecool.flight_api_project.airport.Airport;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name="City")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class City
{
    @Id
    private String cityIataCode;
    private String countryIsoCode;
    private String cityName;

    @OneToMany(fetch = FetchType.EAGER,
               cascade = CascadeType.ALL,
               orphanRemoval = true,
               mappedBy = "city")
    private List<Airport> airportList =new ArrayList<>();




}
