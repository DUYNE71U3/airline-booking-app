package com.javapp.MainApiJava.repo;

import com.javapp.MainApiJava.entities.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepo extends JpaRepository<Passenger, Long> {

}
