package com.example.scpv.vessel.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record VesselRequestDTO(
        @NotNull(message = "Ton capacity cannot be null.")
        @DecimalMin(value = "0.01", message = "Ton capacity must be greater than zero.")
        int tonCapacity,
        @NotBlank(message = "Captaincy registration cannot be blank.")
        @Size(min = 5, max = 5, message = "Captaincy registration must have exactly 5 characters.")
        String captaincyRegistration
) {
}
