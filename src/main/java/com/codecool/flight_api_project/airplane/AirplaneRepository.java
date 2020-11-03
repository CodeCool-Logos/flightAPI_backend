package com.codecool.flight_api_project.airplane;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class AirplaneRepository implements AirplaneDAO{

    private static  List<Airplane> DB = new ArrayList<>();

    public void populatedAirplanesList() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        DB = objectMapper.readValue(
                new File("src/main/resources/airplanes.json"),
                new TypeReference<List<Airplane>>(){});
    }

    public void insertAirplane(Airplane airplane) {
        DB.add(airplane);
    }

    @Override
    public List<Airplane> selectAllAirplanes() {
        return DB;
    }
}
