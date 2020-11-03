package com.codecool.flight_api_project.airline;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class AirlineRepository implements AirlineDao{

    private static List<Airline> DB = new ArrayList<>();


    public void populatedAirlinesList() throws IOException
    {
        ObjectMapper objectMapper = new ObjectMapper();
        DB = objectMapper.readValue(
                new File("src/main/resources/airlines.json"),
                new TypeReference<List<Airline>>(){});
    }



    public void insertAirline(Airline airline){
        DB.add(airline);
    }


    @Override
    public List<Airline> selectAllAirline() {
        return DB;
    }
}
