package com.codecool.flight_api_project.airplane;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="Airplane")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Airplane
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String manufacturer;
    private String model;
    private Long numberOfSeats;
    private double speed;

//    @ManyToOne
//    @JoinColumn(name = "airline_id")
////    @JsonIgnore
//    private Airline airline;

}