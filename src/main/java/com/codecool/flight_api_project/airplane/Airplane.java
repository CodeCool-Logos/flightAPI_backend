package com.codecool.flight_api_project.airplane;

import javax.persistence.*;

@Entity
@Table(name="Airplane")
public class Airplane
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String manufacturer;
    private String model;
    private int numberOfSeats;
    private double speed;

    public Airplane(String manufacturer, String model, int numberOfSeats, double speed) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.numberOfSeats = numberOfSeats;
        this.speed = speed;
    }

    public Airplane() {
    }

    public Long getId() {
        return id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public double getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("AirplaneModel{");
        sb.append("id=").append(id);
        sb.append(", manufacturer='").append(manufacturer).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", numberOfSeats=").append(numberOfSeats);
        sb.append(", speed=").append(speed);
        sb.append('}');
        return sb.toString();
    }
}