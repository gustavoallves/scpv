package com.example.scpv.specie;

import com.example.scpv.specie.dto.SpecieRequestDTO;
import com.example.scpv.specie.dto.SpecieResponseDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SpecieMapper {

    SpecieEntity toEntity(SpecieRequestDTO specieRequestDTO);

    SpecieResponseDTO toResponseDto(SpecieEntity specieEntity);

    List<SpecieResponseDTO> toResponseList(List<SpecieEntity> species);

}