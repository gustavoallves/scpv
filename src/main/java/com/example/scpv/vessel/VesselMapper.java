package com.example.scpv.vessel;

import com.example.scpv.vessel.dto.*;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface VesselMapper {
    VesselEntity toEntity(VesselRequestDTO vesselRequestDTO);
    VesselResponseDTO toResponse(VesselEntity vesselEntity);

    OwnedVesselEntity toEntity(OwnedVesselRequestDTO ownedVesselRequestDTO);
    OwnedVesselResponseDTO toResponse(OwnedVesselEntity ownedVesselEntity);

    ThirdPartyVesselEntity toEntity(ThirdPartyVesselRequestDTO thirdPartyVesselRequestDTO);
    ThirdPartyVesselResponseDTO toResponse(ThirdPartyVesselEntity thirdPartyVesselEntity);
}