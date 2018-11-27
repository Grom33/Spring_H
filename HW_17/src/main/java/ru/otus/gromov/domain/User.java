package ru.otus.gromov.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "lib_User")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank
    @Column(name = "USERNAME", nullable = false, length = 100)
    private String userName;

    @NotBlank
    @Column(name = "PASSWORD", nullable = false, length = 100)
    private String password;

    public User() {
    }

    public User(@NotBlank String userName, @NotBlank String password) {
        this.userName = userName;
        this.password = password;
    }
}