package com.example.scpv.vessel.dto;

public record VesselResponseDTO(
        Long id,
        int tonCapacity,
        String captaincyRegistration
) {
}
