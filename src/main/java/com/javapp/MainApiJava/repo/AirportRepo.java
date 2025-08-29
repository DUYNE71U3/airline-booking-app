package com.javapp.MainApiJava.repo;

import com.javapp.MainApiJava.entities.Airport;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AirportRepo extends JpaRepository<Airport, Long> {

    Optional<Airport> findByIataCode(String iataCode);
}
