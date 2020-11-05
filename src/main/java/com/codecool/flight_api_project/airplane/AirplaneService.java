package com.codecool.flight_api_project.airplane;

public interface AirplaneService {

    Airplane saveAirplane(Airplane airplane);

    void deleteAirplaneByID(Long id);

    Airplane updateAirplaneById(Long id, Airplane airplaneToUpdate);
}
