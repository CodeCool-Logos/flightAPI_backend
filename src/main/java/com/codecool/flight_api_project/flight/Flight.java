package com.codecool.flight_api_project.flight;

import com.codecool.flight_api_project.airline.Airline;
import com.codecool.flight_api_project.city.City;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;


@Entity
@Table(name = "Flight")
public class Flight
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDate date;

    public Flight(LocalDate date)
    {
        this.date = date;
    }

    public Flight()
    {
    }


    public Long getId() { return this.id; }
    public LocalDate getDate()
    {
        return date;
    }

    @Override
    public String toString()
    {
        return "Flight{" +
                "id=" + id +
                ", date=" + date +
                '}';
    }
}
