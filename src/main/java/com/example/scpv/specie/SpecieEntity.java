package com.example.scpv.specie;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "species")
@NoArgsConstructor
@AllArgsConstructor
@Data
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

}

