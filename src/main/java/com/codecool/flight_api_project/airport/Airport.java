package com.codecool.flight_api_project.airport;

import com.codecool.flight_api_project.city.City;
import com.codecool.flight_api_project.flight.Flight;
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
    private String airportIataCode;
    private String airportName;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;




}
