package com.example.scpv.vessel;

import com.example.scpv.common.exception.NotFoundException;
import com.example.scpv.vessel.dto.VesselRequestDTO;
import com.example.scpv.vessel.dto.VesselResponseDTO;
import org.springframework.stereotype.Service;

@Service
public class VesselService {
    private final VesselRepository vesselRepository;
    private final VesselMapper vesselMapper;

    public VesselService(VesselRepository vesselRepository, VesselMapper vesselMapper) {
        this.vesselRepository = vesselRepository;
        this.vesselMapper = vesselMapper;
    }

    public VesselResponseDTO createVessel(VesselRequestDTO vesselRequestDTO) {
        VesselEntity vesselEntityToSave = vesselMapper.toEntity(vesselRequestDTO);
        VesselEntity vesselEntitySaved = vesselRepository.save(vesselEntityToSave);
        return vesselMapper.toResponse(vesselEntitySaved);
    }

    public VesselResponseDTO findVesselById(Long id) {
        VesselEntity vesselEntity = vesselRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Vessel with id " + id + " not found."));
        return vesselMapper.toResponse(vesselEntity);
    }

    public VesselResponseDTO updateVessel(Long id, VesselRequestDTO vesselRequestDTO) {
        vesselRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Vessel with id " + id + " not found."));
        VesselEntity vesselUpdate = vesselMapper.toEntity(vesselRequestDTO);
        vesselUpdate.setId(id);
        VesselEntity vesselUpdated = vesselRepository.save(vesselUpdate);
        return vesselMapper.toResponse(vesselUpdated);
    }

    public void deleteVessel(Long id) {
        vesselRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Vessel with id " + id + " not found."));
        vesselRepository.deleteById(id);
    }

}