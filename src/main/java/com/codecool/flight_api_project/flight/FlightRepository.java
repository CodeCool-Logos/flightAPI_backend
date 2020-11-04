package com.codecool.flight_api_project.flight;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long>
{

    @Query(value = "select * from Flight", nativeQuery=true)
    List<Flight> getAllFlightsFromDb();

    @Query(value = "select * from Flight where id = :id", nativeQuery=true)
        Flight getFlightById(@Param("id") Long id);
}
