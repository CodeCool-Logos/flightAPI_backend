package com.codecool.flight_api_project.city;

import com.codecool.flight_api_project.airport.Airport;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="City")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Data
public class City
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="city_id")
    private Long cityId;

    @Column(name ="city_name")
    private String cityName;


//    @OneToMany(
//               cascade = CascadeType.ALL,
//               orphanRemoval = true,
//               mappedBy = "city")
//    private List<Airport> airportList;

}
