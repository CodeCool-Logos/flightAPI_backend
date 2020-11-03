package com.codecool.flight_api_project.user;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@Repository
public class UserRepository {



    private static List<User> DB = new ArrayList<>();

    public void populatedUsersList() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        DB = objectMapper.readValue(
                new File("src/main/resources/data.json"),
                new TypeReference<List<User>>(){});
    }

    public void insertUser(User user){
        DB.add(user);
    }


    public List<User> findAll(){
        return DB;
    }
}
