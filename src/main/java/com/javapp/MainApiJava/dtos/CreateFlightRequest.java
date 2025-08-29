package com.javapp.MainApiJava.dtos;

import com.javapp.MainApiJava.enums.FlightStatus;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateFlightRequest {

    private long id;

    private FlightStatus status;

    @NotBlank(message = "Flight Number cannot be blank")
    private String flightNumber;

    @NotBlank(message = "Departure airport IATA code cannot be blank")
    private String departureAirportIataCode;

    @NotBlank(message = "arrival airport IATA code cannot be blank")
    private String arrivalAirportIataCode;

    @NotNull(message = "departureTime cannot be null")
    private LocalDateTime departureTime;

    @NotNull(message = "arrivalTime cannot be null")
    private LocalDateTime arrivalTime;

    @NotNull(message = "Base price cannot be null")
    @Positive(message = "Base price must be positive") // Base price phai la so Duong
    private BigDecimal basePrice;

    private long pilotId;
}
