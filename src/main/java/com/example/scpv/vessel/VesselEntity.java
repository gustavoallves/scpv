package com.example.scpv.vessel;

import jakarta.persistence.*;

@Entity
@Table(name = "vessels")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "vessel_type")
public class VesselEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "ton_capacity", nullable = false)
    private int tonCapacity;
    @Column(name = "captaincy_registration", nullable = false)
    private String captaincyRegistration;

    public VesselEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getTonCapacity() {
        return tonCapacity;
    }

    public void setTonCapacity(int tonCapacity) {
        this.tonCapacity = tonCapacity;
    }

    public String getCaptaincyRegistration() {
        return captaincyRegistration;
    }

    public void setCaptaincyRegistration(String captaincyRegistration) {
        this.captaincyRegistration = captaincyRegistration;
    }
}
