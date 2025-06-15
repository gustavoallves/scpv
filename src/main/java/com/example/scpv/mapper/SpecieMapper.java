package com.example.scpv.mapper;

import com.example.scpv.dto.specie.SpecieRequestDTO;
import com.example.scpv.dto.specie.SpecieResponseDTO;
import com.example.scpv.entity.Specie;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SpecieMapper {

    Specie toEntity(SpecieRequestDTO specieRequestDTO);

    SpecieResponseDTO toResponseDto(Specie specie);

    List<SpecieResponseDTO> toResponseList(List<Specie> species);

}