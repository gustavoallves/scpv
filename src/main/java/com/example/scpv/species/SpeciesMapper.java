package com.example.scpv.species;

import com.example.scpv.species.dto.SpeciesRequestDTO;
import com.example.scpv.species.dto.SpeciesResponseDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SpeciesMapper {
    SpeciesEntity toEntity(SpeciesRequestDTO speciesRequestDTO);

    SpeciesResponseDTO toResponseDto(SpeciesEntity speciesEntity);

    List<SpeciesResponseDTO> toResponseList(List<SpeciesEntity> species);
}