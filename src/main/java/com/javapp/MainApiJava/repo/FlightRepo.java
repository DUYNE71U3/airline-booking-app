package com.javapp.MainApiJava.repo;

import com.javapp.MainApiJava.entities.Flight;
import com.javapp.MainApiJava.enums.FlightStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface FlightRepo extends JpaRepository<Flight, Long> {

    Optional<Flight> existsByFlightNumber(String flightNumber);

    List<Flight> findByDepartureAirportIataCodeAndArrivalAirportIataCodeAndStatusAndDepartureTimeBetween(
      String departureIataCode,
      String arrivalIataCode,
      FlightStatus status,
      LocalDateTime startOfDay,
      LocalDateTime endOfDay
    );
}
