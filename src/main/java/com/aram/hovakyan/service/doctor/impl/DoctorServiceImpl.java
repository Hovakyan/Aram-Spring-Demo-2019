package com.aram.hovakyan.service.doctor.impl;

import com.aram.hovakyan.common.doctor.DoctorCreationDTO;
import com.aram.hovakyan.common.doctor.DoctorDTO;
import com.aram.hovakyan.entity.DoctorEntity;
import com.aram.hovakyan.entity.PatientEntity;
import com.aram.hovakyan.repository.DoctorRepository;
import com.aram.hovakyan.repository.PatientRepository;
import com.aram.hovakyan.service.doctor.DoctorService;
import com.aram.hovakyan.service.doctor.converter.DoctorConverter;

import lombok.RequiredArgsConstructor;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;


@Component
@RequiredArgsConstructor
public class DoctorServiceImpl implements DoctorService {


    private final DoctorRepository doctorRepository;
    private final DoctorConverter doctorConverter;
    private final PatientRepository patientRepository;

    @Override
    public DoctorDTO get(final Long doctorId) {
        DoctorEntity doctorEntity = doctorRepository.getOne(doctorId);
        return doctorConverter.convertEntityToDTO(doctorEntity);
    }

    @Override
    public PageImpl<DoctorDTO> all(Pageable pageable) {
        final Page<DoctorEntity> entities = doctorRepository.findAll(pageable);
        return new PageImpl<>(doctorConverter.convert(entities));
    }

    @Override
    public DoctorDTO create(DoctorCreationDTO request) {
        DoctorEntity entity = doctorConverter.convertDTOTOEntity(request);
        entity = doctorRepository.save(entity);
        return doctorConverter.convertEntityToDTO(entity);
    }

    @Override
    public DoctorDTO getdoctorbtpatientid(Long id) {
        PatientEntity patientEntity = patientRepository.getOne(id);
        DoctorEntity doctorEntity = patientEntity.getDoctorEntity();
    return doctorConverter.convertEntityToDTO(doctorEntity);
    }
}
