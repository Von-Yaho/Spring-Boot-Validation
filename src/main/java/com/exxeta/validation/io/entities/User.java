package com.exxeta.validation.io.entities;

import com.exxeta.validation.exception.UniqueEmail;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    @Size(min = 3, max = 10)
    private String username;

    @NotNull
    @Email
    @UniqueEmail
    @NotBlank
    private String email;

    @NotNull
    @NotBlank
    private String password;
}
