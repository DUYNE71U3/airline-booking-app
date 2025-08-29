package com.javapp.MainApiJava.entities;

import com.javapp.MainApiJava.enums.AuthMethod;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String email;

    private String phoneNumber;

    private String password;

    private boolean emailVerified;

    //FOR AUTH 2 authentication
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private AuthMethod provider;

    private String providerId;

    @ManyToMany(fetch = FetchType.EAGER) // Load User kèm với Role, có thể sử dụng Lazy để khỏi load Role
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private final List<Role> roles = new ArrayList<>();

    private boolean active;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private final List<Booking> bookings = new ArrayList<>();

    @Column(updatable = false)
    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
