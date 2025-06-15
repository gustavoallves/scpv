package com.example.scpv.service;

import com.example.scpv.dto.specie.SpecieRequestDTO;
import com.example.scpv.dto.specie.SpecieResponseDTO;
import com.example.scpv.entity.Specie;
import com.example.scpv.exceptionhandler.NotFoundException;
import com.example.scpv.mapper.SpecieMapper;
import com.example.scpv.repository.SpecieRepository;
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

    public List<SpecieResponseDTO> findAllSpecies() {
        List<Specie> species = specieRepository.findAll();
        return specieMapper.toResponseList(species);
    }

    public SpecieResponseDTO findSpecieById(Long id) {
        Specie specie = specieRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Specie with " + id + " not found."));
        return specieMapper.toResponseDto(specie);
    }

    public SpecieResponseDTO createSpecie(SpecieRequestDTO specieRequestDTO) {
        Specie specieToSave = specieMapper.toEntity(specieRequestDTO);
        Specie specieSaved = specieRepository.save(specieToSave);
        return specieMapper.toResponseDto(specieSaved);
    }

}
