package com.javapp.MainApiJava.repo;

import com.javapp.MainApiJava.entities.EmailNotification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailNotificationRepo extends JpaRepository<EmailNotification, Long> {
}
