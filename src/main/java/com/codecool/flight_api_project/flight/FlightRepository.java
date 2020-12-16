package com.codecool.flight_api_project.flight;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long>
{
    @Query(value = "select\n" +
            "       f.flight_id,\n" +
            "       f.arrival_time,\n" +
            "       f.departure_time,\n" +
            "       f.price,\n" +
            "       f.departure_date,\n" +
            "       f.airline_id,\n" +
            "       f.arrival_airport_id,\n" +
            "       f.departure_airport_id,\n" +
            "       airport1.airport_name as departure_airport,\n" +
            "       airport2.airport_name as arrival_airport,\n" +
            "       airline.name as airline_name\n" +
            "from flight f\n" +
            "join airport airport1 on airport1.airport_id = f.departure_airport_id\n" +
            "join airport airport2 on airport2.airport_id = f.arrival_airport_id\n" +
            "join airline on f.airline_id = airline.id\n" +
            "\n" +
            "where airport1.airport_name like %:from%\n" +
            "  and airport2.airport_name like %:to%\n" +
            "  and f.departure_date = :date", nativeQuery = true)
    List<Flight> getFlightByParams(@Param("from") String from, @Param("to") String to
            , @Param("date") LocalDate date
    );
}
