package com.example.scpv.specie.dto;

import java.math.BigDecimal;

public record SpecieResponseDTO(
        Long id,
        String speciesName,
        BigDecimal lossPercentage,
        BigDecimal netSalesPrice,
        BigDecimal grossPurchasePrice
) {
}