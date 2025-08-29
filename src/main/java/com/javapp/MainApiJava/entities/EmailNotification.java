package com.javapp.MainApiJava.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "emailNotifications")
@AllArgsConstructor
@NoArgsConstructor
public class EmailNotification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String subject;

    @NotBlank(message = "recipient is required")
    private String recipientEmail;

    @Lob
    private String body;

    @ManyToOne
    @JoinColumn(name = "booking_id")
    private Booking booking;

    private LocalDateTime sentAt;

    private Boolean isHtml;
}
