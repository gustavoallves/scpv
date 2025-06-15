package com.example.scpv.dto.specie;

import jakarta.validation.constraints.*;

import java.math.BigDecimal;

public record SpecieRequestDTO(

        @NotBlank(message = "Name can't be null.")
        @Size(min = 3, max = 100)
        String speciesName,

        @NotNull(message = "Loss percentage can't be null.")
        @DecimalMin(value = "0.0", message = "Loss percentage can't be negative.")
        @DecimalMax(value = "100.0", message = "Loss percentage can't be more than 100.")
        BigDecimal lossPercentage,

        @NotNull(message = "Net sales price can't be null.")
        @DecimalMin(value = "0.1", message = "Net sales price can't be negative.")
        BigDecimal netSalesPrice,

        @NotNull(message = "Gross purchase price can't be null.")
        @DecimalMin(value = "0.1", message = "Gross purchase price can't be negative.")
        BigDecimal grossPurchasePrice
) {
}
