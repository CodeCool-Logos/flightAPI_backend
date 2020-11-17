package com.codecool.flight_api_project.security;

public enum AppUserPermission {

    AIRLINES_READ("airlines:read"),
    AIRLINES_WRITE("airlines:write"),
    AIRPLANES_READ("airplanes:read"),
    AIRPLANES_WRITE("airplanes:write"),
    AIRPORTS_READ("airports:read"),
    AIRPORTS_WRITE("airports:write"),
    CITIES_READ("cities:read"),
    CITIES_WRITE("cities:write"),
    FLIGHTS_READ("flights:read"),
    FLIGHTS_WRITE("flights:write");

    private final String permission;

    AppUserPermission(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
