package com.example.scpv.specie;

import com.example.scpv.specie.dto.SpecieRequestDTO;
import com.example.scpv.specie.dto.SpecieResponseDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/species")
public class SpecieController {

    private final SpecieService specieService;

    public SpecieController(SpecieService specieService) {
        this.specieService = specieService;
    }

    @PostMapping()
    public ResponseEntity<SpecieResponseDTO> createSpecie(@Valid @RequestBody SpecieRequestDTO specieRequestDTO) {
        SpecieResponseDTO specieResponseDTO = specieService.createSpecie(specieRequestDTO);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(specieResponseDTO.id())
                .toUri();
        return ResponseEntity.created(location).body(specieResponseDTO);
    }

    @GetMapping("/list")
    public ResponseEntity<List<SpecieResponseDTO>> findAllSpecies() {
        return ResponseEntity.ok(specieService.findAllSpecies());
    }

    @GetMapping("/{id}")
    public ResponseEntity<SpecieResponseDTO> findSpecieById(@PathVariable Long id) {
        SpecieResponseDTO specieResponseDTO = specieService.findSpecieById(id);
        return ResponseEntity.ok(specieResponseDTO);
    }
}