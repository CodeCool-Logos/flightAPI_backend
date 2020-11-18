package com.codecool.flight_api_project.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import static com.codecool.flight_api_project.security.AppUserRoles.ADMIN;
import static com.codecool.flight_api_project.security.AppUserRoles.USER;

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
                .antMatchers("/api/v1/flights/{from}/{to}/{date}", "/users/login", "/users/register").permitAll()
                .antMatchers("/users/logout", "/users/get-user/{username}").authenticated()

                .antMatchers(HttpMethod.POST, "/api/v1/flights").hasRole("ADMIN")
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
                .antMatchers(HttpMethod.POST, "/api/v1/airplanes").hasRole(ADMIN.name())
                .antMatchers(HttpMethod.DELETE, "/api/v1/airplanes/{id}").hasRole("ADMIN")
                .antMatchers(HttpMethod.PUT, "/api/v1/airplanes/{id}").hasRole("ADMIN")

                .antMatchers(HttpMethod.GET, "/api/v1/airlines").permitAll()
                .antMatchers(HttpMethod.POST, "/api/v1/airlines").hasRole("ADMIN")
                .antMatchers(HttpMethod.DELETE, "/api/v1/airlines/{id}").hasRole("ADMIN")
                .antMatchers(HttpMethod.PUT, "/api/v1/airlines/{id}").hasRole("ADMIN")

                .antMatchers("/h2/**").permitAll()

                .anyRequest()
                .denyAll()
                .and().formLogin().loginPage("/users/register").permitAll()
                .and()
                .httpBasic();
    }

//    @Override
//    @Bean
//    protected UserDetailsService userDetailsService() {
//        UserDetails katy = User.builder()
//                .username("katy")
//                .password(passwordEncoder.encode("password123"))
////                .roles(ADMIN.name())
//                .authorities(ADMIN.getGrantedAuthorities())
//                .build();
//        UserDetails ion = User.builder()
//                .username("ion")
//                .password(passwordEncoder.encode("password"))
////                .roles(ADMIN.name())
//                .authorities(USER.getGrantedAuthorities())
//                .build();
//
//        return new InMemoryUserDetailsManager(
//                katy,
//                ion
//        );
//
//    }


}