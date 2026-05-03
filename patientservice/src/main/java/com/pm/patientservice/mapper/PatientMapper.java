package com.pm.patientservice.mapper;

import com.pm.patientservice.dto.PatientRequestDTO;
import com.pm.patientservice.dto.PatientResponseDTO;
import com.pm.patientservice.model.Patient;

import java.time.LocalDate;
import java.util.UUID;

public class PatientMapper {
    public static PatientResponseDTO toDTO(Patient patient) {
        return new PatientResponseDTO(
                patient.getId().toString(),
                patient.getName(),
                patient.getEmail(),
                patient.getAddress(),
                patient.getDateOfBirth().toString()
        );

    }

    public static Patient toModel(PatientRequestDTO patientRequestDTO) {
        return new Patient(
                null, // this will be automatically generated
                patientRequestDTO.getName(),
                patientRequestDTO.getEmail(),
                patientRequestDTO.getAddress(),
                LocalDate.parse(patientRequestDTO.getDateOfBirth()),
                LocalDate.now()
        );

    }

}
