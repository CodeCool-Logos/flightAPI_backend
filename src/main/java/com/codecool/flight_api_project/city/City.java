package com.codecool.flight_api_project.city;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name="City")
public class City
{
    @Id
    private String cityIataCode;
    private String countryIsoCode;
    private String cityName;

    public City(String cityIataCode, String countryIsoCode, String cityName) {
        this.cityIataCode = cityIataCode;
        this.countryIsoCode = countryIsoCode;
        this.cityName = cityName;
    }

    public City() {
    }

    public String getCityIataCode() {
        return cityIataCode;
    }

    public String getCountryIsoCode() {
        return countryIsoCode;
    }

    public String getCityName() {
        return cityName;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return Objects.equals(cityIataCode, city.cityIataCode);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(cityIataCode);
    }

    @Override
    public String toString()
    {
        return "City{" +
                "cityIataCode='" + cityIataCode + '\'' +
                ", countryIsoCode='" + countryIsoCode + '\'' +
                ", cityName='" + cityName + '\'' +
                '}';
    }
}
