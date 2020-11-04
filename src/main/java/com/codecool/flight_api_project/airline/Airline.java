package com.codecool.flight_api_project.airline;

import com.codecool.flight_api_project.airplane.Airplane;
import com.codecool.flight_api_project.flight.Flight;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Airline")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Airline
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name="iso")
    private String iso;

//    @OneToMany(
////            fetch = FetchType.EAGER,
//                cascade = CascadeType.ALL,
//                orphanRemoval = true,
//                mappedBy = "airline")
//    private List<Airplane> airplaneList =  new ArrayList<>();


//    @OneToMany(
//            fetch = FetchType.EAGER,
//            cascade = CascadeType.ALL,
//            orphanRemoval = true,
//            mappedBy = "airline"
//    )
//    private List<Flight> flights = new ArrayList<>();
}
