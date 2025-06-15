package com.example.scpv.dto.specie;

import java.math.BigDecimal;

public record SpecieResponseDTO(
        Long id,
        String speciesName,
        BigDecimal lossPercentage,
        BigDecimal netSalesPrice,
        BigDecimal grossPurchasePrice
) {
}