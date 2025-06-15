package com.example.scpv.specie;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
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

}
