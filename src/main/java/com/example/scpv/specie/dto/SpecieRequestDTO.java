package com.example.scpv.specie.dto;

import jakarta.validation.constraints.*;

import java.math.BigDecimal;

public record SpecieRequestDTO(

        @NotBlank(message = "Species name cannot be blank.")
        @Size(min = 3, max = 100, message = "Species name must be between 3 and 100 characters.")
        String speciesName,

        @NotNull(message = "Loss percentage cannot be null.")
        @DecimalMin(value = "0.0", message = "Loss percentage cannot be negative.")
        @DecimalMax(value = "100.0", message = "Loss percentage cannot exceed 100.0.")
        BigDecimal lossPercentage,

        @NotNull(message = "Net sales price cannot be null.")
        @DecimalMin(value = "0.01", message = "Net sales price must be greater than zero.")
        BigDecimal netSalesPrice,

        @NotNull(message = "Gross purchase price cannot be null.")
        @DecimalMin(value = "0.01", message = "Gross purchase price must be greater than zero.")
        BigDecimal grossPurchasePrice
) {
}
