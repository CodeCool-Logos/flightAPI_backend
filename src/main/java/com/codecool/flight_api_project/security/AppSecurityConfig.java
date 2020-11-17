package com.codecool.flight_api_project.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import static com.codecool.flight_api_project.security.AppUserPermission.*;
import static com.codecool.flight_api_project.security.AppUserRoles.*;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class AppSecurityConfig extends WebSecurityConfigurerAdapter {

    private final PasswordEncoder passwordEncoder;


    @Autowired
    public AppSecurityConfig(PasswordEncoder passwordEncoder){
        this.passwordEncoder = passwordEncoder;
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
        .authorizeRequests()
                .antMatchers(HttpMethod.DELETE, "/api/**").hasAnyAuthority(
                                                                            AIRLINES_WRITE.getPermission(),
                                                                            AIRPLANES_WRITE.getPermission(),
                                                                            AIRPORTS_WRITE.getPermission(),
                                                                            FLIGHTS_WRITE.getPermission(),
                                                                            CITIES_WRITE.getPermission())
                .antMatchers(HttpMethod.PUT, "/api/**").hasAnyAuthority(
                                                                            AIRLINES_WRITE.getPermission(),
                                                                            AIRPLANES_WRITE.getPermission(),
                                                                            AIRPORTS_WRITE.getPermission(),
                                                                            FLIGHTS_WRITE.getPermission(),
                                                                            CITIES_WRITE.getPermission())
                .antMatchers(HttpMethod.POST, "/api/**").hasAnyAuthority(
                                                                            AIRLINES_WRITE.getPermission(),
                                                                            AIRPLANES_WRITE.getPermission(),
                                                                            AIRPORTS_WRITE.getPermission(),
                                                                            FLIGHTS_WRITE.getPermission(),
                                                                            CITIES_WRITE.getPermission())
                .antMatchers(HttpMethod.GET, "/api/**").hasAnyAuthority(
                                                                            AIRLINES_READ.getPermission(),
                                                                            AIRPLANES_READ.getPermission(),
                                                                            AIRPORTS_READ.getPermission(),
                                                                            FLIGHTS_READ.getPermission(),
                                                                            CITIES_READ.getPermission())
                .anyRequest()
                .authenticated()
                .and()
                .httpBasic();
    }

    @Override
    @Bean
    protected UserDetailsService userDetailsService(){
        UserDetails sorin = User.builder()
                .username("sorin")
                .password(passwordEncoder.encode("password"))
//                .roles(ADMIN.name())
                .authorities(ADMIN.getGrantedAuthorities())
                .build();

        UserDetails mark = User.builder()
                .username("mark")
                .password(passwordEncoder.encode("password"))
//                .roles(ADMIN.name())
                .authorities(USER.getGrantedAuthorities())
                .build();

        return new InMemoryUserDetailsManager(
                sorin,
                mark
        );
    }
}
