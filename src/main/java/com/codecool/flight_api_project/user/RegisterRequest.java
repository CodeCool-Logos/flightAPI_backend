package com.codecool.flight_api_project.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.management.relation.Role;
import java.util.Set;

@AllArgsConstructor
@Setter
@Getter
public class RegisterRequest {
    private String username,name, email, password, confirmPassword;
    private Set<String> roles;
}
