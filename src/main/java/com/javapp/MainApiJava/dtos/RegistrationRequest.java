package com.javapp.MainApiJava.dtos;

import com.javapp.MainApiJava.entities.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.List;

@Data
public class RegistrationRequest {

    @NotBlank(message = "Full Name cannot be blank")
    private String name;

    @NotBlank(message = "Email Address cannot be blank")
    @Email(message = "Invalid email format")
    private String email;

    @NotBlank(message = "Password cannot be blank")
    @Size(min = 3, message = "Password must be at least 3 characters long")
    private String password;

    private String phoneNumber;

    private List<Role> roles;
}
