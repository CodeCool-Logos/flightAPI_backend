package com.codecool.flight_api_project.security;

import com.google.common.collect.Sets;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Set;
import java.util.stream.Collectors;

import static com.codecool.flight_api_project.security.AppUserPermission.*;

public enum AppUserRoles {

    USER(Sets.newHashSet(
            AIRLINES_READ,
            AIRPLANES_READ,
            AIRPORTS_READ,
            CITIES_READ,
            FLIGHTS_READ
    )),
    ADMIN(Sets.newHashSet(
            AIRLINES_READ,
            AIRLINES_WRITE,
            AIRPLANES_READ,
            AIRLINES_WRITE,
            AIRPORTS_READ,
            AIRPLANES_WRITE,
            CITIES_READ,
            CITIES_WRITE,
            FLIGHTS_READ,
            FLIGHTS_WRITE
    ));

    private final Set<AppUserPermission> permissions;


    AppUserRoles(Set<AppUserPermission> permissions) {
        this.permissions = permissions;
    }


    public Set<AppUserPermission> getPermissions() {
        return permissions;
    }


    public Set<SimpleGrantedAuthority> getGrantedAuthorities() {
        Set<SimpleGrantedAuthority> permissions = getPermissions().stream()
                .map(permission -> new SimpleGrantedAuthority(permission.getPermission()))
                .collect(Collectors.toSet());
        permissions.add(new SimpleGrantedAuthority("ROLE_" + this.name()));
        return permissions;
    }
}
