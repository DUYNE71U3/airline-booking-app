package com.javapp.MainApiJava.dtos;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateBookingRequest {

    @NotNull(message = "Flight Id cannot be null")
    private long flightId;

    @NotEmpty(message = "At least one passenger must be provided")
    private List<PassengerDTO> passengers;
}
