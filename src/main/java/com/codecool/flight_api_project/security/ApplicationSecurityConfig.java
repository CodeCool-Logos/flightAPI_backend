package com.codecool.flight_api_project.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class ApplicationSecurityConfig extends WebSecurityConfigurerAdapter {

    private final PasswordEncoder passwordEncoder;

    @Autowired
    public ApplicationSecurityConfig(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeRequests()
                .antMatchers("/api/v1/flights/{from}/{to}/{date}").permitAll()
                .antMatchers(HttpMethod.POST, "/api/v1/flights").hasRole("ADMIN")
                .antMatchers(HttpMethod.GET, "/users/list", "/users/{id}").hasRole("ADMIN")
                .antMatchers(HttpMethod.DELETE, "/api/v1/flights/{id}").hasRole("ADMIN")
                .antMatchers(HttpMethod.PUT, "/api/v1/flights/{id}").hasRole("ADMIN")

                .antMatchers(HttpMethod.POST, "/api/v1/cities").hasRole("ADMIN")
                .antMatchers(HttpMethod.GET, "/api/v1/cities").permitAll()
                .antMatchers(HttpMethod.DELETE, "/api/v1/cities/{id}").hasRole("ADMIN")
                .antMatchers(HttpMethod.PUT, "/api/v1/cities/{id}").hasRole("ADMIN")

                .antMatchers(HttpMethod.GET, "/api/v1/airports").permitAll()
                .antMatchers(HttpMethod.GET, "/api/v1/airports/{id}").hasRole("ADMIN")
                .antMatchers(HttpMethod.GET, "/api/v1/airports/iata/{iata_code}").hasRole("ADMIN")
                .antMatchers(HttpMethod.POST, "/api/v1/airports").hasRole("ADMIN")
                .antMatchers(HttpMethod.DELETE, "/api/v1/airports/{id}").hasRole("ADMIN")
                .antMatchers(HttpMethod.PUT, "/api/v1/airports/{id}").hasRole("ADMIN")

                .antMatchers(HttpMethod.GET, "/api/v1/airplanes").permitAll()
                .antMatchers(HttpMethod.POST, "/api/v1/airplanes").hasRole("ADMIN")
                .antMatchers(HttpMethod.DELETE, "/api/v1/airplanes/{id}").hasRole("ADMIN")
                .antMatchers(HttpMethod.PUT, "/api/v1/airplanes/{id}").hasRole("ADMIN")

                .antMatchers(HttpMethod.GET, "/api/v1/airlines").permitAll()
                .antMatchers(HttpMethod.POST, "/api/v1/airlines").hasRole("ADMIN")
                .antMatchers(HttpMethod.DELETE, "/api/v1/airlines/{id}").hasRole("ADMIN")
                .antMatchers(HttpMethod.PUT, "/api/v1/airlines/{id}").hasRole("ADMIN")
                .anyRequest()
                .denyAll()
                .and()
                .httpBasic();
    }

    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }


}
