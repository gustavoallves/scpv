package com.example.scpv.specie.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SpecieDTO {

    private Long id;
    private String speciesName;
    private BigDecimal lossPercentage;
    private BigDecimal netSalesPrice;
    private BigDecimal grossPurchasePrice;

}