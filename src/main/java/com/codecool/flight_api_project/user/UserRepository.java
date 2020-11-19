package com.codecool.flight_api_project.user;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UserRepository  extends JpaRepository<User, Long> {

    User getById(long id);

    Optional<User> getByUsername(String username);

    User getByEmail(String email);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);


}
