package com.example.scpv.vessel;

import com.example.scpv.vessel.dto.VesselRequestDTO;
import com.example.scpv.vessel.dto.VesselResponseDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/vessels")
public class VesselController {
    private final VesselService vesselService;

    public VesselController(VesselService vesselService) {
        this.vesselService = vesselService;
    }

    @PostMapping()
    public ResponseEntity<VesselResponseDTO> createVessel(@Valid @RequestBody VesselRequestDTO vesselRequestDTO) {
        VesselResponseDTO vesselResponseDTO = vesselService.createVessel(vesselRequestDTO);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(vesselResponseDTO.id())
                .toUri();
        return ResponseEntity.created(location).body(vesselResponseDTO);
    }

    @GetMapping("/{id}")
    public ResponseEntity<VesselResponseDTO> findVesselById(@PathVariable Long id) {
        VesselResponseDTO vesselResponseDTO = vesselService.findVesselById(id);
        return ResponseEntity.ok(vesselResponseDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<VesselResponseDTO> updateVessel(@PathVariable Long id, @Valid @RequestBody VesselRequestDTO vesselRequestDTO) {
        VesselResponseDTO vesselResponseDTO = vesselService.updateVessel(id, vesselRequestDTO);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(vesselResponseDTO.id())
                .toUri();
        return ResponseEntity.created(location).body(vesselResponseDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteVessel(@PathVariable Long id) {
        vesselService.deleteVessel(id);
        return ResponseEntity.ok("Vessel deleted.");
    }
}
