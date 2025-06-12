package com.example.scpv.dto;

import java.math.BigDecimal;

public class SpecieDTO {

    private Long id;
    private String speciesName;
    private BigDecimal lossPercentage;
    private BigDecimal netSalesPrice;
    private BigDecimal grossPurchasePrice;

    public SpecieDTO() {
    }

    public SpecieDTO(String speciesName, BigDecimal lossPercentage, BigDecimal netSalesPrice, BigDecimal grossPurchasePrice) {
        this.speciesName = speciesName;
        this.lossPercentage = lossPercentage;
        this.netSalesPrice = netSalesPrice;
        this.grossPurchasePrice = grossPurchasePrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public void setSpeciesName(String speciesName) {
        this.speciesName = speciesName;
    }

    public BigDecimal getLossPercentage() {
        return lossPercentage;
    }

    public void setLossPercentage(BigDecimal lossPercentage) {
        this.lossPercentage = lossPercentage;
    }

    public BigDecimal getNetSalesPrice() {
        return netSalesPrice;
    }

    public void setNetSalesPrice(BigDecimal netSalesPrice) {
        this.netSalesPrice = netSalesPrice;
    }

    public BigDecimal getGrossPurchasePrice() {
        return grossPurchasePrice;
    }

    public void setGrossPurchasePrice(BigDecimal grossPurchasePrice) {
        this.grossPurchasePrice = grossPurchasePrice;
    }
}
