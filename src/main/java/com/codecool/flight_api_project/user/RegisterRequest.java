package com.codecool.flight_api_project.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class RegisterRequest {
    private String username,name, email, password, confirmPassword;
}
