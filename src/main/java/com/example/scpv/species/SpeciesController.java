package com.example.scpv.species;

import com.example.scpv.species.dto.SpeciesRequestDTO;
import com.example.scpv.species.dto.SpeciesResponseDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/species")
public class SpeciesController {
    private final SpeciesService speciesService;

    public SpeciesController(SpeciesService speciesService) {
        this.speciesService = speciesService;
    }

    @PostMapping()
    public ResponseEntity<SpeciesResponseDTO> createSpecies(@Valid @RequestBody SpeciesRequestDTO speciesRequestDTO) {
        SpeciesResponseDTO speciesResponseDTO = speciesService.createSpecies(speciesRequestDTO);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(speciesResponseDTO.id())
                .toUri();
        return ResponseEntity.created(location).body(speciesResponseDTO);
    }

    @GetMapping()
    public ResponseEntity<List<SpeciesResponseDTO>> findAllSpecies() {
        return ResponseEntity.ok(speciesService.findAllSpecies());
    }

    @GetMapping("/{id}")
    public ResponseEntity<SpeciesResponseDTO> findSpeciesById(@PathVariable Long id) {
        SpeciesResponseDTO speciesResponseDTO = speciesService.findSpeciesById(id);
        return ResponseEntity.ok(speciesResponseDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<SpeciesResponseDTO> updateSpecies(@Valid @PathVariable Long id, @RequestBody SpeciesRequestDTO speciesRequestDTO) {
        SpeciesResponseDTO speciesResponseDTO = speciesService.updateSpecies(id, speciesRequestDTO);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(speciesResponseDTO.id())
                .toUri();
        return ResponseEntity.created(location).body(speciesResponseDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteSpecies(@PathVariable Long id) {
        speciesService.deleteSpecies(id);
        return ResponseEntity.ok("Species deleted.");
    }
}