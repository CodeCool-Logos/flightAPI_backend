package com.codecool.flight_api_project.user;


import net.bytebuddy.implementation.bind.annotation.Default;

import javax.persistence.*;
import java.util.Optional;

@Entity
@Table(name = "roles")
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private UserRoleEnum name = UserRoleEnum.ROLE_USER;

    public UserRole() {
    }

    public UserRole(UserRoleEnum name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public UserRoleEnum getName() {
        return name;
    }


}
