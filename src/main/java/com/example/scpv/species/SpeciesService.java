package com.example.scpv.species;

import com.example.scpv.exceptionhandler.NotFoundException;
import com.example.scpv.species.dto.SpeciesRequestDTO;
import com.example.scpv.species.dto.SpeciesResponseDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpeciesService {

    private final SpeciesRepository speciesRepository;
    private final SpeciesMapper speciesMapper;

    public SpeciesService(SpeciesRepository speciesRepository, SpeciesMapper speciesMapper) {
        this.speciesRepository = speciesRepository;
        this.speciesMapper = speciesMapper;
    }

    public SpeciesResponseDTO createSpecies(SpeciesRequestDTO speciesRequestDTO) {
        SpeciesEntity speciesEntityToSave = speciesMapper.toEntity(speciesRequestDTO);
        SpeciesEntity speciesEntitySaved = speciesRepository.save(speciesEntityToSave);
        return speciesMapper.toResponseDto(speciesEntitySaved);
    }

    public List<SpeciesResponseDTO> findAllSpecies() {
        List<SpeciesEntity> species = speciesRepository.findAll();
        return speciesMapper.toResponseList(species);
    }

    public SpeciesResponseDTO findSpeciesById(Long id) {
        SpeciesEntity speciesEntity = speciesRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Species with id " + id + " not found."));
        return speciesMapper.toResponseDto(speciesEntity);
    }

    public SpeciesResponseDTO updateSpecies(Long id, SpeciesRequestDTO speciesRequestDTO) {
        speciesRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Species with id " + id + " not found."));
        SpeciesEntity speciesEntityUpdate = speciesMapper.toEntity(speciesRequestDTO);
        speciesEntityUpdate.setId(id);
        SpeciesEntity speciesEntityUpdated = speciesRepository.save(speciesEntityUpdate);
        return speciesMapper.toResponseDto(speciesEntityUpdated);
    }

    public void deleteSpecies(Long id) {
        speciesRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Species with id " + id + " not found."));
        speciesRepository.deleteById(id);
    }

}