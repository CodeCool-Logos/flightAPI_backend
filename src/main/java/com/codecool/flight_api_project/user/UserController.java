package com.codecool.flight_api_project.user;


import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@AllArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

//    @GetMapping("/get-user/{username}")
//    public User returnUser(@PathVariable String username ) {
//        return userService.getUserByUsername(username);
//    }

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody RegisterRequest request) {
        return userService.register(request);
    }

    @PostMapping("/login")
    public ResponseEntity<String> loginUser(@RequestBody LoginRequest request, HttpSession session) {
        return userService.login(request,session);
    }

    @GetMapping("/logout")
    public void logoutUser(HttpSession session, HttpServletResponse response) throws IOException {
        session.removeAttribute("user");
        response.sendRedirect("/login");
    }

//    @Autowired
//    private final UserService userService;

//    public UserController(UserService userService) {
//        this.userService = userService;
//    }
//
//    @GetMapping("/list")
//    public List<User> list(){
//        System.out.println(userService.list());
//        return userService.list();
//    }


}
