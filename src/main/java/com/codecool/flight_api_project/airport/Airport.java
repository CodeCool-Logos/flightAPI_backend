package com.codecool.flight_api_project.airport;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Airport")
public class Airport {

    @Id
    private String airportIataCode;
    private String airportName;


    public Airport(String airportIataCode, String airportName) {
        this.airportIataCode = airportIataCode;
        this.airportName = airportName;
    }

    public Airport() {
    }

    public String getAirportIataCode() {
        return airportIataCode;
    }

    public String getAirportName() {
        return airportName;
    }

    @Override
    public String toString()
    {
        return "Airport{" +
                "airportIataCode='" + airportIataCode + '\'' +
                ", airportName='" + airportName + '\'' +
                '}';
    }
}
