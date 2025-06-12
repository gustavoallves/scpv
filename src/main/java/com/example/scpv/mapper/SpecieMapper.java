package com.example.scpv.mapper;

import com.example.scpv.dto.SpecieDTO;
import com.example.scpv.entity.Specie;
import org.springframework.stereotype.Component;

@Component
public class SpecieMapper {

    public Specie map(SpecieDTO specieDTO) {
        Specie specie = new Specie();
        specie.setId(specieDTO.getId());
        specie.setSpeciesName(specieDTO.getSpeciesName());
        specie.setLossPercentage(specieDTO.getLossPercentage());
        specie.setNetSalesPrice(specieDTO.getNetSalesPrice());
        specie.setGrossPurchasePrice(specieDTO.getGrossPurchasePrice());

        return specie;
    }

    public SpecieDTO map(Specie specie) {
        SpecieDTO specieDTO = new SpecieDTO();
        specieDTO.setId(specie.getId());
        specieDTO.setSpeciesName(specie.getSpeciesName());
        specieDTO.setLossPercentage(specie.getLossPercentage());
        specieDTO.setNetSalesPrice(specie.getNetSalesPrice());
        specieDTO.setGrossPurchasePrice(specie.getGrossPurchasePrice());

        return specieDTO;
    }
}