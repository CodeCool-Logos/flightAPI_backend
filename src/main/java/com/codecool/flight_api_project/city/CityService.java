package com.codecool.flight_api_project.city;

import com.codecool.flight_api_project.airline.Airline;

public interface CityService {

    City saveCity(City city);

    void deleteCityById(Long id);

    City updateCityById(Long id,City cityToUpdate);

}
