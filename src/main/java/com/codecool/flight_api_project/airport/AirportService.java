package com.codecool.flight_api_project.airport;

public interface AirportService {

    Airport saveAirport(Airport airport);

    void deleteAirportById(Long id);

    Airport updateAirportById(Long id, Airport airportToUpdate);
}
