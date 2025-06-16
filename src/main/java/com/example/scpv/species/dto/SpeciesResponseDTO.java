package com.example.scpv.species.dto;

import java.math.BigDecimal;

public record SpeciesResponseDTO(
        Long id,
        String speciesName,
        BigDecimal lossPercentage,
        BigDecimal netSalesPrice,
        BigDecimal grossPurchasePrice
) {
}