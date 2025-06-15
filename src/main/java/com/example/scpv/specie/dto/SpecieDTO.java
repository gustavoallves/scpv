package com.example.scpv.specie.dto;

import lombok.*;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class SpecieDTO {

    private Long id;
    private String speciesName;
    private BigDecimal lossPercentage;
    private BigDecimal netSalesPrice;
    private BigDecimal grossPurchasePrice;

}