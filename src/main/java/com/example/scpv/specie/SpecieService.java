package com.example.scpv.specie;

import com.example.scpv.specie.dto.SpecieRequestDTO;
import com.example.scpv.specie.dto.SpecieResponseDTO;
import com.example.scpv.common.exception.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpecieService {

    private final SpecieRepository specieRepository;
    private final SpecieMapper specieMapper;

    public SpecieService(SpecieRepository specieRepository, SpecieMapper specieMapper) {
        this.specieRepository = specieRepository;
        this.specieMapper = specieMapper;
    }

    public SpecieResponseDTO createSpecie(SpecieRequestDTO specieRequestDTO) {
        SpecieEntity specieEntityToSave = specieMapper.toEntity(specieRequestDTO);
        SpecieEntity specieEntitySaved = specieRepository.save(specieEntityToSave);
        return specieMapper.toResponseDto(specieEntitySaved);
    }

    public List<SpecieResponseDTO> findAllSpecies() {
        List<SpecieEntity> species = specieRepository.findAll();
        return specieMapper.toResponseList(species);
    }

    public SpecieResponseDTO findSpecieById(Long id) {
        SpecieEntity specieEntity = specieRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Specie with id " + id + " not found."));
        return specieMapper.toResponseDto(specieEntity);
    }

}
