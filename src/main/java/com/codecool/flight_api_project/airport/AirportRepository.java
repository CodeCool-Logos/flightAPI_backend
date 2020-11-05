package com.codecool.flight_api_project.airport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AirportRepository extends JpaRepository<Airport, String>
{


    @Query(value = "select * from Airport ", nativeQuery =true)
    List<Airport> getAllAirports();

}
