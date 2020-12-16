package com.codecool.flight_api_project.cart;
import com.codecool.flight_api_project.flight.Flight;
import com.codecool.flight_api_project.user.User;

import javax.annotation.processing.Generated;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = 'flight_id')
    private Long id;

    @OneToOne
    @Column(name = 'user_Id')
    private User userId;

    @OneToMany
    @Column(name = 'flights')
    private List<Flight> flightList = new ArrayList<>();





    public Cart() {

    }

    public Cart(Long id, User userId, List<Flight> flightList) {
        this.id = id;
        this.userId = userId;
        this.flightList = flightList;
    }

    public Long getId() {
        return id;
    }

    public User getUserId() {
        return userId;
    }

    public List<Flight> getFlightList() {
        return flightList;
    }
}
