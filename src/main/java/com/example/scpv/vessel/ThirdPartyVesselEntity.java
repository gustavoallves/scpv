package com.example.scpv.vessel;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("THIRD_PARTY")
public class ThirdPartyVesselEntity extends VesselEntity {

    private String proprietaryCode;

    public ThirdPartyVesselEntity() {
    }

    public String getProprietaryCode() {
        return proprietaryCode;
    }

    public void setProprietaryCode(String proprietaryCode) {
        this.proprietaryCode = proprietaryCode;
    }
}
