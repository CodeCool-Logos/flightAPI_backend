//package com.codecool.flight_api_project.security;
//
//import com.codecool.flight_api_project.user.User;
//import com.codecool.flight_api_project.user.UserRepository;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Component;
//
//import java.util.Arrays;
//import java.util.stream.Collectors;
//
//@Component
//public class CustomUserDetailsService implements UserDetailsService {
//
//    private UserRepository users;
//
//    public CustomUserDetailsService(UserRepository users) {
//        this.users = users;
//    }
//
//    /**
//     * Loads the user from the DB and converts it to Spring Security's internal User object.
//     * Spring will call this code to retrieve a user upon login from the DB.
//     */
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User userApp = users.getByUsername(username)
//                .orElseThrow(() -> new UsernameNotFoundException("Username: " + username + " not found"));
////        String userRole = (String) userApp.getUserRole();
//        System.out.println(userApp.getRole());
//
//        return new User(userApp.getUsername(), userApp.getPassword(),
//                Arrays.asList(userApp.getRole()).stream().map(SimpleGrantedAuthority::new).collect(Collectors.toList()));    }
//}
