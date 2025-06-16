package com.example.scpv.specie;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "species")
public class SpecieEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "species_name", nullable = false, unique = true)
    private String speciesName;

    @Column(name = "loss_percentage")
    private BigDecimal lossPercentage;

    @Column(name = "net_sales_price")
    private BigDecimal netSalesPrice;

    @Column(name = "gross_purchase_price", nullable = false)
    private BigDecimal grossPurchasePrice;

    public SpecieEntity() {
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

