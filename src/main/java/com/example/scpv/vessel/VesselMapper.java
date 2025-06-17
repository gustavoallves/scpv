package com.example.scpv.vessel;

import com.example.scpv.vessel.dto.VesselRequestDTO;
import com.example.scpv.vessel.dto.VesselResponseDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface VesselMapper {
    VesselEntity toEntity(VesselRequestDTO vesselRequestDTO);

    VesselResponseDTO toResponse(VesselEntity vesselEntity);
}